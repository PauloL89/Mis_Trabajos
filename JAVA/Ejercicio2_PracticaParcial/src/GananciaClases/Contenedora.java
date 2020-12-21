
package GananciaClases;

import java.util.ArrayList;


public class Contenedora
{
    ArrayList<ProfesorClase> pf;
    
    
    public Contenedora()
    {
        pf = new ArrayList<>();
    }
    
    
    public void AgregarClase(ProfesorClase c)
    {
        pf.add(c);
    }
    
    
    public String listaClase()
    {
        String texto = "";
        for (ProfesorClase pfC : pf)
        {
            texto = pfC.toString();
        }
        return texto;
    }
    
}
