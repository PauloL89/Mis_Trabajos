
package Modelo;

import java.util.ArrayList;


public class ParqueDiversiones 
{
    ArrayList<Cliente> listaCliente;
    private boolean bandera = true;
    private boolean banderaMenos = true;
    
    public ParqueDiversiones()
    {
        listaCliente = new ArrayList();
    }
    
    
    public void AgregarCliente(Cliente cliente)
    {
        listaCliente.add(cliente);
    }
    
    
    public ArrayList<Cliente> mostrarListado()
    {
        for (Cliente cliente : listaCliente) 
        {
            cliente.toString();
        }
        return listaCliente;
    }
    
    
    //La cantidad de clientes que asistieron al parque que tengan más de 18 años.
    
    public int cantidadClientemayorEdad()
    {
        int contador = 0;
        
        for (Cliente cliente : listaCliente) 
        {
            if(cliente.getEdad() >= 18)
            {
                contador++;
            }
        }
        
        
        return contador;
    }
    
    
    //La recaudación total del parque.
    
    public double recaudacionTotal()
    {
        double total = 0;
        
        for (Cliente cliente : listaCliente) 
        {
            total += cliente.SaldoTotal();
        }
        
        return total;
    }
    
    
    //Socio que gastó más dinero en el parque.
    
    public String socioQueMasGasto()
    {
        String nombre = "", apellido = "";
        double saldoMayor = 0;
        for (Cliente cliente : listaCliente) 
        {
            if(cliente instanceof Socio && bandera)
            {
                nombre = cliente.getNombre();
                apellido = cliente.getApellido();
                saldoMayor = cliente.SaldoTotal();
                bandera = false;
            }
            else if(cliente instanceof  Socio && cliente.SaldoTotal() > saldoMayor)
            {
                nombre = cliente.getNombre();
                apellido = cliente.getApellido();
                saldoMayor = cliente.SaldoTotal();
            }
        }
        
        return nombre + "\n " + apellido;
    }
    
    //Saldo promedio de los clientes.
    
    public double SaldoPromedioClientes()
    {
        double acumulador = 0;
        int contador = 0;
        
        for (Cliente cliente : listaCliente) 
        {
            acumulador += cliente.SaldoTotal();
            contador++;
        }
        
        return acumulador / contador;
    }
    
    //Cliente que menos saldo cargo y que haya traído algún acompañante.
     
    public String socioQueMenosGasto()
    {
        String nombre = "", apellido = "";
        double saldoMenor = 0;
        double saldoMenorActual = 0;
        for (Cliente cliente : listaCliente) 
        {
            
            if(banderaMenos)
            {
                Nuevo n = (Nuevo) cliente;
                if(n.isAcompanante())
                {
                    nombre = cliente.getNombre();
                    apellido = cliente.getApellido();
                    saldoMenor = cliente.SaldoTotal();
                    saldoMenorActual = saldoMenor;
                    banderaMenos = false;
                }
                
            }
            else if(cliente.SaldoTotal() < saldoMenor)
            {
                 Nuevo n = (Nuevo) cliente;
                 if(n.isAcompanante())
                 {
                     nombre = cliente.getNombre();
                    apellido = cliente.getApellido();
                    saldoMenor = cliente.SaldoTotal();
                    saldoMenorActual = saldoMenor;
                 }
                
            }
            else
            {
                saldoMenorActual = saldoMenor;
                nombre = cliente.getNombre();
                apellido = cliente.getApellido();
            }
        }
        
        return nombre + "\n " + apellido;
    }
    
    //Mostrar el monto total cargado por clientes que sean mayores a una edad que el usuario
    //pueda ingresar en un cuadro de texto
    
    public double mostrarSaldoClientes(int edad)
    {
        double saldoTotal = 0;
        
        for (Cliente cliente : listaCliente) 
        {
            if(edad > 30)
            {
                saldoTotal += cliente.SaldoTotal();
            }
        }
        
        return saldoTotal;
    }
    
    
    
}
