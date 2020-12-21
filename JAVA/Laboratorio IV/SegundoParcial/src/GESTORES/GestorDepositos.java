
package GESTORES;

import MODELO.Deposito;
import java.sql.PreparedStatement;


public class GestorDepositos 
{
    GestorConexion conexion;
    public GestorDepositos() 
    {
        conexion = new GestorConexion();
    }

       // ALTA DE UN DEPOSITO
        public void altaDeposito(Deposito d)
       {

           try 
           {
               conexion.abrirConexion();

               PreparedStatement st = conexion.getCon().prepareStatement("INSERT INTO Depositos(IdInvitado,MontoDepositado,IdPareja)VALUES(?,?,?)");

                 st.setInt(1,d.getInvitado().getIdInvitado());
                 st.setFloat(2,d.getMontoDepositado());
                 st.setInt(3, d.getPareja().getIdPareja());



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
