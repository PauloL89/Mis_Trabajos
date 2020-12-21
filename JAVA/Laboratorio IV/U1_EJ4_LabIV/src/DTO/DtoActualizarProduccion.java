

package DTO;

public class DtoActualizarProduccion 
{
    private String fecha;
    private int cantidadProd;
    private int idProdiccion;

    public DtoActualizarProduccion(int Idproduccion, String fecha, int cantidadProd) 
    {
        this.fecha = fecha;
        this.cantidadProd = cantidadProd;
        this.idProdiccion = idProdiccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidadProd() {
        return cantidadProd;
    }

    public void setCantidadProd(int cantidadProd) {
        this.cantidadProd = cantidadProd;
    }

    public int getIdProdiccion() {
        return idProdiccion;
    }

    public void setIdProdiccion(int idProdiccion) {
        this.idProdiccion = idProdiccion;
    }
    
    
}
