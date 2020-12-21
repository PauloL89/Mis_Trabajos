

package DTO;

import Modelo.Producto;


public class DtoOferta 
{
    private int stockDisponible,diasVigencia;
    private double precioNormal,precioOferta;
    private String fechaInicioOferta;
    private Producto producto;

    public DtoOferta(int stockDisponible, int diasVigencia, double precioNormal, double precioOferta, String fechaInicioOferta, Producto producto) {
        this.stockDisponible = stockDisponible;
        this.diasVigencia = diasVigencia;
        this.precioNormal = precioNormal;
        this.precioOferta = precioOferta;
        this.fechaInicioOferta = fechaInicioOferta;
        this.producto = producto;
    }

    
    
    

    public int getStockDisponible() {
        return stockDisponible;
    }

    public int getDiasVigencia() {
        return diasVigencia;
    }

    public double getPrecioNormal() {
        return precioNormal;
    }

    public double getPrecioOferta() {
        return precioOferta;
    }

    public String getFechaInicioOferta() {
        return fechaInicioOferta;
    }

    public Producto getProducto() {
        return producto;
    }
    
    
}
