

package Modelo;

import java.util.ArrayList;


public class Contenedora 
{
    private ArrayList<OrdenPedido> listaOrdenes;
    
    public boolean esMayor = true;
    
    public Contenedora()
    {
       listaOrdenes = new ArrayList();
    }
    
    public void AgregarOrden(OrdenPedido orden)
    {
        listaOrdenes.add(orden);
    }
    
    
    //Numero de orden de mayor tiempo estimado
    
    private int numeroOrdenMayorActual;
    private double mayorTiempoEstimado;

    public int NumeroOrdenMayorTiempoEstimado() 
    {
        int numeroMayorTotal = 0;
        
        for (OrdenPedido ordenPedido : listaOrdenes) 
        {
            if (esMayor) 
            {
                numeroMayorTotal = ordenPedido.getNumeroOrdenPedido();
                mayorTiempoEstimado = ordenPedido.estimacionEntrega();
                numeroOrdenMayorActual = numeroMayorTotal;
                esMayor = false;
            }
            else if (ordenPedido.estimacionEntrega() > mayorTiempoEstimado)
            {
                    numeroMayorTotal = ordenPedido.getNumeroOrdenPedido();
                    mayorTiempoEstimado = ordenPedido.estimacionEntrega();
                    numeroOrdenMayorActual = numeroMayorTotal;
                 
            } // else if
            else 
                {
                    numeroMayorTotal = numeroOrdenMayorActual;
                }

        } // for

        return numeroMayorTotal;
    }
    
    
    
    
    //Total de dias de produccion para los aviones de carga
    
    public double totalDiasProduccionAvionCarga()
    {
        double acumDiasProduccion = 0;
        
        for (OrdenPedido ordenPedido : listaOrdenes) 
        {
            if(ordenPedido instanceof AvionCarga)
            {
                acumDiasProduccion += ordenPedido.estimacionEntrega();
            }
        }
        
        return  acumDiasProduccion;
    }
    
    
    
    
    //Promedio de dias estimados para los aviones de pasajeros 
    //sin contar el tiempo de las turbinas
    
     
    
    
    
}

