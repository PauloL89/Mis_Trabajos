

package Modelo;


public class Componente 
{
    private int codComponente;
    private String descripcionComponente;

    public int getCodComponente() 
    {
        return codComponente;
    }

    public void setCodComponente(int codComponente) 
    {
        this.codComponente = codComponente;
    }

    public String getDescripcionComponente() 
    {
        return descripcionComponente;
    }

    public void setDescripcionComponente(String descripcionComponente) 
    {
        this.descripcionComponente = descripcionComponente;
    }

    public Componente(int codComponente, String descripcionComponente) {
        this.codComponente = codComponente;
        this.descripcionComponente = descripcionComponente;
    }

    @Override
    public String toString() 
    {
        return descripcionComponente;
    }
    
    
    

}
