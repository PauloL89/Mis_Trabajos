
package Form_inmobiliaria;


public class Casa extends Propiedad
{
    protected boolean tieneGarage;
    
    public Casa()
    {
        super();
        tieneGarage = false;
    }

    public Casa(boolean tieneGarage, String dir, int cantHab, int cantInquil, double precBaseAlq, boolean usoComer) 
    {
        super(dir, cantHab, cantInquil, precBaseAlq, usoComer);
        this.tieneGarage = tieneGarage;
    }

    public boolean isTieneGarage() 
    {
        return tieneGarage;
    }

    public void setTieneGarage(boolean tieneGarage) 
    {
        this.tieneGarage = tieneGarage;
    }
    
    @Override
    public double precioAlquiler() 
    {
        double precioTotal = 0;
        if(!isUsoComercial())
        {
           precioTotal = getPrecioBaseAlq() + 1000; 
        }
         
        return precioTotal;
    }
}
