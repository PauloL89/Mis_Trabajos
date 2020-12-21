

package Modelo;


public class AvionPasajero extends  OrdenPedido
{
    private int cantidadTurbinaPorAla;
    private int cantButacaEconomica, cantButacaPrimeraClase;

    public AvionPasajero(int cantidadTurbinaPorAla, int cantButacaEconomica, int cantButacaPrimeraClase, int numeroOrdenPedido, String fechaAltaPedido) {
        super(numeroOrdenPedido, fechaAltaPedido);
        this.cantidadTurbinaPorAla = cantidadTurbinaPorAla;
        this.cantButacaEconomica = cantButacaEconomica;
        this.cantButacaPrimeraClase = cantButacaPrimeraClase;
    }

    public int getCantidadTurbinaPorAla() 
    {
        return cantidadTurbinaPorAla;
    }

    public void setCantidadTurbinaPorAla(int cantidadTurbinaPorAla) 
    {
        this.cantidadTurbinaPorAla = cantidadTurbinaPorAla;
    }

    public int getCantButacaEconomica() 
    {
        return cantButacaEconomica;
    }

    public void setCantButacaEconomica(int cantButacaEconomica) 
    {
        this.cantButacaEconomica = cantButacaEconomica;
    }

    public int getCantButacaPrimeraClase() 
    {
        return cantButacaPrimeraClase;
    }

    public void setCantButacaPrimeraClase(int cantButacaPrimeraClase) 
    {
        this.cantButacaPrimeraClase = cantButacaPrimeraClase;
    }

    
    
    @Override
    public double estimacionEntrega() 
    {
        int cantDiasEconomico, cantDiasPrimeraClase;
        int cantTotalDias;
        
        if(cantidadTurbinaPorAla == 1)
        {
            cantDiasEconomico = (cantButacaEconomica / 2) + 60; // 60 dias = 2 meses porque es 1 mes cada turbina por cada ala(tiene 2 alas)
            cantDiasPrimeraClase = (cantButacaPrimeraClase * 2) + 60;
        }
        else // cantidadTurbinaPorAla == 2
        {
            cantDiasEconomico = (cantButacaEconomica / 2) + 120; // 120 dias = 4 meses porque es 1 mes * 4 turbinas = 4 meses
            cantDiasPrimeraClase = (cantButacaPrimeraClase * 2) + 120;
        }
        
        cantTotalDias = cantDiasEconomico + cantDiasPrimeraClase;
        return cantTotalDias;
    }

    @Override
    public String toString() 
    {
        return "Estimacion Tiempo de entrega: " + estimacionEntrega() + " dias";
    }
    
    

}
