
package GESTORES;

import MODELO.DetalleVenta;
import MODELO.Pareja;
import MODELO.Venta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GestorCompras 
{
    GestorConexion conexion;
    public GestorCompras() 
    {
        conexion = new GestorConexion();
    }

       // ALTA DE UNA VENTA/COMPRA
        public void altaCompra(Venta v)
       {

           try 
           {
               conexion.abrirConexion();

               PreparedStatement st = conexion.getCon().prepareStatement("INSERT INTO Ventas(FechaVenta,IdPareja)VALUES(?,?)");

                 st.setString(1,v.getFechaVenta());
                 st.setInt(2, v.getPareja().getIdPareja());



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
        
        
        
        
        // ALTA DE DETALLE UNA VENTA/COMPRA
        public void altaDetalleCompra(DetalleVenta v)
       {

           try 
           {
               conexion.abrirConexion();

               PreparedStatement st = conexion.getCon().prepareStatement("INSERT INTO DetalleVentas(IdVenta,IdArticulo,PrecioUnit)VALUES(?,?,?)");

                 st.setInt(1,v.getVenta().getIdVenta());
                 st.setInt(2, v.getArticulo().getIdArticulo());
                 st.setFloat(3,v.getPrecioUnitario());



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
        
        // Obtener el id de la venta
       public int obtenerIdVenta() 
       {
                int id = 0;
                try 
                {
                    conexion.abrirConexion();
                    PreparedStatement st = conexion.getCon().prepareStatement("SELECT MAX(IdVenta)  FROM Ventas");
                    ResultSet rs = st.executeQuery();
                    while (rs.next()) 
                    {
                        id = rs.getInt(1);
                    }
                    rs.close();
                } 
                catch (Exception exc) 
                {
                        exc.printStackTrace();
                } 
                  finally 
                {
                    conexion.cerrarConexion();
                }

            return id;
        }
        
        
        
        
}
