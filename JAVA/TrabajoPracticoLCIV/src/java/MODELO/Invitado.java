
package MODELO;

public class Invitado 
{
    private int idInvitado;
    private String nombreInvitado, apellidoInvitado;
    private String telefono;

    public Invitado(int idInvitado, String nombreInvitado, String apellidoInvitado, String telefono)
    {
        this.idInvitado = idInvitado;
        this.nombreInvitado = nombreInvitado;
        this.apellidoInvitado = apellidoInvitado;
        this.telefono = telefono;
    }

    public int getIdInvitado() 
    {
        return idInvitado;
    }

    public void setIdInvitado(int idInvitado) 
    {
        this.idInvitado = idInvitado;
    }

    public String getNombreInvitado() 
    {
        return nombreInvitado;
    }

    public void setNombreInvitado(String nombreInvitado) 
    {
        this.nombreInvitado = nombreInvitado;
    }

    public String getApellidoInvitado() 
    {
        return apellidoInvitado;
    }

    public void setApellidoInvitado(String apellidoInvitado) 
    {
        this.apellidoInvitado = apellidoInvitado;
    }

    public String getTelefono() 
    {
        return telefono;
    }

    public void setTelefono(String telefono) 
    {
        this.telefono = telefono;
    }

    @Override
    public String toString() 
    {
        return "nombre Invitado: " + nombreInvitado 
                + "\n apellido Invitado: " + apellidoInvitado 
                + "\n  telefono: " + telefono;
    }
    
    
    
    
}
