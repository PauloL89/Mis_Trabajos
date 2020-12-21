
package veterinaria;
//import java.util.*;

import java.util.Scanner;

/*
    EJERCICIO 2 - GUIA 2
2. Una Veterinaria encargada del cuidado de mascotas ha solicitado la realización
de un software para obtener resultados sobre sus clientes y sus respectivas
mascotas. (Suponer que cada cliente posee una sola mascota)
Se sabe que cada Cliente de esta veterinaria tienen: un numero de cliente, un
nombre, una antigüedad (hace cuánto que son clientes de la veterinaria) y una
Mascota. De la Mascota se dispone los siguientes datos: el nombre y la edad.
El software requiere cargar un número n de Clientes (este valor deberá ser cargado
por teclado). Almacenar la información de los clientes en un arreglo.
Se pide:
 Mostrar la cantidad de clientes.
 Mostrar el promedio de edad de las mascotas.
 Informar cuántos clientes tienen una antigüedad mayor igual a 5 años
*/

public class Veterinaria 
{
 
    
    public static void main(String[] args)
    {
        // entrada por teclado
        Scanner entrada = new Scanner(System.in);
       

        System.out.println("Ingresar la cantidad de clientes a cargar: ");
        // variable para asignar el tamaño del arreglo
        int cantidadCliente = entrada.nextInt();
        
        // crear y cargar objeto mascota
        Mascota m1= new Mascota("Odin", 5);
        Mascota m2= new Mascota("Thor", 3);
        
        // crear y cargar objeto cliente
        Cliente c1 = new Cliente("Ragnar", 1, 5, m1);
        Cliente c2 = new Cliente("Lagherta", 2, 2, m2);
        
        // Crear arreglo de cliente
        Cliente[] cliente = new Cliente[cantidadCliente];
        
        // cargar arreglo de cliente
        cliente[0] = c1;
        cliente[1] = c2;
        
        
        //Muestra cantidad de clientes cargados
        System.out.println("Cantidad de clientes: "+ cliente.length);
        
        // Muestra a los clientes cargados
        for (int i = 0; i < cliente.length; i++)
        {
            
            System.out.println(cliente[i].toStringCliente());

        }
        

        
        //promedio edad mascota
        
        double promedio = 0;
        int sumaEdad = 0;
        
        for (int i = 0; i < cliente.length; i++) 
        {
            sumaEdad += cliente[i].mascota.GetEdadMascota();  
        }
        
        promedio = (double)sumaEdad / cliente.length;
        
        System.out.println("Promedio de edad de las mascotas es de: " + promedio);
        
        
        
        // Muestra cuantos clientes tienen una antiguedad  mayor o igual a 5 (antiguedad >= 5)
        
        int contador = 0;
        
        for (int i = 0; i < cliente.length; i++) 
        {
            if(cliente[i].antiguedad >= 5)
            {
                contador++;
            } 
        }
        
        System.out.println("Cantidad de clientes con antiguedad mayor o igual a 5 años es de: " + contador);

    }
    
    
    
    
}
