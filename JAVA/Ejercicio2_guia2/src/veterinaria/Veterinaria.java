
package veterinaria;


public class Veterinaria
{
    Cliente[] clientes;
    
    public Veterinaria(int cantCliente)
    {
        clientes = new Cliente[cantCliente];
    }
    
    public void agregarCliente(Cliente c)
    {
        for (int i = 0; i < clientes.length; i++)
        {
            if(clientes[i] == null)
            {
               clientes[i] = c;
               break;
            }
            
        }
    }
    
    public String listarClientes()
    {
        String listado = "";
        for(int i = 0; i < clientes.length; i++)
        {
            if(clientes[i] != null)
            {
                Cliente c = clientes[i];
                listado += c.toStringCliente();
            }
        }
        
        return listado;
    }
    
    public int cantidadCliente()
    {
        int cantidad = 0;
        for (int i = 0; i < clientes.length; i++)
        {
            if(clientes[i] != null)
            {
                cantidad++;
            }
            
        }
        return cantidad;
    }
    
    public int mayorAntiguedad()
    {
        int contador = 0;
        
        for (int i = 0; i < clientes.length; i++) 
        {
            if(clientes[i] != null && clientes[i].antiguedad >= 5)
            {
                contador++;
            } 
        }
        
        return  contador;
    }
    
    public double promedioEdadMascota()
    {
        double promedio;
        double sumaEdad = 0;
        int contador = 0;
        
        for (int i = 0; i < clientes.length; i++) 
        {
            if(clientes[i] != null)
            {
                sumaEdad += clientes[i] .mascota.GetEdadMascota();
                contador++;
            }
            
        }
        
        promedio = sumaEdad / contador;
        
        return promedio;
    }
}
