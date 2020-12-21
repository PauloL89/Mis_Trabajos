

package Modelo;

public class Nuevo extends  Cliente
{
    private boolean acompanante;

    public Nuevo(boolean acompanante, String nombre, String apellido, int edad, double saldo) {
        super(nombre, apellido, edad, saldo);
        this.acompanante = acompanante;
    }

    public boolean isAcompanante() {
        return acompanante;
    }

    public void setAcompanante(boolean acompanante) {
        this.acompanante = acompanante;
    }

    public String compania()
    {
        String texto;
        if(acompanante == true)
            texto = "Si";
        else
            texto = "No";
        
        return  texto;
    }
    
    @Override
    public double SaldoTotal() 
    {
        double saldo;
        if(acompanante)
        {
            saldo = getSaldo() + 50;
        }
        else
        {
            saldo = getSaldo();
        }
        return saldo;
    }

    @Override
    public String toString()
    {
        return "Nombre: " + getNombre() + "\n Apellido: " + getApellido() 
                +"\n Saldo Total: $" + SaldoTotal() + "\n Acompanante: " + compania();
    }
    
    
}
