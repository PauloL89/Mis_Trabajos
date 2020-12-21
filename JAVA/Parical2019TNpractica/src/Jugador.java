
public class Jugador
{
    private String nombre;
    private Apuesta[] apuestas;
    
    public Jugador(String nombre,int cantApuestas)
    {
        this.nombre = nombre;
        apuestas = new Apuesta[cantApuestas];
    }
    
    public void agregarApuestas(Apuesta apuesta)
    {
        for (int i = 0; i < apuestas.length; i++) 
        {
            if(apuestas[i] == null)
            {
                apuestas[i] = apuesta;
                break;
            }
            
        }
    }
    
    
    public String listarApuestas()
    {
        String listar = "";
        for (int i = 0; i < apuestas.length; i++) 
        {
           if(apuestas[i] != null)
           {
               Apuesta a = apuestas[i];
               listar += "Lista de apuestas del jugador: " + nombre + "\n" + a.toStringApuesta();
           }
            
        }
        
        return listar;
    }
    
    
    
    public int cantidadGanada()
    {
        int cantganada = 0;
        
        for (int i = 0; i < apuestas.length; i++) 
        {
            if(apuestas[i] != null && apuestas[i].getNumeroJugado() == apuestas[i].getNumero_que_Salio())
            {
                cantganada++;
            }
            
        }
        
        return cantganada;
    }
    
    
    public double totalGanado()
    {
        double total = 0;
        
        for (int i = 0; i < apuestas.length; i++)
        {
            if(apuestas[i] != null && apuestas[i].getNumeroJugado() == apuestas[i].getNumero_que_Salio())
            {
                total += apuestas[i].getDineroApostado()*36;
            }
            else
                total -= apuestas[i].getDineroApostado();
            
        }
        return total;
    }
    
    
    public int cantidadAparicionNum(int numero)
    {
        int contNumero = 0;
        for (int i = 0; i < apuestas.length; i++)
        {
            if(apuestas[i] != null && apuestas[i].getNumero_que_Salio() == numero)
            {
                contNumero++;
            }
            
        }
        return contNumero;
    }
    
    // si el resultado de la division me da cero es porque son numero par y si es diferente de 0 es impar
    public double sumaApuestaPares()
    {
        double sumatotal = 0;
        for (int i = 0; i < apuestas.length; i++) 
        {
            if(apuestas[i] != null && apuestas[i].getNumeroJugado() %2 == 0)
            {
                sumatotal += apuestas[i].getDineroApostado();
            }
            
        }
        return sumatotal;
    }
    
}
