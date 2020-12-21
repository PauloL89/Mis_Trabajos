
package Form_inmobiliaria;


public class Departamento extends Propiedad
{
    protected double precioExpensas;

    public Departamento()
    {
        super();
        precioExpensas = 0;
    }

    public Departamento(double precioExpensas, String dir, int cantHab, int cantInquil, double precBaseAlq, boolean usoComer)
    {
        super(dir, cantHab, cantInquil, precBaseAlq, usoComer);
        this.precioExpensas = precioExpensas;
    }
    
    
    
    
    
     @Override
    public double precioAlquiler() 
    {
       double precioTotal = 0;
        if(isUsoComercial())
        {
           precioTotal = getPrecioBaseAlq() + precioExpensas + 500; 
        }
         
        return precioTotal;
    }
}
