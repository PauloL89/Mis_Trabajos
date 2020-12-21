
package veterinaria;
/*
de cada Cliente de esta veterinaria tienen: un numero de cliente, un
nombre, una antigüedad (hace cuánto que son clientes de la veterinaria)
y una Mascota.

Mostrar la cantidad de clientes.
 Informar cuántos clientes tienen una antigüedad mayor igual a 5 años
*/

public class Cliente 
{
    int numCliente, antiguedad;
    String nombre;
    Mascota mascota = new Mascota();
    
    public Cliente()
    {
        numCliente = 0;
        antiguedad =0;
        nombre = " ";
        mascota = null;
    }
    
    public Cliente(String nom, int numCli,int ant, Mascota masc)
    {
        nombre = nom;
        numCliente = numCli;
        antiguedad = ant;
        mascota = masc;
    }

    public int getNumCli() 
    {
        return numCliente;
    }

    public void setNumCli(int numCli) 
    {
        numCliente = numCli;
    }

    public int getAntiguedad()
    {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) 
    {
        this.antiguedad = antiguedad;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    
    public String toStringCliente()
    {
        return "Cliente: \n" + " nombre del cliente: " + nombre + "\n numero de cliente: " + numCliente + 
                "\n antiguedad del cliente: " + antiguedad + " años" + "\n Mascota: \n" + mascota.toStringMascota();
    }
    
    
    
}
