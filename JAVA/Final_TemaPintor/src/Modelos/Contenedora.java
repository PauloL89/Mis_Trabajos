package Modelos;


import java.util.ArrayList;

/**
 *
 * @author Paulo-PC
 */
public class Contenedora 
{

    public ArrayList<Trabajo> ListaTrabajos;

    private boolean bandera = true;
    private double precioMasCaro;
    private String nombreMasCaroActual;
    private int contadorVivienda;
    private int acumuladorPrecioFinalVivienda;
    public boolean EsVivienda;

    public Contenedora() 
    {
        ListaTrabajos = new ArrayList();
    }

    public void AgregarTrabajo(Trabajo trabajo)
    {
        ListaTrabajos.add(trabajo);
    }

    public String TrabajoMasCaro() 
    {
        String nombre = "";
        for (Trabajo ListaTrabajo : ListaTrabajos) 
        {
            if (bandera) 
            {
                nombre = ListaTrabajo.getNombreCliente();
                precioMasCaro = ListaTrabajo.PrecioFinal();
                bandera = false;
            } else if (ListaTrabajo.PrecioFinal() > precioMasCaro)
            {
                    precioMasCaro = ListaTrabajo.PrecioFinal();
                    nombre = ListaTrabajo.getNombreCliente();
                    nombreMasCaroActual = nombre;
                 
            } // else if
            else 
                {
                    nombre = nombreMasCaroActual;
                }

        } // for

        return nombre;
    }

    public double PromedioViviendas()
    {
        double promedio;
        for (Trabajo trabajo : ListaTrabajos) 
        {
            if(trabajo instanceof PintarVivienda)
            {
                contadorVivienda++;
                acumuladorPrecioFinalVivienda += trabajo.PrecioFinal();
            }
        }
         promedio = acumuladorPrecioFinalVivienda /contadorVivienda;
        
        return promedio;
    }
}
