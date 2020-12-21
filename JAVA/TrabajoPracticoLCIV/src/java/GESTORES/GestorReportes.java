
package GESTORES;

import DTO.dtoListado;
import DTO.dtoListadoTop;
import MODELO.Provincia;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class GestorReportes 
{
   GestorConexion conexion;
    public GestorReportes() 
    {
        conexion = new GestorConexion();
    } 
    
    /*– Listado de parejas registradas,indicando cantidad de depósitos recibidos
        y suma total de los mismos.*/
    
     public ArrayList<dtoListado> obtenerListado()
    {
        ArrayList<dtoListado> lista = new ArrayList<>();
       
        try 
        {
           conexion.abrirConexion();
            
            Statement st = conexion.getCon().createStatement();
            ResultSet rs = st.executeQuery("SELECT p.PrimerConyuge, p.SegundoConyuge,"
                    + "COUNT(d.IdPareja) 'cantidad', SUM(MontoDepositado) 'total' "
                    + "FROM Parejas p JOIN Depositos d ON p.IdPareja = d.IdPareja "
                    + "GROUP BY p.PrimerConyuge, p.SegundoConyuge ORDER BY 3 desc");
            
              while (rs.next()) 
              {

                  String primerConyuge = rs.getString("PrimerConyuge");
                  String segundoConyuge = rs.getString("SegundoConyuge");
                  int cantidad = rs.getInt(3);
                  float total = rs.getFloat(4);
                  
                  dtoListado listado = new dtoListado(primerConyuge, segundoConyuge,cantidad, total);
                  
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
     
     
     
    
    /*
        – Total facturado por todos los regalos de todas las parejas
    */
    
      public float TotalFacturado()
    {
        float total = 0;
        String sql = "SELECT SUM(MontoDepositado) 'Total de Todos los Depositos' FROM Depositos";
        
       
        try 
        {
            conexion.abrirConexion();
            
            Statement st = conexion.getCon().createStatement();
            ResultSet rsOperacion = st.executeQuery(sql);
            
              if (rsOperacion.next()) 
              {
                  int operacion = rsOperacion.getInt(1);
                 total = operacion;
              }

              rsOperacion.close();

              st.close();
              
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            conexion.cerrarConexion();
        }
        
        
        return total;
    }
     
     
     
     
     
     
    /*
        – Listado de los 5 artículos más solicitados, indicando la cantidad de parejas que pidieron a
          cada uno de ellos
    */
    
     
      public ArrayList<dtoListadoTop> obtenerListadoTop()
    {
        ArrayList<dtoListadoTop> lista = new ArrayList<>();
       
        try 
        {
           conexion.abrirConexion();
            
            Statement st = conexion.getCon().createStatement();
            ResultSet rs = st.executeQuery("SELECT TOP 5 Articulo, "
                    + "COUNT(v.IdPareja) 'Cantidad de Parejas que solicitaron este articulo' "
                    + "FROM  Articulos a, DetalleVentas dv, Ventas v "
                    + "WHERE a.IdArticulo = dv.IdArticulo AND dv.IdVenta = v.IdVenta "
                    + "GROUP BY Articulo ORDER BY 2 desc");
            
              while (rs.next()) 
              {

                  String primerConyuge = rs.getString("Articulo");
                  int cantidad = rs.getInt(2);
                  
                  dtoListadoTop listado = new dtoListadoTop(primerConyuge, cantidad);
                  
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
      
      
      
      
      
}
