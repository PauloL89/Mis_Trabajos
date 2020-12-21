

package DTO;

import Modelo.TipoInmueble;
import Modelo.TipoOperacion;
import Modelo.Vendedores;

public class DtoTransaccionMayortipoVenta
{
    private int idTransaccion;
    private String fecha;
    private TipoOperacion operacion;
    private TipoInmueble inmueble;
    private double monto;
    private Vendedores vendedor;

    public DtoTransaccionMayortipoVenta(int idTransaccion, String fecha, TipoOperacion operacion, TipoInmueble inmueble, double monto, Vendedores vendedor) 
    {
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
        this.operacion = operacion;
        this.inmueble = inmueble;
        this.monto = monto;
        this.vendedor = vendedor;
    }

    public int getIdTransaccion() 
    {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) 
    {
        this.idTransaccion = idTransaccion;
    }

    public String getFecha() 
    {
        return fecha;
    }

    public void setFecha(String fecha) 
    {
        this.fecha = fecha;
    }

    public TipoOperacion getOperacion() 
    {
        return operacion;
    }

    public void setOperacion(TipoOperacion operacion) 
    {
        this.operacion = operacion;
    }

    public TipoInmueble getInmueble() 
    {
        return inmueble;
    }

    public void setInmueble(TipoInmueble inmueble) 
    {
        this.inmueble = inmueble;
    }

    public double getMonto() 
    {
        return monto;
    }

    public void setMonto(double monto) 
    {
        this.monto = monto;
    }

    public Vendedores getVendedor() 
    {
        return vendedor;
    }

    public void setVendedor(Vendedores vendedor)
    {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() 
    {
        return "Id Transaccion: " + idTransaccion + "\n Id Vendedor: " + vendedor.getId()
                +"\n Tipo de Inmueble: " + inmueble.getNombreInmueble()+ "\n Tipo de Operacion: " + operacion.getNombreOperacion()
                + "\n Fecha de la Transaccion: " + fecha + "\n Monto de transaccion: $" + monto;
    }
    
    
    
}
