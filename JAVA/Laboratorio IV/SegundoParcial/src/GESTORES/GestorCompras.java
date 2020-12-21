
package GESTORES;

import MODELO.DetalleVenta;
import MODELO.Venta;
import java.sql.PreparedStatement;

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

               PreparedStatement st = conexion.getCon().prepareStatement("INSERT INTO Ventas(CodVendedor,FechaVenta,IdDeposito,IdPareja)VALUES(?,?,?,?)");

                 st.setInt(1,v.getVendedor().getCodVendedor());
                 st.setString(2,v.getFechaVenta());
                 st.setInt(3, v.getDeposito().getIdDeposito());
                 st.setInt(4, v.getPareja().getIdPareja());



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
}
