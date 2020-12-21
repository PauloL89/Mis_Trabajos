

package Modelo;


public class Oferta 
{
    private int idOferta,stockDisponible,diasVigencia;
    private double precioNormal,precioOferta;
    private String fechaInicioOferta;
    private Producto producto;

    public Oferta(int idOferta, Producto producto, int stockDisponible, int diasVigencia, double precioNormal, double precioOferta, String fechaInicioOferta) {
        this.idOferta = idOferta;
        this.producto = producto;
        this.stockDisponible = stockDisponible;
        this.diasVigencia = diasVigencia;
        this.precioNormal = precioNormal;
        this.precioOferta = precioOferta;
        this.fechaInicioOferta = fechaInicioOferta;
    }

    public int getIdOferta() 
    {
        return idOferta;
    }

    public void setIdOferta(int idOferta) 
    {
        this.idOferta = idOferta;
    }

    public Producto getProducto() 
    {
        return producto;
    }

    public void setProducto(Producto idProducto) 
    {
        this.producto = idProducto;
    }

    public int getStockDisponible() 
    {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) 
    {
        this.stockDisponible = stockDisponible;
    }

    public int getDiasVigencia() 
    {
        return diasVigencia;
    }

    public void setDiasVigencia(int diasVigencia) 
    {
        this.diasVigencia = diasVigencia;
    }

    public double getPrecioNormal() 
    {
        return precioNormal;
    }

    public void setPrecioNormal(double precioNormal) 
    {
        this.precioNormal = precioNormal;
    }

    public double getPrecioOferta() 
    {
        return precioOferta;
    }

    public void setPrecioOferta(double precioOferta) 
    {
        this.precioOferta = precioOferta;
    }

    public String getFechaInicioOferta() 
    {
        return fechaInicioOferta;
    }

    public void setFechaInicioOferta(String fechaInicioOferta) 
    {
        this.fechaInicioOferta = fechaInicioOferta;
    }

    @Override
    public String toString() 
    {
        return "Oferta{" + "idOferta=" + idOferta + ", idProducto=" + producto.getIdProducto() + ", stockDisponible=" + stockDisponible + ", diasVigencia=" + diasVigencia + ", precioNormal=" + precioNormal + ", precioOferta=" + precioOferta + ", fechaInicioOferta=" + fechaInicioOferta + '}';
    }
    
    
    
    
    
}
