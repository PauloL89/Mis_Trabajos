
import java.util.Scanner;


/**
 *
 * @author Paulo Lascirignola
 */

 /*
    Sacar porcentaje de un valor:
    Ejemplo: 30% de 500
     (30*500)/100 = 150
    Promedio = acumulador / cantidad;
    Porcentaje = (cantadorChico * 100)/ contadorTotal;
*/
public class Principal 
{

    /*
        Ejercicio 5
        Ingresar la cantidad de horas trabajadas por un empleado y el sueldo que
        cobra por hora. Indique el total a cobrar teniendo en cuenta que si trabajó más de
        180 horas las excedentes las cobra con un 50 % de aumento.
    */
    

    public static void main(String[] args) 
    {
       Scanner entrada = new Scanner(System.in);
       int cantHoras, sueldoXHora, sueldoTotal, horaExtras,aumento = 50;
       
        System.out.println("Ingresar Horas Trabajadas: ");
        cantHoras = entrada.nextInt();
        System.out.println("Ingesar Sueldo por Hora:");
        sueldoXHora = entrada.nextInt();
        
        sueldoTotal = sueldoXHora * cantHoras;
        
        if(cantHoras > 180)
        {
            horaExtras = (aumento * sueldoXHora)/100;
            sueldoTotal = horaExtras + sueldoTotal ;
        }
        else 
        {
            sueldoTotal = sueldoXHora * cantHoras;
        }
        
        System.out.println("Sueldo total a cobar es de : $" + sueldoTotal);
       

       
       
    }

}

/*

Ejercicio 1
        Una empresa de alquiler de autos cobra $300 por día si no se superan los 200 km de uso diario. 
        Por cada km extra hasta los 1000 km cobra $5 adicionales, y a partir de los 1000 cobra $10 adicionales. 
        Hacer un programa que solicite la cantidad de km realizados por un cliente e indique el importe 
        que se le debe cobrar.


 double precioXDia = 300;
        double importe = 0.0, recargoMenor = 5.00, recargoMayor = 10.00;
        int kmRecorrido;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresar KM recorridos");
        kmRecorrido = entrada.nextInt();
        
        if (kmRecorrido > 200 && kmRecorrido < 1000) 
        {
            importe = precioXDia + recargoMenor;
        } 
        else 
            if (kmRecorrido >= 1000)
        {
            importe = precioXDia + recargoMayor;
        }
        
        System.out.println("Kilometros Realizados: Km " + kmRecorrido);
        System.out.println("Su importe es de $" + importe);
*/


    /*
    Ejercicio 2
       Desarrollar un programa que permita ingresar la antigüedad los autos de una concesionaria de usados. 
        Finalizar la carga cuando se ingrese 0. Por cada auto ingresado mostrar por pantalla un mensaje 
        adecuado con el siguiente criterio: si el auto tiene entre 1 y 5 años mostrar el texto “NUEVO”, 
        si tiene entre 6 y 10 mostrar “POCO USO”, si tiene entre 11 y 20 “MUCHO USO” y si tiene más de 20 “MUY ANTIGUO”. 
        Luego de finalizada la carga calcular y mostrar los siguientes resultados:
        Cantidad total de autos.
        Cantidad de autos con poco uso.
        Promedio de antigüedad de los autos que no sean muy antiguos.


        int antiguedad,contAuto = 0,contPocoUso = 0,acumAnios = 0, contTotal = 0,salida;
       double promAntigAutos;
       String nuevo = "Nuevo", pocoUso = "Poco Uso", MuchoUso = "Mucho Uso", antiguo = "Muy Antiguo";
       
       System.out.println("Precione 1 para continuar o 0 para salir: ");
        salida = entrada.nextInt();
        
        while (salida > 0)
        {
           

            System.out.println("Ingrese antiguedad del auto: ");
            antiguedad = entrada.nextInt();
            if(antiguedad >= 1 && antiguedad <= 5)
            {
                System.out.println(nuevo);
                contTotal ++;
                contAuto++;
                acumAnios = acumAnios + antiguedad;
            }
            else 
                if(antiguedad >= 6  && antiguedad <= 10 && antiguedad > 5)
                {
                    System.out.println(pocoUso);
                    contTotal ++;
                    contPocoUso++;
                    contAuto++;
                    acumAnios = acumAnios + antiguedad;
                }
                else 
                    if(antiguedad >= 11 && antiguedad <= 20 && antiguedad > 10)
                    {
                        System.out.println(MuchoUso);
                        contTotal++;
                        contAuto++;
                        acumAnios = acumAnios + antiguedad;
                    }
            else
                        if(antiguedad > 20)
                        {
                            System.out.println(antiguo);
                            contAuto++;
                        }
            
            System.out.println("Precione 1 para continuar o 0 para salir: ");
            salida = entrada.nextInt();
        }
        
        promAntigAutos = acumAnios / contTotal;
        System.out.println("El sistema ha finalidado con exito");
        System.out.println("Cantidad Total de autos: " + contAuto);
        System.out.println("Cantidad de autos con poco uso: " + contPocoUso);
        System.out.println("Pormedio de antiguedad de autos no muy antiguos: " + promAntigAutos);

     */

