

package MODELO;


public class Deposito 
{
    private int idDeposito;
    private Invitado invitado;
    private float montoDepositado;
    private Pareja pareja;

    public Deposito(int idDeposito, Invitado invitado, float montoDepositado, Pareja pareja) 
    {
        this.idDeposito = idDeposito;
        this.invitado = invitado;
        this.montoDepositado = montoDepositado;
        this.pareja = pareja;
    }

    public int getIdDeposito()
    {
        return idDeposito;
    }

    public void setIdDeposito(int idDeposito) 
    {
        this.idDeposito = idDeposito;
    }

    public Invitado getInvitado() 
    {
        return invitado;
    }

    public void setInvitado(Invitado invitado) 
    {
        this.invitado = invitado;
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

    @Override
    public String toString() 
    {
        
        return "invitado: " + invitado + 
                "\n  Monto Depositado: " + montoDepositado 
                + "\n  Pareja: " + pareja;
    }
    
    
    

}
