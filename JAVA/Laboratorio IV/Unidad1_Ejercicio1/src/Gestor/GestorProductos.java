

package Gestor;
import Modelo.Producto;
import java.sql.Statement; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GestorProductos 
{
    private String CONN = "jdbc:sqlserver://DESKTOP-B80K3K5:1433;databaseName=Empresa";
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
    
    public void agregarProducto(Producto p)
    {
        
        try 
        {
            abrirConexion();
            
            PreparedStatement st = con.prepareStatement("INSERT INTO Productos(Nombre,Precio)VALUES(?,?)");
            
              st.setString(1, p.getNombre());
              st.setDouble(2, p.getPrecio());
              
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
    
    
    
    public ArrayList<Producto> obtenerProductos()
    {
        ArrayList<Producto> listaProducto = new ArrayList<>();
       
        try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Productos");
            
              while (rs.next()) 
              {
                  int codigo = rs.getInt("Codigo");
                  String nombre = rs.getString("Nombre");
                  double precio = rs.getDouble("Precio");
                  
                  Producto prod = new Producto(codigo, nombre, precio);
                  listaProducto.add(prod);
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
        
        
        return listaProducto;
    }
    
    
    
     public Producto eliminarProducto(Producto codigo)
    {
        
        
        try 
        {
            abrirConexion();
            
            PreparedStatement st = con.prepareStatement("DELETE FROM Productos WHERE Codigo = ?");
            
            
              st.setInt(1, codigo.getCodigo());
              
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
        
        return codigo;
    }
    
    
     
      public Producto actualizarProducto(Producto p)
    {
        
        try 
        {
            abrirConexion();
            
            PreparedStatement st = con.prepareStatement("UPDATE Productos SET Nombre = ?, Precio = ? WHERE Codigo = ?");
            
            st.setString(1, p.getNombre());
            st.setDouble(2, p.getPrecio());  
            st.setInt(3, p.getCodigo());
              
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
        
        return p;
    }
    
}
