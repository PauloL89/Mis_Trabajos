
package Equipos_pkg;


public class Equipo 
{
    Jugador[] jugadores;
    
    public Equipo(int cantJugadores)
    {
        jugadores = new Jugador[cantJugadores];
    }
    
    public void agregarJugador(Jugador jugador)
    {
        for (int i = 0; i < jugadores.length; i++) 
        {
            if(jugadores[i] == null)
            {
                jugadores[i] = jugador;
                break;
            }
            
        }
    }
    
    public String listarJugador()
    {
        String listado = "";
        for (int i = 0; i < jugadores.length; i++)
        {
            if(jugadores[i] != null)
            {
                Jugador j = jugadores[i];
                listado += j.toStringJugador();
            }
            
        }
        return listado;
    }
    
    
    // cantidad de jugadores con menos de 10 partidos jugados
    public int cantidadJugadores()
    {
        int cantidad = 0;
        for (int i = 0; i < jugadores.length; i++)
        {
            if(jugadores[i] != null && jugadores[i].getCantPartJugados() < 10)
            {
                cantidad++;
            }
            
        }
        return  cantidad;
    }
    
    // debe devolver el nombre del jugador con mayor partidos jugados.
    public String jugadorMasPartidos()
    {
        String nombre = "";
        int mayorCant = 0;
        for (int i = 0; i < jugadores.length; i++)
        {
            if(jugadores[i] != null)
            {
                Jugador j = jugadores[0];
                mayorCant = j.getCantPartJugados();
                nombre = j.getNombre();
                
                if(jugadores[i].getCantPartJugados() > mayorCant)
                {
                    mayorCant = jugadores[i].getCantPartJugados();
                    nombre = jugadores[i].getNombre();
                }
            }
            
        }
        return nombre;
    }
    
    //Promedio de estado fisico de todo el equipo
    public double promedioEstadoFisicoEquipo()
    {
        double promedio = 0;
        int acumulador = 0;
        int contador = 0;
        for (int i = 0; i < jugadores.length; i++)
        {
            if(jugadores[i] != null)
            {
                acumulador += jugadores[i].getEstadoFisico();
                contador++;
            }
            
        }
        promedio = acumulador / contador;
        return promedio;
    }
    
    // Estado fisico de un jugador pasando su numero de camiseta por parametro.
    public int estadoFisicoJugador(int numCamiseta)
    {
        int estadoFisico = 0;
        
        for (int i = 0; i < jugadores.length; i++)
        {
            if(jugadores[i] != null && jugadores[i].getNumCamiseta() == numCamiseta)
            {
                estadoFisico = jugadores[i].getEstadoFisico();
            }
            
        }
        return  estadoFisico;
    }
    
    
    
    //Promedio de partidos jugados de los jugadores de cada posicion
    public String promedioPartidosJugadosporPuesto()
    {
        String listados;
        double promArquero,promDef,promMed, promDel;
        int acumArq = 0, acumDef = 0,acumMed = 0,acumDel = 0;
        int contArq = 0, contDef = 0,contMed = 0,contDel = 0;
        for (int i = 0; i < jugadores.length; i++)
        {
            if(jugadores[i] != null)
            {
                switch (jugadores[i].getPosicion()) 
                {
                    case 1:
                        acumArq += jugadores[i].getCantPartJugados();
                        contArq++;
                        break;
                    case 2:
                        acumDef += jugadores[i].getCantPartJugados();
                        contDef++;
                        break;
                    case 3:
                        acumMed += jugadores[i].getCantPartJugados();
                        contMed++;
                        break;
                    case 4:
                        acumDel += jugadores[i].getCantPartJugados();
                        contDel++;
                        break;
                    default:
                        System.out.println("Sin posicion");
                } // fin swicht
            } // fin if
            
        } // fin for
        
        //promedio = acumulador / contador;
        if(acumArq != 0 && contArq != 0) // verificar que este cargado el puesto
        {
           promArquero = acumArq / contArq;
        }
        else
            promArquero = 0;
        
        
        if(acumDef != 0 && contDef != 0)
        {
            promDef = acumDef / contDef;
        }
        else
            promDef = 0;
        
        if(acumMed != 0 && contMed != 0)
        {
            promMed = acumMed / contMed;
        }
        else
            promMed = 0;
        
        
        if(acumDel != 0 && contDel != 0)
        {
           promDel = acumDel / contDel;
        }
        else
            promDel = 0;
        
       
       
        
        
        listados = "Promedio de partido jugados de arqueros: " + promArquero 
                + "\n Promedio de partido jugados de defensores: " + promDef 
                + "\n Promedio de partido jugados de mediocampistas: " + promMed 
                + "\n Promedio de partido jugados de delanteros: " + promDel;
        return listados;
    } // fin del metodo
    
} // fin de la clase
