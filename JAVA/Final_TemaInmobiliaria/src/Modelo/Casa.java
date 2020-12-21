

package Modelo;


public class Casa extends Inmueble
{
    private boolean  tienePileta;

    public Casa(boolean tienePileta, double precioAlquiler, int cantMetrosCuadrado, int cantHabitaciones, String direccion, double valorImpuesto) 
    {
        super(precioAlquiler, cantMetrosCuadrado, cantHabitaciones, direccion, valorImpuesto);
        this.tienePileta = tienePileta;
    }

    public boolean isTienePileta() {
        return tienePileta;
    }

    public void setTienePileta(boolean tienePileta) {
        this.tienePileta = tienePileta;
    }
    
    private String textoTienePileta()
    {
        String texto;
        if(tienePileta == true)
            texto = "Si";
        else
        {
            texto = "No";
        }
        
        return texto;
    }
    
    
        @Override
    public double montoAlquiler() 
    {
        double montoTotal;
        
        if(tienePileta)
        {
            montoTotal = (getPrecioAlquiler() + getValorImpuesto()) + 1000;
        }
        else
        {
            montoTotal = getPrecioAlquiler() + getValorImpuesto();
        }
        
        return montoTotal;
    }

    @Override
    public String toString() 
    {
        return "Monto Total del Alquiler: $" + montoAlquiler();
    }


    
    
    
}
