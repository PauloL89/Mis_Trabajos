
package Herencia;


public abstract class Cuenta 
{
    protected int numeroCuenta;
    protected String nombre;
    protected double saldo;
    
    public Cuenta()
    {
        numeroCuenta = 0;
        nombre = "";
        saldo = 0;
    }
    
    public Cuenta(int numero, String nombre, double saldo)
    {
        numeroCuenta = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() 
    {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) 
    {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }
    
    public double depositar(double monto)
    {
        saldo = saldo + monto;
        
        return saldo;
    }
    
    public abstract double extraer(double monto);
    
    public String toStringCuenta()
    {
        return "Numero de Cuenta: " + numeroCuenta + "\n Nombre del Tiular de la cuenta: " + nombre 
                + "\n Saldo de la Cuenta: " + "$"+saldo;
    }
}
