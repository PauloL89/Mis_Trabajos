
package parcial;

/**
 *
 * @author Paulo Lascirignola Legajo 11549
 * curso 2w50
 */
public class Combustible 
{
    private int litrosCargados;
    private double importeAbonado;

    public Combustible()
    {
    }

    public Combustible(int litrosCargados, double importeAbonado) 
    {
        this.litrosCargados = litrosCargados;
        this.importeAbonado = importeAbonado;
    }

    public int getLitrosCargados() 
    {
        return litrosCargados;
    }

    public void setLitrosCargados(int litrosCargados) 
    {
        this.litrosCargados = litrosCargados;
    }

    public double getImporteAbonado() 
    {
        return importeAbonado;
    }

    public void setImporteAbonado(double importeAbonado) 
    {
        this.importeAbonado = importeAbonado;
    }

    
    public String toStringCombustible() 
    {
        return "Combustible: \n" + "Litros Cargados: " + litrosCargados + "\n Importe abonado=" + importeAbonado;
    }
    
    
}
