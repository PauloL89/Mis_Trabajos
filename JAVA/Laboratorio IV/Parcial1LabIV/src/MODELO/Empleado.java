
package MODELO;


public class Empleado 
{
    private int IdEmpleado;
    private String nombreEmpleado;

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public Empleado(int IdEmpleado, String nombreEmpleado) {
        this.IdEmpleado = IdEmpleado;
        this.nombreEmpleado = nombreEmpleado;
    }

    @Override
    public String toString() {
        return nombreEmpleado;
    }
    
    

}
