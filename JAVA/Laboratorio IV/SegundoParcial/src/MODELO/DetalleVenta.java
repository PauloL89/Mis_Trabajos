

package MODELO;


public class DetalleVenta 
{
    private Venta venta;
    private Articulo articulo;
    private float precioUnitario;

    public DetalleVenta(Venta venta, Articulo articulo, float precioUnitario) 
    {
        this.venta = venta;
        this.articulo = articulo;
        this.precioUnitario = precioUnitario;
    }

    public Venta getVenta() 
    {
        return venta;
    }

    public void setVenta(Venta venta) 
    {
        this.venta = venta;
    }

    public Articulo getArticulo() 
    {
        return articulo;
    }

    public void setArticulo(Articulo articulo) 
    {
        this.articulo = articulo;
    }

    public float getPrecioUnitario() 
    {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) 
    {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() 
    {
        return "venta: " + venta 
                + "\n  articulo: " + articulo 
                + "\n  precio Unitario: " + precioUnitario;
    }
    
    
    

}
