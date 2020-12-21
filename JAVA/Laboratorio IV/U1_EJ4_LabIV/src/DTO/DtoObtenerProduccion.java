

package DTO;

public class DtoObtenerProduccion
{
    private int idProduccion;
    private int idReponsable;
    private String fecha;
    private int idComponente;
    private int cantidad;
    private String descripcion;
    private String nombre;

    public DtoObtenerProduccion(int idProduccion, int idReponsable, String fecha, int idComponente, int cantidad, String descripcion, String nombre) {
        this.idProduccion = idProduccion;
        this.idReponsable = idReponsable;
        this.fecha = fecha;
        this.idComponente = idComponente;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public int getIdProduccion() {
        return idProduccion;
    }

    public void setIdProduccion(int idProduccion) {
        this.idProduccion = idProduccion;
    }

    public int getIdReponsable() {
        return idReponsable;
    }

    public void setIdReponsable(int idReponsable) {
        this.idReponsable = idReponsable;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() 
    {
        return "Responsable: " + nombre + ", fecha: " + fecha + ", cantidad: " + cantidad + ", Componente: " + descripcion;
    }

    
    
}
