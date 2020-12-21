
package Comercio;

import java.util.ArrayList;


public class Operacion 
{
    ArrayList<Presentacion> presentacion;
    
    public Operacion()
    {
        presentacion = new ArrayList<>();
    }
    
    public void AgregarPresentacion(Presentacion p)
    {
        presentacion.add(p);
    }
    
    public String listarPresentacion()
    {
        String texto= " ";
        for (Presentacion p : presentacion) 
        {
            texto = p.toString();
        }
        
        return texto;
    }
}
