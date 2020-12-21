

package Modelo;


public class Socio extends Cliente
{

    public Socio(String nombre, String apellido, int edad, double saldo) 
    {
        super(nombre, apellido, edad, saldo);
    }
    
    @Override
    public double SaldoTotal() 
    {
        double saldo;
        
        saldo = getSaldo() + (getSaldo()* 0.10);
        
        return saldo;
    }
    
     @Override
    public String toString()
    {
        return "Nombre: " + getNombre() + "\n Apellido: " + getApellido() +"\n Saldo Total: $" + SaldoTotal();
    }

}
