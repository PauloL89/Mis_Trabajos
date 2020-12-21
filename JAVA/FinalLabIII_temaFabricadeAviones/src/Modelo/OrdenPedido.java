
package Modelo;

public abstract class OrdenPedido 
{
    private int numeroOrdenPedido;
    private String fechaAltaPedido;
    
    public OrdenPedido(){}

    public OrdenPedido(int numeroOrdenPedido, String fechaAltaPedido) 
    {
        this.numeroOrdenPedido = numeroOrdenPedido;
        this.fechaAltaPedido = fechaAltaPedido;
    }

    public int getNumeroOrdenPedido() 
    {
        return numeroOrdenPedido;
    }

    public void setNumeroOrdenPedido(int numeroOrdenPedido) 
    {
        this.numeroOrdenPedido = numeroOrdenPedido;
    }

    public String getFechaAltaPedido() 
    {
        return fechaAltaPedido;
    }

    public void setFechaAltaPedido(String fechaAltaPedido) 
    {
        this.fechaAltaPedido = fechaAltaPedido;
    }
    
    public abstract double estimacionEntrega();

    @Override
    public String toString() 
    {
        return "Numero de Orden de Pedido: " + numeroOrdenPedido + "\n Fecha de Alta de Pedido:" + fechaAltaPedido;
    }
    
    
    
    
}
