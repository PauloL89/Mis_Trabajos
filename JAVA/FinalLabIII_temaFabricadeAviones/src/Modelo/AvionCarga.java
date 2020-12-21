
package Modelo;


public class AvionCarga extends  OrdenPedido
{
    private int cantidadTanqueCombustible;
    private int tipoAvionCarga;
    private int pesoMaximo;
    

    public AvionCarga(int cantidadTanqueCombustible, int tipoAvionCarga, int pesoMaximo, int numeroOrdenPedido, String fechaAltaPedido) 
    {
        super(numeroOrdenPedido, fechaAltaPedido);
        this.cantidadTanqueCombustible = cantidadTanqueCombustible;
        this.tipoAvionCarga = tipoAvionCarga;
        this.pesoMaximo = pesoMaximo;
    }
    
    public AvionCarga(){}

    public int getCantidadTanqueCombustible() 
    {
        return cantidadTanqueCombustible;
    }

    public void setCantidadTanqueCombustible(int cantidadTanqueCombustible) 
    {
        this.cantidadTanqueCombustible = cantidadTanqueCombustible;
    }

    public int getTipoAvionCarga() 
    {
        return tipoAvionCarga;
    }

    public void setTipoAvionCarga(int tipoAvionCarga) 
    {
        this.tipoAvionCarga = tipoAvionCarga;
    }

    public int getPesoMaximo() 
    {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) 
    {
        this.pesoMaximo = pesoMaximo;
    }
    
    
    
    @Override
    public double estimacionEntrega()
    {
        int cantMeses;
        double cantDias;
        cantMeses = (pesoMaximo / 250) + cantidadTanqueCombustible;
        
        if(tipoAvionCarga == 1)
        {
            cantMeses = cantMeses + 4;
        }
        else
        {
            cantMeses = cantMeses + 1;
        }
        
        cantDias = 30.5 * cantMeses;
        return cantDias;
    }

    @Override
    public String toString() 
    {
        return "Tiempo estimado de entrega: " + estimacionEntrega() + " dias";
    }
    
    

}
