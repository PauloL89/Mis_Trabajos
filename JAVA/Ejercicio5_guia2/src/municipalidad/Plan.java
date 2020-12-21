
package municipalidad;


public class Plan 
{
    private String nombre;
    private double deuda;
    private int cuotas;
    private Pago[] pagos;
    
    
    
    
    public Plan(String nombre, double deuda, int cuotas)
    {
        this.nombre = nombre;
        this.deuda = deuda;
        this.cuotas = cuotas;
        pagos = new Pago[cuotas];
    }
    
    
    
    
    public void agregarPago(Pago pago)
    {
        for (int i = 0; i < pagos.length; i++)
        {
            if(pagos[i] == null)
            {
                pagos[i] = pago;
                break;
            }
            
        }
    }
    
    
    
    public String listadoPagos()
    {
        String listado ="";
        for (int i = 0; i < pagos.length; i++) 
        {
            if(pagos[i] != null)
            {
                Pago pago = pagos[i];
                listado += "\n Listado de pagos: \n" + pago.toStringPago();
            }
            
        }
        
        return  listado;
    }
    
    
    
    public boolean estaPagadoTotalmente()
    {
        boolean estapagado = true;
        
        for (int i = 0; i < pagos.length; i++)
        {
            if(pagos[i] == null)
            {
                estapagado = false;
            }
            
        }
        
        return estapagado;
    }
    
    
    
    public double sumaInteresesCobrados()
    {
        double sumaIntereses= 0;
        
        for (int i = 0; i < pagos.length; i++) 
        {
           if(pagos[i] != null && pagos[i].getDemora() > 0)
           {
               sumaIntereses += pagos[i].getDemora() * (pagos[i].getInteresesAdicionales() * pagos[i].getImporte());
           }
            
        }
        return sumaIntereses;
    }

    
    
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    
    public double getDeuda() 
    {
        return deuda;
    }

    public void setDeuda(double deuda) 
    {
        this.deuda = deuda;
    }

    
    public int getCuotas() 
    {
        return cuotas;
    }

    public void setCuotas(int cuotas) 
    {
        this.cuotas = cuotas;
    }
    
    
}
