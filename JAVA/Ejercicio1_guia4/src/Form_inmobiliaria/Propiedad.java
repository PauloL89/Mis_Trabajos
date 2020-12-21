
package Form_inmobiliaria;




public abstract class Propiedad 
{
    protected String direccion;
    protected int cantHabit;
    protected int cantInquillinos; // si la propiedad no es para uso comercial
    protected double precioBaseAlq;
   protected boolean usoComercial;
    
    public Propiedad()
    {
       direccion = "";
       cantHabit = 0;
       cantInquillinos = 0;
       precioBaseAlq = 0;
       usoComercial = false;
    }

    public Propiedad(String dir, int cantHab, int cantInquil, double precBaseAlq, boolean usoComer) 
    {
        this.direccion = dir;
        this.cantHabit = cantHab;
        this.cantInquillinos = cantInquil;
        this.precioBaseAlq = precBaseAlq;
        this.usoComercial = usoComer;
    }

    public String getDireccion() 
    {
        return direccion;
    }

    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }

    public int getCantHabit() 
    {
        return cantHabit;
    }

    public void setCantHabit(int cantHabit) 
    {
        this.cantHabit = cantHabit;
    }

    public int getCantInquillinos() 
    {
        return cantInquillinos;
    }

    public void setCantInquillinos(int cantInquillinos)
    {
        this.cantInquillinos = cantInquillinos;
    }

    public double getPrecioBaseAlq() 
    {
        return precioBaseAlq;
    }

    public void setPrecioBaseAlq(double precioBaseAlq) 
    {
        this.precioBaseAlq = precioBaseAlq;
    }

    public boolean isUsoComercial() 
    {
        return usoComercial;
    }

    public void setUsoComercial(boolean usoComercial) 
    {
        this.usoComercial = usoComercial;
    }
    
    
    
    public abstract double precioAlquiler();
    
}
