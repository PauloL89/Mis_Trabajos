
package Modelo;


public class Producto 
{
    private int IdProducto;
    private String nombre;

    public Producto(int IdProducto, String nombre) 
    {
        this.IdProducto = IdProducto;
        this.nombre = nombre;
    }

    public int getIdProducto()
    {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) 
    {
        this.IdProducto = IdProducto;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    @Override
    public String toString() 
    {
        return nombre;
    }
    
    
    
    
}
