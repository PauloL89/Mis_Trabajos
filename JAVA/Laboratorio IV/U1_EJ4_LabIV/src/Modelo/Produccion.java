

package Modelo;


public class Produccion 
{
    private int codigoProducccion;
    private Responsable responsable;
    private Componente componente;
    private int cantidadPoduccion;
    private String fecha;

    public Produccion(int codigoProducccion, Responsable responsable, Componente componente, int cantidadPoduccion, String fecha) 
    {
        this.codigoProducccion = codigoProducccion;
        this.responsable = responsable;
        this.componente = componente;
        this.cantidadPoduccion = cantidadPoduccion;
        this.fecha = fecha;
    }

    public int getCodigoProducccion() 
    {
        return codigoProducccion;
    }

    public void setCodigoProducccion(int codigoProducccion) 
    {
        this.codigoProducccion = codigoProducccion;
    }

    public Responsable getResponsable() 
    {
        return responsable;
    }

    public void setResponsable(Responsable responsable) 
    {
        this.responsable = responsable;
    }

    public Componente getComponente() 
    {
        return componente;
    }

    public void setComponente(Componente componente) 
    {
        this.componente = componente;
    }

    public int getCantidadPoduccion() 
    {
        return cantidadPoduccion;
    }

    public void setCantidadPoduccion(int cantidadPoduccion) 
    {
        this.cantidadPoduccion = cantidadPoduccion;
    }

    public String getFecha() 
    {
        return fecha;
    }

    public void setFecha(String fecha) 
    {
        this.fecha = fecha;
    }

    @Override
    public String toString() 
    {
        return "codigoProducccion: " +codigoProducccion + "\n responsable: " + responsable 
                + "\n componente: " + componente + "\n cantidad de Poducciones: " + cantidadPoduccion 
                + "\n fecha:" + fecha;
    }
    
    

}
