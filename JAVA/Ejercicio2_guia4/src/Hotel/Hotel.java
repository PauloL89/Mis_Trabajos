
package Hotel;

import java.util.ArrayList;


public class Hotel 
{
    
    ArrayList<Reserva> reservas;
    
    public Hotel()
    {
        reservas = new ArrayList<>();
    }
    
    public void agregarReserva(Reserva r)
    {
        reservas.add(r);
    }
    
    public String listarReservas()
    {
        String texto= " ";
        for (Reserva reserva : reservas)
        {
           texto = reservas.toString();
        }
        
        return texto;
    }
    
 
}
