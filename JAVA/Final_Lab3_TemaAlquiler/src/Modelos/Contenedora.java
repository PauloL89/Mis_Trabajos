
package Modelos;

import java.util.ArrayList;

public class Contenedora 
{
    public ArrayList<Alquiler> listaAqluiler;
    private boolean esMayor = true;
    
    
    public Contenedora()
    {
        listaAqluiler = new ArrayList();
    }
    
    public void AgregarAlquiler(Alquiler alquiler)
    {
        listaAqluiler.add(alquiler);
    }
    
    //Total Ganado en alquiler sin conceptos en garantias
    public double totalGanadoAlquiler()
    {
        double total = 0;
        
        for (Alquiler alquiler : listaAqluiler) 
        {
            if(alquiler instanceof MaquinaElectrica)
                total += alquiler.precioFinal() - 3000;
            else
                total += alquiler.precioFinal();
        }
        
        return total;
    }
    
    //Total ganado en recaudacion de alquiler de maquina electricas con concepto de garantias
    
    public double totalAlquilerMaquinas()
    {
        double total = 0;
        for (Alquiler alquiler : listaAqluiler) 
        {
            if(alquiler instanceof MaquinaElectrica)
            {
                total += alquiler.precioFinal();
            }
            
        }
        
        return total;
    }
    
    //Nombre del Cliente que contrato
   //El alquiler de mayor duracion de construccion
    
    private int mayorSemana;
    private String nombreMayorActual;

    public String NombreClienteAlquilerMayorDuracion() 
    {
        String nombre = "";
        for (Alquiler alquiler : listaAqluiler) 
        {
            if (esMayor && alquiler instanceof Construccion) 
            {
                nombre = alquiler.getNombreCliente();
                mayorSemana = alquiler.mayorDuracionConstruccion();
                esMayor = false;
            }
            else if (alquiler instanceof Construccion && alquiler.mayorDuracionConstruccion() > mayorSemana)
            {
                    mayorSemana = alquiler.mayorDuracionConstruccion();
                    nombre = alquiler.getNombreCliente();
                    nombreMayorActual = nombre;
                 
            } // else if
            else 
                {
                    nombre = nombreMayorActual;
                }

        } // for

        return nombre;
    }
}
