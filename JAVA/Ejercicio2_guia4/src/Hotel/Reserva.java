
package Hotel;


public class Reserva 
{
    private int num_habitacion, diasReservados,tipoReserva;
    private boolean vigente;
    
    public Reserva()
    {
        num_habitacion = 0;
        diasReservados = 0;
        tipoReserva = 0;
        vigente = false;
    }
    
    public Reserva(int numHab,int diasRev,int tipoRev,boolean vigent)
    {
        num_habitacion = numHab;
        diasReservados = diasRev;
        tipoReserva = tipoRev;
        vigente = vigent;
    }

    public int getNum_habitaciion() 
    {
        return num_habitacion;
    }

    public void setNum_habitaciion(int num_habitaciion) 
    {
        this.num_habitacion = num_habitaciion;
    }

    public int getDiasReservados() 
    {
        return diasReservados;
    }

    public void setDiasReservados(int diasReservados) 
    {
        this.diasReservados = diasReservados;
    }

    public int getTipoReserva() 
    {
        return tipoReserva;
    }

    public void setTipoReserva(int tipoReserva) 
    {
        this.tipoReserva = tipoReserva;
    }

   
    public boolean isVigente() 
    {
        return vigente;
    }

    public void setVigente(boolean vigente) 
    {
        this.vigente = vigente;
    }

    
    public String tipoReserva()
    {
        String nomTipo = "";
        if(tipoReserva == 1)
        {
            nomTipo = "Vacaciones";
        }
        else if(tipoReserva == 2)
        {
            nomTipo = "Negocios";
        }
        else
        {
            System.out.println("El tipo ingresado debe ser 1 o 2");
        }
        return  nomTipo;
    }
    
    public String vigenteText()
    {
        String texto;
        if(vigente == true)
        {
            texto = "Si";
        }
        else 
        {
            texto= "No";
        }
       
        return  texto;
    }
    
    @Override
    public String toString()
    {
        return"Numero de Habitacion: "+ num_habitacion+"\n  Cantidad de dias de Reserva: "+ diasReservados +
                "\n  Tipo de Reserva: " + tipoReserva() + "\n  Esta vigente?: "+ vigenteText();
    }
}

