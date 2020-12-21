

package DTO;


public class DtoProduccion 
{
    private String fecha;
    private String descripcion;
    private int total;

    public DtoProduccion(String fecha, String descripcion, int total) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
}
