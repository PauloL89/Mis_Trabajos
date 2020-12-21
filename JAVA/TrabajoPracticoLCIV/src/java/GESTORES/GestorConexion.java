
package GESTORES;

import java.sql.Connection;
import java.sql.DriverManager;

public class GestorConexion 
{
    private String CONN = "jdbc:sqlserver://DESKTOP-B80K3K5:1433;databaseName=Comercio2";
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

    public Connection getCon() 
    {
        return con;
    }
     
     

}
