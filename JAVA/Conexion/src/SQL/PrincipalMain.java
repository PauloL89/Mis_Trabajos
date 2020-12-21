

package SQL;

import java.util.ArrayList;

public class PrincipalMain
{
    public static void main(String[] args) throws ClassNotFoundException
    {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                 GestorDB g = new GestorDB();
                 
                 ArrayList<Persona> resultado = g.loadAllPersonas();
                 
                 for (Persona persona : resultado)
                 {
                     System.out.println(persona);
                 }
        
    }

}
