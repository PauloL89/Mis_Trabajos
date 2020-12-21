

package MODELO;


public class Visita 
{
    private int idVisita,IdPaciente,legajoRecepcionista,duracion;
    private String nombre;

    public Visita(int idVisita, int IdPaciente, int legajoRecepcionista, int duracion, String nombre) {
        this.idVisita = idVisita;
        this.IdPaciente = IdPaciente;
        this.legajoRecepcionista = legajoRecepcionista;
        this.duracion = duracion;
        this.nombre = nombre;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public int getIdPaciente() {
        return IdPaciente;
    }

    public void setIdPaciente(int IdPaciente) {
        this.IdPaciente = IdPaciente;
    }

    public int getLegajoRecepcionista() {
        return legajoRecepcionista;
    }

    public void setLegajoRecepcionista(int legajoRecepcionista) {
        this.legajoRecepcionista = legajoRecepcionista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

}
