

package MODELO;


public class Venta 
{
    private int idVenta;
    private String fechaVenta;
    private Pareja pareja;

    public Venta(int idVenta, String fechaVenta,Pareja pareja) 
    {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.pareja = pareja;
    }

    public int getIdVenta() 
    {
        return idVenta;
    }

    public void setIdVenta(int idVenta) 
    {
        this.idVenta = idVenta;
    }

  
    public String getFechaVenta() 
    {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) 
    {
        this.fechaVenta = fechaVenta;
    }


    public Pareja getPareja() 
    {
        return pareja;
    }

    public void setPareja(Pareja pareja) 
    {
        this.pareja = pareja;
    }

    @Override
    public String toString() 
    {
        return "idVenta: " + idVenta 
                + "\n  fecha Venta: " + fechaVenta 
                + "\n  pareja: " + pareja;
    }
    
    
    
    
    
}
