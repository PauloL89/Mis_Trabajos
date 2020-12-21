

package MODELO;


public class Articulo 
{
    private int idArticulo;
    private String articulo;
    private float precioUnitario;
    private boolean estado;

    public Articulo(int idArticulo, String articulo, float precioUnitario) 
    {
        this.idArticulo = idArticulo;
        this.articulo = articulo;
        this.precioUnitario = precioUnitario;
        estado = true;
    }

    public int getIdArticulo() 
    {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) 
    {
        this.idArticulo = idArticulo;
    }

    public String getArticulo() 
    {
        return articulo;
    }

    public void setArticulo(String articulo) 
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    

    @Override
    public String toString() 
    {
        return "Articulo: " + articulo 
                + "\n Precio Unitario: " + precioUnitario;
    }
    
    
    

}
