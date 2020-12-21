
package veterinaria;


public class Mascota 
{
    private String nombre;
    private int edadMascota;
    

    
    
    public Mascota()
    {
        nombre = "";
        edadMascota =0;
        
    }
    
    public Mascota( String nom, int edad)
    {
        nombre = nom;
        edadMascota = edad;
    }
    
    public String GetNombre()
    {
        return nombre;
    }
    
    public void SetNombre(String nom)
    {
        nombre = nom;
    }
    
    public int GetEdadMascota()
    {
        return edadMascota;
    }
    
    public void SetEdadMascota(int edadMasc)
    {
        edadMascota = edadMasc;
    }


    public String toStringMascota() 
    {
        String texto = ("nombre de la mascota: " + nombre + "\n edad de la mascota: " + edadMascota + " años \n");
        return texto;
    }
}
