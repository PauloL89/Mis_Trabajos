
package DTO;

import MODELO.Provincia;


public class dtoListado 
{
    private String primerConyuge, segundoConyuge;
    private String telefono,domcilio,ciudad;
    private Provincia provincia;
    private int CantidadDepositoRecibidos;
    private float totalDepositos;

    public dtoListado(String primerConyuge, String segundoConyuge, String telefono, String domcilio, String ciudad, Provincia provincia, int CantidadDepositoRecibidos, float totalDepositos) {
        this.primerConyuge = primerConyuge;
        this.segundoConyuge = segundoConyuge;
        this.telefono = telefono;
        this.domcilio = domcilio;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.CantidadDepositoRecibidos = CantidadDepositoRecibidos;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomcilio() {
        return domcilio;
    }

    public void setDomcilio(String domcilio) {
        this.domcilio = domcilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public int getCantidadDepositoRecibidos() {
        return CantidadDepositoRecibidos;
    }

    public void setCantidadDepositoRecibidos(int CantidadDepositoRecibidos) {
        this.CantidadDepositoRecibidos = CantidadDepositoRecibidos;
    }

    public float getTotalDepositos() {
        return totalDepositos;
    }

    public void setTotalDepositos(float totalDepositos) {
        this.totalDepositos = totalDepositos;
    }
    
    
    
    
    
    
    
    
}
