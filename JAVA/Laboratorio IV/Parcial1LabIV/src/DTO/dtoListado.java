

package DTO;


public class dtoListado 
{
   private String nombrePaciente, nombreVisita,nombreEmpleado;
   private int duracion;

    public dtoListado(String nombrePaciente, String nombreVisita, String nombreEmpleado, int duracion) {
        this.nombrePaciente = nombrePaciente;
        this.nombreVisita = nombreVisita;
        this.nombreEmpleado = nombreEmpleado;
        this.duracion = duracion;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getNombreVisita() {
        return nombreVisita;
    }

    public void setNombreVisita(String nombreVisita) {
        this.nombreVisita = nombreVisita;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
   
   

}
