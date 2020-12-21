

package Controlador;

import DTO.DtoTransaccionMayortipoVenta;
import DTO.dtoTipoInmueble;
import DTO.dtoTipoOperacion;
import DTO.dtoVendedor;
import Modelo.TipoInmueble;
import Modelo.TipoOperacion;
import Modelo.Transacciones;
import Modelo.Vendedores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexion 
{
    private String CONN = "jdbc:sqlserver://DESKTOP-B80K3K5:1433;databaseName=Inmobiliaria";
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
    
    // 1 - insetar una transaccion
    public void agregarTransaccion(Transacciones t)
    {
        
        try 
        {
            abrirConexion();
            
            PreparedStatement st = con.prepareStatement("INSERT INTO Transacciones1(Fecha,IdVendedor,IdTipoOperacion,IdTipoInmueble,Monto)"
                                                        + "VALUES(?,?,?,?,?)");
            
              st.setString(1,t.getFecha());
              st.setInt(2,t.getIdVendedor());
              st.setInt(3,t.getTipoOperacion().getCodigo());
              st.setInt(4,t.getTipoInmueble().getCodigo());
              st.setDouble(5,t.getMonto());
              
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
    
    
    
    // 2. Generar un reporte que informe todas las transacciones registradas.
     public ArrayList<DtoTransaccionMayortipoVenta> obtenerTransacciones()
    {
        ArrayList<DtoTransaccionMayortipoVenta> lista = new ArrayList<>();
       
        try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("EXEC consultarTransacciones");
            
              while (rs.next()) 
              {
                  int codigo = rs.getInt("IdTransaccion");
                  String fecha = rs.getString("Fecha");
                  int idVendedor = rs.getInt("IdVendedor");
                  int idTipoOperacion = rs.getInt("IdTipoOperacion");
                  int idTipoInmueble = rs.getInt("IdTipoInmueble");
                  float monto = rs.getFloat("Monto");
                  String inmuebleTipo = rs.getString("inmueble");
                  String operacionTipo = rs.getString("operacion");
                  
                  TipoInmueble inmueble = new TipoInmueble();
                  inmueble.setIdTipoInmueble(idTipoInmueble);
                  inmueble.setNombreInmueble(inmuebleTipo);
                  
                  TipoOperacion operacion = new TipoOperacion();
                  operacion.setIdOperacion(idTipoOperacion);
                  operacion.setNombreOperacion(operacionTipo);
                  
                  Vendedores vendedor = new Vendedores();
                  vendedor.setId(idVendedor);
                  
                  DtoTransaccionMayortipoVenta dtotransaccion = new DtoTransaccionMayortipoVenta(codigo,fecha,operacion,inmueble,monto,vendedor);
                  lista.add(dtotransaccion);
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
    
    
    //3. Datos completo de la transacción (que sea Venta) de mayor valor (monto).
     
     public ArrayList<DtoTransaccionMayortipoVenta> obtenerMayorTransaccionVenta()
    {
        ArrayList<DtoTransaccionMayortipoVenta> lista = new ArrayList<>();
       
        try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("EXEC mayorTransaccionVenta");
            
              if (rs.next()) 
              {
                  int codigo = rs.getInt("IdTransaccion");
                  String fecha = rs.getString("Fecha");
                  int idVendedor = rs.getInt("IdVendedor");
                  int idTipoOperacion = rs.getInt("IdTipoOperacion");
                  int idTipoInmueble = rs.getInt("IdTipoInmueble");
                  float monto = rs.getFloat("Monto");
                  String inmuebleTipo = rs.getString("inmueble");
                  String operacionTipo = rs.getString("operacion");
                  
                  TipoInmueble inmueble = new TipoInmueble();
                  inmueble.setIdTipoInmueble(idTipoInmueble);
                  inmueble.setNombreInmueble(inmuebleTipo);
                  
                  TipoOperacion operacion = new TipoOperacion();
                  operacion.setIdOperacion(idTipoOperacion);
                  operacion.setNombreOperacion(operacionTipo);
                  
                  Vendedores vendedor = new Vendedores();
                  vendedor.setId(idVendedor);
                  
                  DtoTransaccionMayortipoVenta dtotransaccion = new DtoTransaccionMayortipoVenta(codigo,fecha,operacion,inmueble,monto,vendedor);
                  lista.add(dtotransaccion);
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
     

     
     
     
     /*
     4. Porcentaje de transacciones de tipo Alquiler
     */
      public double PorcentajeTransaccionAlquiler()
    {
        double porcentaje = 0;
        int total = 0, parcial = 0;
       
        try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rsOperacion = st.executeQuery("EXEC contadorOperacion");
            
              if (rsOperacion.next()) 
              {
                  int operacion = rsOperacion.getInt(1);
                 total = operacion;
                 
              }

              
              ResultSet rsAlquiler = st.executeQuery("EXEC  contadorAlquiler");
            
              if (rsAlquiler.next()) 
              {
                  int alguiler = rsAlquiler.getInt(1);
                 parcial = alguiler;
                 
              }
              
              rsOperacion.close();
              rsAlquiler.close();
              st.close();
              
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            cerrarConexion();
        }
        
        porcentaje = (parcial *100)/total;
        
        return porcentaje;
    }
     
     
    
     
     
     //5. Informar las transacciones (todos sus datos) cuyo tipo de inmueble sea Oficina.
       public ArrayList<DtoTransaccionMayortipoVenta> obtenerTransaccionesOficinas()
    {
        ArrayList<DtoTransaccionMayortipoVenta> lista = new ArrayList<>();
       
        try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("EXEC obtenerOficinas");
            
              if (rs.next()) 
              {
                  int codigo = rs.getInt("IdTransaccion");
                  String fecha = rs.getString("Fecha");
                  int idVendedor = rs.getInt("IdVendedor");
                  int idTipoOperacion = rs.getInt("IdTipoOperacion");
                  int idTipoInmueble = rs.getInt("IdTipoInmueble");
                  float monto = rs.getFloat("Monto");
                  String inmuebleTipo = rs.getString("inmueble");
                  String operacionTipo = rs.getString("operacion");
                  
                  TipoInmueble inmueble = new TipoInmueble();
                  inmueble.setIdTipoInmueble(idTipoInmueble);
                  inmueble.setNombreInmueble(inmuebleTipo);
                  TipoOperacion operacion = new TipoOperacion();
                  operacion.setIdOperacion(idTipoOperacion);
                  operacion.setNombreOperacion(operacionTipo);
                  Vendedores vendedor = new Vendedores();
                  vendedor.setId(idVendedor);
                  
                  DtoTransaccionMayortipoVenta dtotransaccion = new DtoTransaccionMayortipoVenta(codigo,fecha,operacion,inmueble,monto,vendedor);
                  lista.add(dtotransaccion);
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
     
      
       // OBTENER VENDEDORES PARA LLENAR COMBO
       
        public ArrayList<dtoVendedor> obtenerVendedores()
    {
        ArrayList<dtoVendedor> lista = new ArrayList<>();
       
        try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Vendedores");
            
              while (rs.next()) 
              {
                  int codigo = rs.getInt("IdVendedor");
                  String nombre = rs.getString("NombreCompleto");
                 
                  dtoVendedor vendedor = new dtoVendedor(codigo, nombre);
                  
                  lista.add(vendedor);
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
     
        
        
     
       // OBTENER TIPO DE OPERACION PARA LLENAR COMBO
       
        public ArrayList<dtoTipoOperacion> obtenerOperacion()
    {
        ArrayList<dtoTipoOperacion> lista = new ArrayList<>();
       
        try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM TipoOperaciones");
            
              while (rs.next()) 
              {
                  int codigo = rs.getInt("IdTipoOperacion");
                  String nombre = rs.getString("TipoOperacion");
                 
                  dtoTipoOperacion operacion = new dtoTipoOperacion(codigo, nombre);
                  
                  lista.add(operacion);
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
     
        
        
        
    
       // OBTENER INMUEBLE PARA LLENAR COMBO
       
        public ArrayList<dtoTipoInmueble> obtenerInmueble()
    {
        ArrayList<dtoTipoInmueble> lista = new ArrayList<>();
       
        try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM TipoInmuebles");
            
              while (rs.next()) 
              {
                  int codigo = rs.getInt("IdTipoInmueble");
                  String nombre = rs.getString("TipoInmueble");
                 
                  dtoTipoInmueble inmueble = new dtoTipoInmueble(codigo, nombre);
                  
                  lista.add(inmueble);
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

