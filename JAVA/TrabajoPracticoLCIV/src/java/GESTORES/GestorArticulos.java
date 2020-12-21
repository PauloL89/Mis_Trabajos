
package GESTORES;

import MODELO.Articulo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class GestorArticulos 
{
    GestorConexion conexion;
    
    public GestorArticulos()
    {
        conexion = new GestorConexion();
    }
    
    // ALTA DE UN ARTICULO
     public void altaArticulo(Articulo a)
    {
        
        try 
        {
            conexion.abrirConexion();
            
            PreparedStatement st = conexion.getCon().prepareStatement("INSERT INTO Articulos(Articulo,PrecioUnitario,Estado)VALUES(?,?,1)");
            
              st.setString(1,a.getArticulo());
              st.setFloat(2,a.getPrecioUnitario());
         
              
              
              st.executeUpdate();
              st.close();
                    
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            conexion.cerrarConexion();
        }
        
    }
     
     
     
     // BAJA DE UN ARTICULO
     
      public int eliminarArticulo(int id)
    {
        
        
        try 
        {
            conexion.abrirConexion();
            
            PreparedStatement st = conexion.getCon().prepareStatement("UPDATE Articulos SET Estado = 0 WHERE IdArticulo = ?");
            
            
              st.setInt(1, id);
              
              st.executeUpdate();
              st.close();
                    
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            conexion.cerrarConexion();
        }
        
        return id;
    }
     
     
     // MODIFICACION DE UN ARTICULO
     
        public Articulo modificarArticulo(Articulo a)
    {
        
        try 
        {
            conexion.abrirConexion();
            
            PreparedStatement st = conexion.getCon().prepareStatement("UPDATE Articulos SET Articulo = ?,PrecioUnitario = ? WHERE IdArticulo = ?");
            
            st.setString(1, a.getArticulo());
            st.setFloat(2, a.getPrecioUnitario()); 
            st.setInt(3, a.getIdArticulo());
              
              st.executeUpdate();
              st.close();
                    
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            conexion.cerrarConexion();
        }
        
        return a;
    }
      
     
     
     // CONSULTA DE ARTICULOS
     
      public ArrayList<Articulo> consultarArticulos()
    {
        ArrayList<Articulo> lista = new ArrayList<>();
       
        try 
        {
            conexion.abrirConexion();
            
            Statement st = conexion.getCon().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Articulos WHERE Estado = 1");
            
              while (rs.next()) 
              {

                  int id = rs.getInt("IdArticulo");
                  String articulo = rs.getString("Articulo");
                  float precioUnitario = rs.getFloat("PrecioUnitario");
                  
                  Articulo listado = new Articulo(id, articulo, precioUnitario);
                  
                  lista.add(listado);
              }
              st.close();
              rs.close();
                    
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            conexion.cerrarConexion();
        }
        
        
        return lista;
    }
     
      
      
       public Articulo obtenerArticuloPorId(int idArticulo)
    {
        Articulo a = null;
        try
        {
            conexion.abrirConexion();
            PreparedStatement st = conexion.getCon().prepareStatement("SELECT * FROM Articulos WHERE IdArticulo = ?");
            st.setInt(1, idArticulo);
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                  int id = rs.getInt("IdArticulo");
                  String articulo = rs.getString("Articulo");
                  float precioUnitario = rs.getFloat("PrecioUnitario");
                  
                  a= new Articulo(id, articulo, precioUnitario);

                a.setIdArticulo(id);
            }
            rs.close();
        }
        catch(Exception exc)
        {
            exc.printStackTrace();
        }
        finally
        {
            conexion.cerrarConexion();
        }
        
        return a;
    }
     
}
