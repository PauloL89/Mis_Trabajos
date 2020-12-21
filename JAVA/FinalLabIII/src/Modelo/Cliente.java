
package Modelo;

public abstract class Cliente 
{
    private String nombre, apellido;
    private int edad;
    private double saldo;

    public Cliente(String nombre, String apellido, int edad, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public abstract double SaldoTotal();

    @Override
    public String toString() 
    {
        return "Nombre: " + nombre + "\n Apellido: " + apellido + "\n Edad: " + edad + "\n Saldo: $" + saldo;
    }
    
    
    
}
