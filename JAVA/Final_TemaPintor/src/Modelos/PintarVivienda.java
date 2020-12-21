package Modelos;

/**
 *
 * @author Paulo-PC
 */
public class PintarVivienda extends Trabajo 
{

    private int cantidadAmbiente;
    private boolean paredExterior;

    // CONSTRUCTORES
    public PintarVivienda()
    {
        super();
        cantidadAmbiente = 0;
        paredExterior = false;
    }

    public PintarVivienda(String nombreCli, int distancia,int cantAmbiente, boolean paredExte) 
    {
        super(nombreCli, distancia);
        cantidadAmbiente = cantAmbiente;
        paredExterior = paredExte;
    }

    // GETTER Y SETTER
    

    public int getCantidadAmbiente() 
    {
        return cantidadAmbiente;
    }

    public void setCantidadAmbiente(int cantidadAmbiente)
    {
        this.cantidadAmbiente = cantidadAmbiente;
    }

    public boolean isParedExterior() 
    {
        return paredExterior;
    }

    public void setParedExterior(boolean paredExterior) 
    {
        this.paredExterior = paredExterior;
    }
    
    
    
    // FUNCIONES o METODOS
    
    public double PrecioVivienda()
    {
        double precioVivienda;
         
        if(paredExterior)
        {
            precioVivienda = (2000 * cantidadAmbiente) + 3000;
        }
        else
        {
            precioVivienda = 2000 * cantidadAmbiente;
        }
        
        
        return precioVivienda;
    }
    
    
    @Override
    public double PrecioFinal()
    {
        double precioFinal;
        
        precioFinal = PrecioVivienda() + precioBase();
        
        return precioFinal;
    }

    @Override
    public String toString() 
    {
        return "\n Precio final para la vivienda: " + PrecioFinal();
    }
    
    
    

}
