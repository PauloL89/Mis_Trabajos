
package Controlador;

import DTO.DtoOferta;
import Modelo.Oferta;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Gestor 
{
    private String CONN = "jdbc:sqlserver://DESKTOP-B80K3K5:1433;databaseName=ProductoDB";
    private String USER = "sa";
    private String PASS = "sa";
    Connection con = null;
    
    
    
     public void abrirConexion()
    {
        
        try 
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            
            con = DriverManager.getConnection(CONN,USER,PASS);
            
            
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
     
    
     public void cerrarConexion()
    {
        try 
        {
            if(con != null && !con.isClosed())
            con.close();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    } 
    
    
    //CARGA DE OFERTAS
     public void agregarOferta(Oferta oferta)
    {
        
        try 
        {
            abrirConexion();
            
            PreparedStatement st = con.prepareStatement("INSERT INTO Oferta(IdProducto,precioNormal,precioOfeta,stockDisponible,fechaInicioOferta,diasVigencia)"
                                                            + "VALUES(?,?,?,?,?,?)");
            
              st.setInt(1,oferta.getProducto().getIdProducto());
              st.setDouble(2,oferta.getPrecioNormal());
              st.setDouble(3,oferta.getPrecioOferta());
              st.setInt(4,oferta.getStockDisponible());
              st.setString(5,oferta.getFechaInicioOferta());
              st.setInt(6,oferta.getDiasVigencia());
              
              st.executeUpdate();
              st.close();
                    
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            cerrarConexion();
        }
        
    }
    
    
     
     
     //LISTADO DE OFERTAS MOSTRANDO EL NOMBRE DEL PRODUCTO ASOCIADO
     
     public ArrayList<DtoOferta> obtenerListadoOfertas()
    {
        ArrayList<DtoOferta> lista = new ArrayList<>();
       
        try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("EXEC listadoOferta");
            
              while (rs.next()) 
              {
                  double precioNormal = rs.getDouble("precioNormal");
                  double precioOferta = rs.getDouble("precioOfeta");
                  int stockDisponible = rs.getInt("stockDisponible");
                  String fechaInicioOferta = rs.getString("fechaInicioOferta");
                  int diasVigencia = rs.getInt("diasVigencia");
                  String nombre = rs.getString("Nombre");

                  
                  Producto p = new Producto(0, nombre);
                  
                  DtoOferta oferta = new DtoOferta(stockDisponible, diasVigencia, precioNormal, precioOferta, fechaInicioOferta, p);
                  lista.add(oferta);
              }
              st.close();
              rs.close();
                    
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            cerrarConexion();
        }
        
        
        return lista;
    }
    
     
     
     
     
     
//Monto total que no se ganó por haber tenido en oferta un artículo determinado
     
      public double TotalNoGanadoPorProductoEnOferta(int IdProducto)
    {
        double total = 0;
        String consultaSql = "SELECT SUM((precioNormal - precioOfeta) * stockDisponible) FROM oferta WHERE IdProducto = ?";
        try 
        {
            abrirConexion();
            
            PreparedStatement ps = con.prepareStatement(consultaSql);
            
            ps.setInt(1, IdProducto);
            ResultSet rs = ps.executeQuery();
            
            rs.next();
            total = rs.getDouble(1);
            
            rs.close();
            ps.close();
                    
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            cerrarConexion();
        }
        
        return total;
    }
     
     

     
     
     
     //Cantidad de artículos ofertados por más de 5 días
       public int CantidadArticulosOfertados(int IdProducto)
    {
        int total = 0;
        String consultaSql = "SELECT SUM(stockDisponible) FROM Oferta WHERE diasVigencia > 5";
        try 
        {
            abrirConexion();
            
            PreparedStatement ps = con.prepareStatement(consultaSql);
            
            ResultSet rs = ps.executeQuery();
            
            rs.next();
            total = rs.getInt(1);
            
            rs.close();
            ps.close();
                    
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            cerrarConexion();
        }
        
        return total;
    }
      
     
       // OBTENER PRODUCTOS PARA LLENAR COMBO
       public ArrayList<Producto> obtenerProductos()
       {
           ArrayList<Producto> lista = new ArrayList<>();
           
           try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Producto");
            
              while (rs.next()) 
              {
                  int IdProducto = rs.getInt("IdProducto");
                  String nombre = rs.getString("Nombre");


                  
                  Producto p = new Producto(IdProducto, nombre);
                  
                  lista.add(p);
              }
              st.close();
              rs.close();
                    
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            cerrarConexion();
        }
        
           
           return lista;
       }
       
}
