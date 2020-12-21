

package Modelo;

import DTO.dtoTipoInmueble;
import DTO.dtoTipoOperacion;


public class Transacciones
{
    private int idTransaccion, idVendedor;
    private String fecha;
    private double monto;
    private dtoTipoInmueble tipoInmueble;
    private dtoTipoOperacion tipoOperacion;

    public Transacciones(int idTransaccion, int idVendedor, dtoTipoOperacion tipoOperacion, dtoTipoInmueble tipoInmueble, String fecha,double mont) 
    {
        this.idTransaccion = idTransaccion;
        this.idVendedor = idVendedor;
        this.tipoOperacion = tipoOperacion;
        this.tipoInmueble = tipoInmueble;
        this.fecha = fecha;
        this.monto = mont;
    }

    

    public int getIdTransaccion() 
    {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) 
    {
        this.idTransaccion = idTransaccion;
    }

    public int getIdVendedor() 
    {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) 
    {
        this.idVendedor = idVendedor;
    }

    public dtoTipoOperacion getTipoOperacion() 
    {
        return tipoOperacion;
    }

    public void setTipoOperacion(dtoTipoOperacion tipoOperacion) 
    {
        this.tipoOperacion = tipoOperacion;
    }

    public dtoTipoInmueble getTipoInmueble() 
    {
        return tipoInmueble;
    }

    public void setTipoInmueble(dtoTipoInmueble tipoInmueble) 
    {
        this.tipoInmueble = tipoInmueble;
    }

    public String getFecha() 
    {
        return fecha;
    }

    public void setFecha(String fecha) 
    {
        this.fecha = fecha;
    }

    public double getMonto() 
    {
        return monto;
    }

    public void setMonto(double monto) 
    {
        this.monto = monto;
    }
    
    
    @Override
    public String toString()
    {
        return "Id Transaccion: " + idTransaccion + "\n Id Vendedor: " + idVendedor
                +"\n Tipo de Inmueble: " + tipoInmueble.getNombre()+ "\n Tipo de Operacion: " + tipoOperacion.getNombre()
                + "\n Fecha de la Transaccion: " + fecha + "\n Monto de transaccion: $" + monto;
    } 
    
}
