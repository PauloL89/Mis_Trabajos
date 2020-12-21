

package MODELO;


public class Deposito 
{
    private int idDeposito;
    private float montoDepositado;
    private Pareja pareja;
    String nombreInvitado,apellidoInvitado,telefonoInvitado;
    private boolean estado;


    public Deposito(int idDeposito, float montoDepositado, Pareja pareja, String nombreInvitado, String apellidoInvitado, String telefonoInvitado) {
        this.idDeposito = idDeposito;
        this.montoDepositado = montoDepositado;
        this.pareja = pareja;
        this.nombreInvitado = nombreInvitado;
        this.apellidoInvitado = apellidoInvitado;
        this.telefonoInvitado = telefonoInvitado;
    }

    
    public Deposito()
    {
        estado = true;
    }
    

    public int getIdDeposito()
    {
        return idDeposito;
    }

    public void setIdDeposito(int idDeposito) 
    {
        this.idDeposito = idDeposito;
    }

 
    public float getMontoDepositado() 
    {
        return montoDepositado;
    }

    public void setMontoDepositado(float montoDepositado) 
    {
        this.montoDepositado = montoDepositado;
    }

    public Pareja getPareja() 
    {
        return pareja;
    }

    public void setPareja(Pareja pareja) 
    {
        this.pareja = pareja;
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

    public String getTelefonoInvitado() 
    {
        return telefonoInvitado;
    }

    public void setTelefonoInvitado(String telefonoInvitado) 
    {
        this.telefonoInvitado = telefonoInvitado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    

    @Override
    public String toString() 
    {
        
        return "Monto Depositado: " + montoDepositado 
                + "\n  Novio: " + pareja.getPrimerConyuge()
                 + "\n  Novia: " + pareja.getSegundoConyuge()
                + "\n  Nombre del Invitado: " + nombreInvitado
                + "\n  Apellido del Invitado: " + apellidoInvitado
                + "\n  Telefono del Invitado: " + telefonoInvitado;
    }
    
    
    

}
