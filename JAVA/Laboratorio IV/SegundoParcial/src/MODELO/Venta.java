

package MODELO;


public class Venta 
{
    private int idVenta;
    private Vendedor vendedor;
    private String fechaVenta;
    private Deposito deposito;
    private Pareja pareja;

    public Venta(int idVenta, Vendedor vendedor, String fechaVenta, Deposito deposito, Pareja pareja) 
    {
        this.idVenta = idVenta;
        this.vendedor = vendedor;
        this.fechaVenta = fechaVenta;
        this.deposito = deposito;
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

    public Vendedor getVendedor() 
    {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) 
    {
        this.vendedor = vendedor;
    }

    public String getFechaVenta() 
    {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) 
    {
        this.fechaVenta = fechaVenta;
    }

    public Deposito getDeposito() 
    {
        return deposito;
    }

    public void setDeposito(Deposito deposito) 
    {
        this.deposito = deposito;
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
                + "\n  vendedor: " + vendedor 
                + "\n  fecha Venta: " + fechaVenta 
                + "\n  deposito: " + deposito 
                + "\n  pareja: " + pareja;
    }
    
    
    
    
    
}
