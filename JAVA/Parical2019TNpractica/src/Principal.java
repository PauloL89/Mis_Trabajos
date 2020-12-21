
public class Principal 
{


    public static void main(String[] args) 
    {
        int cantidadApuestas = 2;
        int numerosalio = 20;
        Jugador jugador = new Jugador("Ragnar",cantidadApuestas);
        

        Apuesta a1 = new Apuesta(20,20,500);
         Apuesta a2 = new Apuesta(10,25,800);
         
         
         jugador.agregarApuestas(a1);
         jugador.agregarApuestas(a2);
         
         System.out.println(jugador.listarApuestas());
        
        
        //1. Cantidad de apuestas ganadas.
        System.out.println("Cantidad de apuestas ganadas.");
        System.out.println(jugador.cantidadGanada());
        
        
       /* 2. Total ganado. Puede ser negativo si perdió más que lo que ganó. 
            Para ello recordar que cada vez que se acierta un pleno se obtiene 
            36 veces el importe apostado.*/
        
        System.out.println("Dinero total ganado en apuestas o perdidas:");
        System.out.println("$" + jugador.totalGanado());
       
        //3. Dado un número en particular informar cuántas veces salió (puede ser 0).
        System.out.println("Dado un número en particular informar cuántas veces salió");
        System.out.println("El numero " + numerosalio);
        System.out.println("salió " + jugador.cantidadAparicionNum(numerosalio) + " veces");
        
        
       // 4. Suma de todo el dinero que apostó a números pares.
        System.out.println("Suma de todo el dinero que apostó a números pares.");
        System.out.println("$"+jugador.sumaApuestaPares());
       
    }
    
}
