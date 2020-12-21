
package Modelo;


public abstract class Inmueble 
{
    private double precioAlquiler;
    private int cantMetrosCuadrado, cantHabitaciones;
    private String direccion;
    private double valorImpuesto;

    public Inmueble(double precioAlquiler, int cantMetrosCuadrado, int cantHabitaciones, String direccion, double valorImpuesto) 
    {
        this.precioAlquiler = precioAlquiler;
        this.cantMetrosCuadrado = cantMetrosCuadrado;
        this.cantHabitaciones = cantHabitaciones;
        this.direccion = direccion;
        this.valorImpuesto = valorImpuesto;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public int getCantMetrosCuadrado() {
        return cantMetrosCuadrado;
    }

    public void setCantMetrosCuadrado(int cantMetrosCuadrado) {
        this.cantMetrosCuadrado = cantMetrosCuadrado;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getValorImpuesto() {
        return valorImpuesto;
    }

    public void setValorImpuesto(double valorImpuesto) {
        this.valorImpuesto = valorImpuesto;
    }
    
    public abstract double montoAlquiler();

    @Override
    public String toString() 
    {
        return  "Cantidad de Metros Cuadrado: " + cantMetrosCuadrado 
                + "\n Cantidad de Habitaciones:" + cantHabitaciones 
                + "\n Direccion: " + direccion 
                + "\n Valor del Impuesto: " + valorImpuesto + "\n";
    }
    
    
    
    
}
