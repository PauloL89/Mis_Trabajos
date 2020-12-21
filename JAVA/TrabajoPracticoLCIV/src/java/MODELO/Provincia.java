

package MODELO;

public class Provincia 
{
    private int idProvincia;
    private String provincia;

    public Provincia() 
    {
        
    }
    
    public Provincia(int id,String provincia) 
    {
        idProvincia = id;
        this.provincia = provincia;
    }

    public int getIdProvincia() 
    {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia)
    {
        this.idProvincia = idProvincia;
    }
    
    

    public String getProvincia() 
    {
        return provincia;
    }

    public void setProvincia(String provincia) 
    {
        this.provincia = provincia;
    }

    @Override
    public String toString() 
    {
        return provincia;
    }
    
    

}
