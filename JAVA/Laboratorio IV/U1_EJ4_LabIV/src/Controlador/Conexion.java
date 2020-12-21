

package Controlador;

import DTO.DtoActualizarProduccion;
import DTO.DtoObtenerProduccion;
import DTO.DtoProduccion;
import Modelo.Componente;
import Modelo.Produccion;
import Modelo.Responsable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Conexion 
{
    private String CONN = "jdbc:sqlserver://DESKTOP-B80K3K5:1433;databaseName=Producciones";
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
     
     //1. Registrar las órdenes de producción.
     
      public void agregarProduccion(Produccion prod)
    {
        
        try 
        {
            abrirConexion();
            
            PreparedStatement st = con.prepareStatement("INSERT INTO Produccion(IdResponsable,Fecha,idComponente,CantidadProduccion)"
                                                        + "VALUES(?,?,?,?)");
            
              st.setInt(1,prod.getResponsable().getCodigo());
              st.setString(2,prod.getFecha());
              st.setInt(3,prod.getComponente().getCodComponente());
              st.setInt(4,prod.getCantidadPoduccion());
              
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
     
     
     
     
     
     
     



       
     /*2.   Consultar las producciones realizadas para un determinado operario y totalizar
            la cantidad de producciones*/
     
    
      public ArrayList<DtoProduccion> obtenerProduccionesFiltro(int resp)
    {
        ArrayList<DtoProduccion> lista = new ArrayList<>();
        
        String sql = "SELECT fecha,Descripcion, SUM(CantidadProduccion) AS 'Total Producciones' \n" +
                        " FROM Produccion p JOIN Componente c ON p.IdComponente = c.IdComponente\n" +
                        " WHERE IdResponsable = ?\n" +
                        " GROUP BY fecha,Descripcion";
       
        try 
        {
            abrirConexion();
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, resp);
            
            ResultSet rs = ps.executeQuery();
            
              while (rs.next()) 
              {
                  String fecha = rs.getString("fecha");
                  String descripcion = rs.getString("Descripcion");
                  int total = rs.getInt("Total Producciones");

                  
                  DtoProduccion p = new DtoProduccion(fecha,descripcion,total);
                  
                  lista.add(p);
              }
              ps.close();
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
    
     
     
     
     
     
     
     /*
     3. Permitir la modificación de los datos una determinada orden de producción.
        Los datos que pueden editarse son la fecha, y la cantidad de producción
     */
    
     public DtoActualizarProduccion ActualizarProduccion(DtoActualizarProduccion prod)
    {
        
        
        String sql = "UPDATE Produccion "
                        + "SET Fecha = ?, CantidadProduccion = ? "
                        + "WHERE IdProduccion = ?";
       
        try 
        {
            abrirConexion();
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, prod.getFecha());
            ps.setInt(2, prod.getCantidadProd());
            ps.setInt(3, prod.getIdProdiccion());
            
            ps.executeUpdate();
            
              
              ps.close();
                    
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            cerrarConexion();
        }
        
        
        return prod;
    }
    
    
    
    
    // OBTENER RESPONSABLES PARA LLENAR COMBO
       public ArrayList<Responsable> obtenerResponsable()
       {
           ArrayList<Responsable> lista = new ArrayList<>();
           
           try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Responsable");
            
              while (rs.next()) 
              {
                  int IdProducto = rs.getInt("IdResponsable");
                  String nombre = rs.getString("NombreResponsable");


                  
                  Responsable r = new Responsable(IdProducto, nombre);
                  
                  lista.add(r);
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
    
       
       // OBTENER RESPONSABLES PARA LLENAR COMBO
       public ArrayList<Componente> obtenerComponente()
       {
           ArrayList<Componente> lista = new ArrayList<>();
           
           try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Componente");
            
              while (rs.next()) 
              {
                  int IdProducto = rs.getInt("IdComponente");
                  String nombre = rs.getString("Descripcion");


                  
                  Componente c = new Componente(IdProducto, nombre);
                  
                  lista.add(c);
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
    
    
    
    
    
    public ArrayList<DtoObtenerProduccion> obtenerProducciones()
       {
           ArrayList<DtoObtenerProduccion> lista = new ArrayList<>();
           
           try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT p.*,Descripcion,r.NombreResponsable "
                                            + "FROM Produccion p "
                                                + "JOIN Responsable r "
                                                    + "ON p.IdResponsable = r.IdResponsable "
                                                + "JOIN Componente c "
                                                    + "ON p.IdComponente = c.IdComponente ");
            
              while (rs.next()) 
              {
                  int IdProduccion = rs.getInt("IdProduccion");
                  int IdResponsable = rs.getInt("IdResponsable");
                  String fecha = rs.getString("fecha");
                  int IdComponente = rs.getInt("IdComponente");
                  int CantidadProduccion = rs.getInt("CantidadProduccion");
                  String desc = rs.getString("Descripcion");
                  String nombre = rs.getString("NombreResponsable");


                  Responsable r = new Responsable(IdResponsable, nombre);
                  r.setCodigo(IdResponsable);
                  Componente c = new Componente(IdComponente, desc);
                  c.setCodComponente(IdComponente);
                  
                  DtoObtenerProduccion p = new DtoObtenerProduccion(IdProduccion, IdResponsable, fecha, IdComponente, CantidadProduccion, desc, nombre);
                  
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
