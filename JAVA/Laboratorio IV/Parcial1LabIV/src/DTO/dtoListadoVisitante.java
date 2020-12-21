

package DTO;


public class dtoListadoVisitante 
{
    private String nombrePaciente;
    private int cantidad;

    public dtoListadoVisitante(String nombrePaciente, int cantidad) {
        this.nombrePaciente = nombrePaciente;
        this.cantidad = cantidad;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Nombre del Paciente: " + nombrePaciente + ", Cantidad: de Visitas: " + cantidad;
    }
    
    

}
