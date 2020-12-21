
package Modelos;


public abstract class Alquiler 
{
    private String nombreCliente,nombreHerramienta;

    public Alquiler() 
    {
        nombreCliente = "";
        nombreHerramienta = "";
    }

    public Alquiler(String nombreCliente, String nombreHerramienta) 
    {
        this.nombreCliente = nombreCliente;
        this.nombreHerramienta = nombreHerramienta;
    }

    public String getNombreCliente() 
    {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) 
    {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreHerramienta() 
    {
        return nombreHerramienta;
    }

    public void setNombreHerramienta(String nombreHerramienta) 
    {
        this.nombreHerramienta = nombreHerramienta;
    }
    
    public abstract double precioFinal();
    
    public abstract int mayorDuracionConstruccion();
    

    @Override
    public String toString() 
    {
        return "Nombre del cliente: " + nombreCliente + "\n Nombre de la herramienta: " + nombreHerramienta;
    }
    
    
    
    
}
