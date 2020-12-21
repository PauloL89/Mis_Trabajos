package SQL;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class GestorDB 
{

        public static final String CONN_STR = "jdbc:sqlserver://DESKTOP-B80K3K5:1433";
        private String USER = "sa";
        private String PASS ="sa";
        
        

        ArrayList<Persona> loadAllPersonas() 
        {
            ArrayList<Persona> resultado = new ArrayList<Persona>();
            try 
            {
                    Connection con = DriverManager.getConnection(CONN_STR, USER,PASS);
                    
                    Statement st = con.createStatement();
                    ResultSet rt = st.executeQuery("SELECT * FROM persona");
                    
                    while(rt.next())
                    {
                        int id = rt.getInt("Id");
                        String nombre = rt.getString("Nombre");
                        String apellido = rt.getString("Apellido");
                        
                        Persona p = new Persona(id, nombre, apellido);
                        resultado.add(p);
                        
                        rt.close();
                        st.close();
                        con.close();
                    }
                    
            } catch (SQLException e)
            {
                System.out.println(e);
            }


            return resultado;
        }
    

}
