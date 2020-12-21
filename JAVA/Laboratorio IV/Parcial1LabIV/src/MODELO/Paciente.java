
package MODELO;


public class Paciente 
{
    private int IdPaciente;
    private String nombrePaciente;

    public int getIdPaciente() {
        return IdPaciente;
    }

    public void setIdPaciente(int IdPaciente) {
        this.IdPaciente = IdPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public Paciente(int IdPaciente, String nombrePaciente) {
        this.IdPaciente = IdPaciente;
        this.nombrePaciente = nombrePaciente;
    }

    @Override
    public String toString() {
        return nombrePaciente;
    }

    
    
    
    
}
