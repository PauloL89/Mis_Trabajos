
package municipalidad;


public class Municipalidad 
{
    private Plan[] planes;
    
    public Municipalidad(int cantidadPlanes)
    {
        planes = new Plan[cantidadPlanes];
    }
    
    
    
    public void agregarPlanes(Plan plan)
    {
        for (int i = 0; i < planes.length; i++) 
        {
            if(planes[i] == null)
            {
                planes[i] = plan;
                break;
            }
            
        }
    }
    
    
    
    
    public String listarPagosContribuyentes(String nombre)
    {
        String listado = "";
        for (int i = 0; i < planes.length; i++) 
        {
            if(planes[i] != null && planes[i].getNombre().equals(nombre))
            {
                Plan p = planes[i];
                listado += p.listadoPagos();
            }
            
        }
        
        return  listado;
    }
    
    
    
    
    public int cantidadPlanesPagados()
    {
        int cantidad = 0;
        for (int i = 0; i < planes.length; i++) 
        {
            if(planes[i] != null && planes[i].estaPagadoTotalmente())
            {
                cantidad++;
            }
            
        }
        return cantidad;
    }
    
    
    
    
    public double sumatoriDeuda()
    {
        double total = 0;
        for (int i = 0; i < planes.length; i++) 
        {
            if(planes[i] != null && planes[i].estaPagadoTotalmente() == false)
            {
                total += planes[i].getDeuda();
            }
            
        }
        return total;
    }
    
    
    public double promedioIntereses()
    {
        double promedio = 0;
        double totalAcumulado = 0;
        int contadorPlanes =0;
        for (int i = 0; i < planes.length; i++) 
        {
            if(planes[i] != null)
            {
                totalAcumulado += planes[i].sumaInteresesCobrados();
                contadorPlanes++;
            }
            
        }
        
        promedio = totalAcumulado / contadorPlanes;
        return promedio;
    }
}
