

package Modelos;


public class MaquinaElectrica  extends Alquiler
{
    private int cantidad;
    
    
    public MaquinaElectrica()
    {
        cantidad = 0;
    }

    public MaquinaElectrica(int cantidad, String nombreCliente, String nombreHerramienta) 
    {
        super(nombreCliente, nombreHerramienta);
        this.cantidad = cantidad;
    }

    public int getCantidad() 
    {
        return cantidad;
    }

    public void setCantidad(int cantidad) 
    {
        this.cantidad = cantidad;
    }


    @Override
    public double precioFinal() 
    {
        double precio;
       
        precio = (300 * cantidad) + 3000;
        
        return precio;
    }

    @Override
    public String toString() 
    {
        return "Precio Final del Alquiler de maquina electrica " + getNombreHerramienta() +": $" + precioFinal();
    }
    
     @Override
    public int mayorDuracionConstruccion() 
    {
        return 0;
        
    }
    
}
