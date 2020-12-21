

package GESTORES;

import MODELO.Provincia;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class CargarCombo 
{
    GestorConexion conexion;

    public CargarCombo() 
    {
        conexion = new GestorConexion();
    }
    
    
    
    // OBTENER Provincia PARA LLENAR COMBO
       public ArrayList<Provincia> obtenerProvincia()
       {
           ArrayList<Provincia> lista = new ArrayList<>();
           
           try 
        {
            conexion.abrirConexion();
            
            Statement st = conexion.getCon().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Provincias");
            
              while (rs.next()) 
              {
                  int id = rs.getInt("IdProvincia");
                  String nombre = rs.getString("Provincia");


                  
                  Provincia p = new Provincia(id, nombre);
                  
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
            conexion.cerrarConexion();
        }
        
           
           return lista;
       }

}
