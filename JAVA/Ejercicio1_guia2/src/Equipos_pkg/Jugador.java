
package Equipos_pkg;


public class Jugador
{
    private String nombre;
    private int posicion, numCamiseta,cantPartJugados, estadoFisico;

    public Jugador() 
    {
        
    }

    public Jugador(String nombre, int posicion, int numCamiseta, int cantPartJugados, int estadoFisico)
    {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numCamiseta = numCamiseta;
        this.cantPartJugados = cantPartJugados;
        this.estadoFisico = estadoFisico;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getPosicion() 
    {
        return posicion;
    }

    public void setPosicion(int posicion) 
    {
        this.posicion = posicion;
    }

    public int getNumCamiseta() 
    {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) 
    {
        this.numCamiseta = numCamiseta;
    }

    public int getCantPartJugados() 
    {
        return cantPartJugados;
    }

    public void setCantPartJugados(int cantPartJugados) 
    {
        this.cantPartJugados = cantPartJugados;
    }

    public int getEstadoFisico() 
    {
        return estadoFisico;
    }

    public void setEstadoFisico(int estadoFisico) 
    {
        this.estadoFisico = estadoFisico;
    }
    
    
    public String posicionJugador()
    {
        String posicionJugador;
        switch (getPosicion()) 
        {
            case 1:
                posicionJugador = "Arquero ";
                break;
            case 2:
                posicionJugador = "Defensor ";
                break;
            case 3:
                posicionJugador = "Mediocampista ";
                break;
            case 4:
                posicionJugador = "Delantero ";
                break;
            default:
                posicionJugador = "Sin posicion definida ";;
        }
        
        return posicionJugador;
    }
    

    public String toStringJugador() 
    {
        return "Nombre del jugador: " + nombre + "\n Posicion del jugador: " + posicionJugador() + "\n Numero de camiseta: " + numCamiseta
                + "\n Cantidad de partidos jugados: " + cantPartJugados + "\n Estado fisico: " + estadoFisico + "\n";
    }
    
    
    
    
    
    
}
