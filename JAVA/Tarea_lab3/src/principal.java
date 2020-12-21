
import java.util.Scanner;

// Mostrar el numero mayor de dos numero o si son iguales
        
public class principal
{
    

    public static void main(String[] args) 
    {
        int num1,num2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresar primer numero: ");
        num1 = entrada.nextInt();
        
        
        System.out.println("Ingresar segundo numero: ");
        num2 = entrada.nextInt();
        
     
        if(num1 > num2)
            System.out.println("El numero: " + num1 + " es mayor");
        else if (num1 == num2)
            System.out.println("Los numero son iguales");
        else
            System.out.println("El numero: " + num2 + " es mayor");
        
    }
    
}


/*
 1 - Hacer un programa que ingrese los datos de una factura en la cual haya tres artículos vendidos. 
     De cada artículo ingresar el precio unitario y la cantidad. Finalmente imprimir el total de la factura

String nombreLocal = "DigiTech", tipoFactura = "A";
        int cantA, cantB, cantC;
        double a,b,c,cantTotalA,cantTotalB,cantTotalC, total;
        
        Scanner entrada = new Scanner(System.in);
        
        // Ingreso de Datos
        System.out.println("Ingresar Precio del producto A: ");
        a = entrada.nextDouble();
        System.out.println("Ingresar cantidad del producto A: ");
        cantA = entrada.nextInt();
         System.out.println("Ingresar Precio del producto B: ");
        b = entrada.nextDouble();
        System.out.println("Ingresar cantidad del producto B: ");
        cantB = entrada.nextInt();
         System.out.println("Ingresar Precio del producto C: ");
        c = entrada.nextDouble();
        System.out.println("Ingresar cantidad del producto C: ");
        cantC = entrada.nextInt();
        
        // Precio total por producto ( precio unitario * cantidad)
        
        cantTotalA = a * cantA;
        
        cantTotalB = b * cantB;
        
        cantTotalC = c* cantC;
        
        // Total de Factura
        
        total = cantTotalA + cantTotalB + cantTotalC;
        
        // Mostrar datos
        System.out.println("Local: " + nombreLocal);
        System.out.println("Tipo Factura: " + tipoFactura);
        System.out.println("El total de la factua es: $" + total);
 */



/*
// 2- Ingresar nombre y altura de dos personas, informar el nombre de la más alta.
    String personaUno, personaDos;
        int alturaPU, alturaPD;
        
        //Ingreso datos
        System.out.println("Ingresar Nombre de la Persona 1: ");
        personaUno = entrada.nextLine();
        System.out.println("Ingresar altura de " + personaUno);
        alturaPU = entrada.nextInt();
        System.out.println("Ingresar Nombre de la Persona 2: ");
        personaDos = entrada.next();
        System.out.println("Ingresar altura de " + personaDos);
        alturaPD = entrada.nextInt();
        
        // Identficar quien de la dos personas tiene mayor altura
        
        if(alturaPU > alturaPD)
        {
            System.out.println("la Persona mas alta de las dos es: " );
            System.out.println("Nombre: " + personaUno);
            System.out.println("Altura: " + alturaPU);
        }
        else
        {
            System.out.println("la Persona mas alta de las dos es: " );
            System.out.println("Nombre: " + personaDos);
            System.out.println("Altura: " + alturaPD);
        }
           
*/