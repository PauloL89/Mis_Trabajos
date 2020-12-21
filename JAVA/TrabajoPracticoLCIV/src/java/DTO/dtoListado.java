
package DTO;

import MODELO.Provincia;


public class dtoListado 
{
    private String primerConyuge, segundoConyuge;
    private int cantidad;
    private float totalDepositos;

    public dtoListado(String primerConyuge, String segundoConyuge,int cantidad, float totalDepositos) {
        this.primerConyuge = primerConyuge;
        this.segundoConyuge = segundoConyuge;
        this.cantidad = cantidad;
        this.totalDepositos = totalDepositos;
    }

    public String getPrimerConyuge() {
        return primerConyuge;
    }

    public void setPrimerConyuge(String primerConyuge) {
        this.primerConyuge = primerConyuge;
    }

    public String getSegundoConyuge() {
        return segundoConyuge;
    }

    public void setSegundoConyuge(String segundoConyuge) {
        this.segundoConyuge = segundoConyuge;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int CantidadDepositoRecibidos) {
        this.cantidad = CantidadDepositoRecibidos;
    }

    public float getTotalDepositos() {
        return totalDepositos;
    }

    public void setTotalDepositos(float totalDepositos) {
        this.totalDepositos = totalDepositos;
    }
    
    
    
    
    
    
    
    
}
