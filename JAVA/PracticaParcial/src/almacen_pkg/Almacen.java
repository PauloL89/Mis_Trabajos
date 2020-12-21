
package almacen_pkg;


public class Almacen 
{
    private String nombreCliente,telefono;
    Venta ventas[];
 
    public Almacen(String nombreCli, String tel, int cantVenta)
    {
        this.nombreCliente = nombreCli;
        this.telefono = tel;
        ventas = new Venta[cantVenta];
    }
    
    public void agregarVenta(Venta v)
    {
       for (int i = 0; i < ventas.length; i++) 
        {
            if(ventas[i] == null)
            {
                ventas[i] = v;
                break;
            }
            
        } 
    }
    
    public String listarVenta()
    {
        String listado = "";
        for (int i = 0; i < ventas.length; i++) 
        {
            if(ventas[i] != null)
            {
                Venta v = ventas[i];
                listado = v.toStringVenta();
            }
            
        } 
        
        return listado;
    }
    
    public double promedioGeneral()
    {
        double promedio;
        int contador= 0,acumulador = 0;
        for (int i = 0; i < ventas.length; i++) 
        {
            if(ventas[i] != null)
            {
                acumulador+= ventas[i].getImporteTotal();
                contador++;
            }
            
        } 
        
        promedio = acumulador / contador;
        return promedio;
    }
    
    public double sumatoriaTotalDeuda()
    {
        double sumatotal = 0;
        for (int i = 0; i < ventas.length; i++) 
        {
            if(ventas[i] != null)
            {
                sumatotal += ventas[i].getSaldoDeudor();
            }
            
        } 
        return sumatotal;
    }
    
    
    public int cantidadVentas(double importe)
    {
        int cantidad = 0;
        for (int i = 0; i < ventas.length; i++) 
        {
            if(ventas[i] != null && ventas[i].getImporteTotal()> importe)
            {
                cantidad++;
            }
            
        } 
        return cantidad;
    }

    public String getNombreCliente()
    {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) 
    {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefono() 
    {
        return telefono;
    }

    public void setTelefono(String telefono) 
    {
        this.telefono = telefono;
    }
    
    
    
}
