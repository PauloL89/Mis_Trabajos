
public class Apuesta 
{
    private int numeroJugado, numero_que_Salio;
    private double dineroApostado;
    
    private Apuesta()
    {
        numeroJugado = 0;
        numero_que_Salio =0;
        dineroApostado =0;
    }
    
    public Apuesta(int numerojugado, int numerosalio, double dineroapostado)
    {
        numeroJugado = numerojugado;
        numero_que_Salio = numerosalio;
        dineroApostado = dineroapostado;
    }

    public int getNumeroJugado()
    {
        return numeroJugado;
    }

    public void setNumeroJugado(int numeroJugado) 
    {
        this.numeroJugado = numeroJugado;
    }

    public int getNumero_que_Salio() 
    {
        return numero_que_Salio;
    }

    public void setNumero_que_Salio(int numero_que_Salio) 
    {
        this.numero_que_Salio = numero_que_Salio;
    }

    public double getDineroApostado() 
    {
        return dineroApostado;
    }

    public void setDineroApostado(double dineroApostado)
    {
        this.dineroApostado = dineroApostado;
    }
    
    public String toStringApuesta()
    {
        return "Numero apostado: " + numeroJugado + "\n Numero que salio: " + numero_que_Salio
                + "\n Dinero apostado: $" + dineroApostado +"\n";
    }
    
    
    
}
