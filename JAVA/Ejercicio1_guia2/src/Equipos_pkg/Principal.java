
package Equipos_pkg;


public class Principal 
{
    public static void main(String[] args) 
    {
        //Crear objeto Equipo y pasar por parametro cantidad de jugadores a agregar
        Equipo Boca = new Equipo(2);
        
        //Crear objeto jugador, pasando por parametro sus atributos
        Jugador j1 = new Jugador("Andrada", 1, 1, 20, 100);
        Jugador j2 = new Jugador("Salvio", 4, 7, 20, 100);
        
        // cargar objeto Equipo
        Boca.agregarJugador(j1);
        Boca.agregarJugador(j2);
        
        //Mostrar objeto Equipo
        System.out.println(Boca.listarJugador());
        
        
        
        //Cantidad de jugadores con menos de 10 partidos jugados.
        System.out.print("Cantidad de Jugadores con menos de 10 partidos jugados: ");
        System.out.println(Boca.cantidadJugadores());
        
        
        //Nombre del jugador con mayor cantidad de partidos jugados.
        System.out.print("Nombre del jugador con mas partidos jugados: ");
        System.out.println(Boca.jugadorMasPartidos());
        
        

        //Promedio de estado físico de todo el equipo.
        
        System.out.print("Promedio de estado fisico del equipo:");
        System.out.println(Boca.promedioEstadoFisicoEquipo() + "%");
        

        //Estado físico de un jugador particular identificado por número de camiseta. 
        
        System.out.print("Estado fisico de un juegador dado su numero de camiseta: ");
        System.out.println(Boca.estadoFisicoJugador(7) +"%");
        
        //Promedio de partidos jugados de los jugadores de cada posición (4resultados).
        
        System.out.println("Promedio de partidos jugados de los jugadores de cada posición:");
        System.out.println(Boca.promedioPartidosJugadosporPuesto());
        
        
        
        
    }
}
