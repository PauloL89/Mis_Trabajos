
public class Prestamo 
{
    private String solicitante;
    private int cantidadDias;
    private boolean devuelto;
    
    public Prestamo()
    {
        solicitante = "";
        cantidadDias = 0;
        devuelto = false;
    }
    
    public Prestamo(String solicitud, int cantDias,boolean devolucion)
    {
        solicitante = solicitud;
        cantidadDias = cantDias;
        devuelto = devolucion;
    }

    public String getSolicitante()
    {
        return solicitante;
    }

    public void setSolicitante(String solicitante) 
    {
        this.solicitante = solicitante;
    }

    public int getCantidadDias() 
    {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias)
    {
        this.cantidadDias = cantidadDias;
    }

    public boolean isDevuelto() 
    {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto)
    {
        this.devuelto = devuelto;
    }

    
    public String toStringPrestamo() 
    {
        return "Prestamo:" + " solicitante: " + solicitante + ", cantidadDias:" + cantidadDias + ", devuelto:" + devuelto;
    }
    
    
}
