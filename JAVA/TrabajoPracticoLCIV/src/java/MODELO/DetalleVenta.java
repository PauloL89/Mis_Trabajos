

package MODELO;


public class DetalleVenta 
{
    private int idDetalle;
    private Venta venta;
    private Articulo articulo;
    private float precioUnitario;

    public DetalleVenta(int id,Venta venta, Articulo articulo, float precioUnitario) 
    {
        idDetalle = id;
        this.venta = venta;
        this.articulo = articulo;
        this.precioUnitario = precioUnitario;
    }

    public int getIdDetalle()
    {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) 
    {
        this.idDetalle = idDetalle;
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
