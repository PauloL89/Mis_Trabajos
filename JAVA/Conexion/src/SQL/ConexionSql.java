

package SQL;

import  java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSql 
{
    public static Connection getConection()
    {
        String conexionUrl = "jdbc:sqlserver://DESKTOP-B80K3K5:1433; " + "database = PersonasPrueba; " + " IntegratedSecurity = true";
        
        try 
        {
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        } catch (SQLException e)
        {
            System.out.println(e.toString());
            return null;
        }
    }

}
