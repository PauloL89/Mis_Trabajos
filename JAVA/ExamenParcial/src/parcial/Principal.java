
package parcial;

import java.util.Scanner;

/**
 *
 * @author Paulo Lascirignola Legajo 11549
 * curso 2w50
 */
public class Principal 
{
   
    public static void main(String[] args) 
    {
         Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar Kilometraje: ");
        int kilometraje = entrada.nextInt();
        
        System.out.println("Ingresar cantidad de cargas de combustibles: ");
        int cantidad = entrada.nextInt();
        
        EstacionServicio estServ = new EstacionServicio(kilometraje, cantidad);
        
        for (int i = 0; i < cantidad; i++) 
        {
            System.out.println("Ingresar Litros cargados: ");
            int litros = entrada.nextInt();
            
            System.out.println("Ingresar Importe abonado: ");
            double importe = entrada.nextDouble();
            
            Combustible c = new Combustible(litros, importe);
            
            estServ.agregarCombustible(c);
        }
        
        System.out.print("Mayor importe abonado: ");
        System.out.println(estServ.MayorImporteAbonado());
        
        System.out.print("Suma de todos los litros cargados: ");
        System.out.println(estServ.sumalitrosCargados() + " litros");
        
        System.out.println("Cantidad de cargas de combustible con un kilometraje menor a un valor especificado por el usuario: ");
        System.out.println("Ingresar Kilometros: ");
        int kilometros = entrada.nextInt();
        System.out.println("cantidad es igual a: " + estServ.cantidadCombustibleCargado(kilometros));
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
}
