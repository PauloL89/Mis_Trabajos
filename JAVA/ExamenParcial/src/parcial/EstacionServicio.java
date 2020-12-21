
package parcial;

/**
 *
 * @author Paulo Lascirignola Legajo 11549
 * curso 2w50
 */
public class EstacionServicio
{
    private int kilometraje;
    private Combustible[] combustibles;
    
    public EstacionServicio(int km,int cantCargas)
    {
        kilometraje = km;
        combustibles = new Combustible[cantCargas];
    }
    
    public void agregarCombustible(Combustible c)
    {
        for (int i = 0; i < combustibles.length; i++)
        {
            if(combustibles[i] == null)
            {
                combustibles[i] = c;
                break;
            }
            
        }
    }

    
    public double MayorImporteAbonado()
    {
        double importe = 0;
        
        for (int i = 0; i < combustibles.length; i++) 
        {
            if(combustibles[i] != null)
            {
                Combustible c = combustibles[0];
                importe = c.getImporteAbonado();
                
                if(combustibles[i].getImporteAbonado() > importe)
                {
                    importe = combustibles[i].getImporteAbonado();
                }
            }
            
        }
        return importe;
    }
    
    
    public int sumalitrosCargados()
    {
        int total = 0;
        for (int i = 0; i < combustibles.length; i++) 
        {
            if(combustibles[i] != null)
            {
                total += combustibles[i].getLitrosCargados();
            }
            
        }
        
        return  total;
    }
    
    
    public int cantidadCombustibleCargado(int km)
    {
        int cantidad = 0;
        for (int i = 0; i < combustibles.length; i++) 
        {
            if(combustibles[i] != null && getKilometraje() < km)
            {
                cantidad++;
            }
            
        }
        return cantidad;
    }
    
    
    public int getKilometraje()
    {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) 
    {
        this.kilometraje = kilometraje;
    }
    
    
    
    
}
