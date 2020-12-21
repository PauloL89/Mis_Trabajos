
package Modelos;

/**
 *
 * @author Paulo-PC
 */
public abstract class Trabajo
{
    private String nombreCliente;
    private int distanciaPintado; // en KM 
    
        // CONSTRUCTORES
    public Trabajo()
    {
        nombreCliente = "";
        distanciaPintado = 0;
    }
    

    public Trabajo(String nombreCli, int distancia)
    {
        nombreCliente = nombreCli;
        distanciaPintado = distancia;
    }

    // GETTER Y SETTER
    public String getNombreCliente() 
    {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) 
    {
        this.nombreCliente = nombreCliente;
    }

    public int getDistanciaPintado() 
    {
        return distanciaPintado;
    }

    public void setDistanciaPintado(int distanciaPintado) 
    {
        this.distanciaPintado = distanciaPintado;
    }
    
    
    // FUNCIONES o METODOS
    
    public double precioBase()
    {
        double precio;
        
        precio = 100 * distanciaPintado;
        
        return precio;
    }
    
    public abstract double PrecioFinal();
    
    @Override
    public String toString()
    {
        return "Nombre del Cliente: " + nombreCliente 
                + "\n Distancia en KM de pintado: " + distanciaPintado;
    }
    
}
