

package DTO;

public class dtoTipoOperacion 
{
    private int codigo;
    private String nombre;

    public dtoTipoOperacion(int codigo, String nombre) 
    {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() 
    {
        return codigo;
    }

    public String getNombre() 
    {
        return nombre;
    }
    
    @Override
    public String toString()
    {
        return nombre;
    }
}
