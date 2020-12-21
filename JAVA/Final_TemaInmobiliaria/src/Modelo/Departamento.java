

package Modelo;


public class Departamento extends Inmueble
{
    private int pisoDpto, numDpto;
    private double montoExpensas;

    public Departamento(int pisoDpto, int numDpto, double montoExpensas, double precioAlquiler, int cantMetrosCuadrado, int cantHabitaciones, String direccion, double valorImpuesto) {
        super(precioAlquiler, cantMetrosCuadrado, cantHabitaciones, direccion, valorImpuesto);
        this.pisoDpto = pisoDpto;
        this.numDpto = numDpto;
        this.montoExpensas = montoExpensas;
    }

    public int getPisoDpto() {
        return pisoDpto;
    }

    public void setPisoDpto(int pisoDpto) {
        this.pisoDpto = pisoDpto;
    }

    public int getNumDpto() {
        return numDpto;
    }

    public void setNumDpto(int numDpto) {
        this.numDpto = numDpto;
    }

    public double getMontoExpensas() {
        return montoExpensas;
    }

    public void setMontoExpensas(double montoExpensas) {
        this.montoExpensas = montoExpensas;
    }
    
    
        @Override
    public double montoAlquiler() 
    {
        double montoTotal;
         montoTotal = (getPrecioAlquiler() + getValorImpuesto()) + montoExpensas;
        
        return montoTotal;
    }
    

    @Override
    public String toString() 
    {
        return "Monto Total del Alquiler: $" + montoAlquiler();
    }
    
    
}
