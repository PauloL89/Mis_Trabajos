package Modelos;

/**
 *
 * @author Paulo-PC
 */
public class PintarLocal extends Trabajo 
{

    private int metroCuadrados;
    
    // CONSTRUCTORES
    public PintarLocal()
    {
        super();
        metroCuadrados = 0;
    }

    public PintarLocal(int metroCuadrados, String nombreCli, int distancia) 
    {
        super(nombreCli, distancia);
        this.metroCuadrados = metroCuadrados;
    }

    // GETTER Y SETTER
    public int getMetroCuadrados() 
    {
        return metroCuadrados;
    }

    public void setMetroCuadrados(int metroCuadrados) 
    {
        this.metroCuadrados = metroCuadrados;
    }
    
    // METODOS o FUNCIONES

    public double PrecioLocal() 
    {
        double precioLocal;
        
        precioLocal = 5000 + (200 * metroCuadrados);
        
        return precioLocal;
    }

    @Override
    public double PrecioFinal() 
    {
        double precioFinal;
        
        precioFinal = PrecioLocal() + precioBase();
        
        return precioFinal;
    }
    
    @Override
    public String toString() 
    {
        return "\n Precio final para el local: " + PrecioFinal();
    }

}
