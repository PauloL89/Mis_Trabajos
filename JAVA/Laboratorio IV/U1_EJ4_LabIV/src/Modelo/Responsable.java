

package Modelo;

public class Responsable 
{
    private int codigo;
    private String nombreResponsable;

    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public String getNombreResponsable() 
    {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) 
    {
        this.nombreResponsable = nombreResponsable;
    }

    public Responsable(int codigo, String nombreResponsable) {
        this.codigo = codigo;
        this.nombreResponsable = nombreResponsable;
    }

    @Override
    public String toString() 
    {
        return nombreResponsable;
    }
    
    

}
