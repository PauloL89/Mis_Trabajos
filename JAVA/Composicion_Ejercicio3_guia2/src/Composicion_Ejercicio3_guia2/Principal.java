
package Composicion_Ejercicio3_guia2;

import java.util.Arrays;

/*
    Desarrolle un programa principal que permita ingresar los datos de un
    producto, cree un objeto de esa clase y luego posibilite mediante un menú
    llamar a los métodos de los puntos 4 a 8 todas las veces y en el orden que el
    usuario quiera.
*/


public class Principal
{
    public static void main(String[] args) 
    {
        int cantMateriales = 4;
        Producto  producto = new Producto("Puerta",cantMateriales);
        
        Material material = new Material("Hierro", 1,100);
        
        producto.AgregarMaterial(material);
        
        Material[] materiales = producto.valorUnitarioMenor(50);
        System.out.println("Los materiales con valor unitario menor a 50 son: ");
        for (int i = 0; i < materiales.length; i++) 
        {
            if(materiales[i] != null)
            System.out.println(materiales[i].toString());
            
        }
        
        int[] contadores = producto.materialXprecio();
        System.out.println("Los materiales con valor unitario entre 0 y 10 son : " + contadores[0]);
        System.out.println("Los materiales con valor unitario entre 10 y 20 son : " + contadores[1]);
        System.out.println("Los materiales con valor unitario entre 20 y 30 son : " + contadores[2]);
        System.out.println("Los materiales con valor unitario mayor a 30 son : " + contadores[3]);
    }
}
