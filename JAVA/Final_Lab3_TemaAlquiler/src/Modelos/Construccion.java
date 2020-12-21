
package Modelos;


public class Construccion extends Alquiler
{
    private int semanas;

    public Construccion() 
    {
        semanas = 0;
    }

    
   
    public Construccion(int semanas, String nombreCliente, String nombreHerramienta) 
    {
        super(nombreCliente, nombreHerramienta);
        this.semanas = semanas;
    }
    
    

    public int getSemanas() 
    {
        return semanas;
    }

    public void setSemanas(int semanas) 
    {
        this.semanas = semanas;
    }
    
    @Override
    public double precioFinal()
    {
        double precio;
        
        precio = 1000 * semanas;
        
        return precio;
    }
    
    
    @Override
    public int mayorDuracionConstruccion() 
    {
        return getSemanas();
        
    }

    
   
    @Override
    public String toString() 
    {
        return "Precio Final del alquiler de la herramienta de construccion " + getNombreHerramienta() + ": $" + precioFinal();
    }


    
    
}
