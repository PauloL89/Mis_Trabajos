
public class Articulo 
{
    private int numeroProducto,cantDiaOferta,stock;
    private String nombreProducto;
    private double precioOferta, precioNormal;
    
    public Articulo()
    {
        numeroProducto = 0;
        cantDiaOferta = 0;
        stock = 0;
        nombreProducto = "";
        precioOferta = 0;
        precioNormal = 0;
    }
    
    public Articulo(int numero, int cantDiaOfert, int stock, String nombreProduc, double precioOfert,double precioRegular)
    {
        numeroProducto = numero;
        cantDiaOferta = cantDiaOfert;
        this.stock = stock;
        nombreProducto = nombreProduc;
        precioOferta = precioOfert;
        precioNormal = precioRegular;
    }

    public int getNumeroProducto() 
    {
        return numeroProducto;
    }

    public void setNumeroProducto(int numeroProducto) 
    {
        this.numeroProducto = numeroProducto;
    }

    public int getCantDiaOferta() 
    {
        return cantDiaOferta;
    }

    public void setCantDiaOferta(int cantDiaOferta) 
    {
        this.cantDiaOferta = cantDiaOferta;
    }

    public int getStock() 
    {
        return stock;
    }

    public void setStock(int stock) 
    {
        this.stock = stock;
    }

    public String getNombreProducto() 
    {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) 
    {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioOferta() 
    {
        return precioOferta;
    }

    public void setPrecioOferta(double precioOferta) 
    {
        this.precioOferta = precioOferta;
    }

    public double getPrecioNormal() 
    {
        return precioNormal;
    }

    public void setPrecioNormal(double precioNormal) 
    {
        this.precioNormal = precioNormal;
    }
    
    public String toStringArticulo()
    {
        return "Nombre del Articulo: " + nombreProducto + "\n Numero del Articulo: " + numeroProducto
                + "\n Precio Normal: $" + precioNormal + "\n Precio con Oferta: $" + precioOferta
                + "\n Dias de la Oferta: " + cantDiaOferta + " dias \n Stock del producto: " + stock;
    }
}
