
package GESTORES;

import MODELO.Deposito;
import MODELO.Pareja;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class GestorDepositos 
{
    GestorConexion conexion;
    boolean bandera;
    public GestorDepositos() 
    {
        conexion = new GestorConexion();
        bandera = false;
    }

       // ALTA DE UN DEPOSITO
        public void altaDeposito(Deposito d)
       {

           try 
           {
               conexion.abrirConexion();

               PreparedStatement st = conexion.getCon().prepareStatement("INSERT INTO Depositos(MontoDepositado,IdPareja,NombreInvitado,ApellidoInvitado,TelefonoInvitado,Estado)VALUES(?,?,?,?,?,1)");

                 st.setFloat(1,d.getMontoDepositado());
                 st.setInt(2, d.getPareja().getIdPareja());
                 st.setString(3, d.getNombreInvitado());
                 st.setString(4, d.getApellidoInvitado());
                 st.setString(5, d.getTelefonoInvitado());
                 
              

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
           
            bandera = true;
       }
        
        
        // CONSULTAR DEPOSITO DE UNA PAREJA
         public float consultarDeposito(int idPareja)
    {
         float total = 0;
         
         if(bandera)
         {
               try
              {
                  conexion.abrirConexion();
                  PreparedStatement st = conexion.getCon().prepareStatement("SELECT SUM(MontoDepositado) monto FROM Depositos WHERE IdPareja = ? AND Estado = 1");
                  st.setInt(1, idPareja);
                  ResultSet rs = st.executeQuery();
                  if(rs.next())
                  {
                      float montodep = rs.getFloat("monto");

                      total = montodep;

                  }


                  rs.close();
                  st.close();
              }
              catch(Exception exc)
              {
                  exc.printStackTrace();
              }
              finally
              {
                  conexion.cerrarConexion();
              }
               
               bandera = false;
         }
         else
         {
             try
              {
                  conexion.abrirConexion();
                  PreparedStatement st = conexion.getCon().prepareStatement("SELECT Saldo FROM Parejas WHERE idPareja = ?");
                  st.setInt(1, idPareja);
                  ResultSet rs = st.executeQuery();
                  if(rs.next())
                  {
                      float montodep = rs.getFloat("Saldo");

                      total = montodep;

                  }


                  rs.close();
                  st.close();
              }
              catch(Exception exc)
              {
                  exc.printStackTrace();
              }
              finally
              {
                  conexion.cerrarConexion();
              }
         }
       
        return total;
    }
     
       
         
         //Actualiza el campo saldo de la tabla pareja de la pareja seleccionada cuando recibe un deposito
         public float actualizarSaldo(float saldo, int id)
         {

            try 
            {
                conexion.abrirConexion();

                PreparedStatement st = conexion.getCon().prepareStatement("UPDATE Parejas SET Saldo = ? WHERE IdPareja = ?");

                st.setFloat(1, saldo);
                st.setInt(2, id);

                st.executeUpdate();
                st.close();

            } 
            catch (Exception e)
            {
                e.printStackTrace();
            } finally 
            {
                conexion.cerrarConexion();
            }

            return saldo;
    }
       
         
         
      public int actualizarEstadoDeposito(int idPareja)
    {
        
        
        try 
        {
            conexion.abrirConexion();
            
            PreparedStatement st = conexion.getCon().prepareStatement("UPDATE Depositos SET Estado = 0 WHERE IdPareja = ?");
            
            
              st.setInt(1, idPareja);
              
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
        
        return idPareja;
    }     
         
         
         
      
}

