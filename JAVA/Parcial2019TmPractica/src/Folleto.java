
public class Folleto 
{
    private Articulo[] articulos;
    
    public Folleto(int cantidadArticulos)
    {
        articulos = new Articulo[cantidadArticulos];
    }
    
    public void agregarArticulo(Articulo articulo)
    {
        for (int i = 0; i < articulos.length; i++)
        {
            if(articulos[i] == null)
            {
                articulos[i] = articulo;
                break;
            }
            
        }
    }
    
    public String ListarArticulos()
    {
        String listado = "";
        
        for (int i = 0; i < articulos.length; i++)
        {
            if(articulos[i] !=null)
            {
                Articulo a = articulos[i];
                listado += a.toStringArticulo() + "\n";
            }
            
        }
        
        return listado;
    }
    
    public int cantidadArticuloOferta()
    {
        int cantArtOfert = 0;
        
        for (int i = 0; i < articulos.length; i++) 
        {
            if(articulos[i] != null && articulos[i].getCantDiaOferta() > 5)
            {
                cantArtOfert++;
            }
            
        }
        
        return  cantArtOfert;
    }
    
    
    public int totalStock()
    {
        int total = 0;
        
        for (int i = 0; i < articulos.length; i++)
        {
            if(articulos[i] != null)
            {
                total += articulos[i].getStock();
            }
            
        }
        
        return total;
    }
    
    
    public int cantidadArticulosConDescuento()
    {
        int cantArtDesc = 0;
        
        for (int i = 0; i < articulos.length; i++) 
        {
            if(articulos[i] != null && articulos[i].getPrecioOferta() > 20)
            {
                cantArtDesc++;
            }
            
        }
        
        return  cantArtDesc;
    }
    
    public double totalRecaudcionArticuloporCodigo(int codigoArticulo)
    {
        double totalsinDesc = 0, totalconDesc = 0, total = 0;
        for (int i = 0; i < articulos.length; i++) 
        {
            if(articulos[i] != null && articulos[i].getNumeroProducto() == codigoArticulo)
            {
                totalsinDesc += articulos[i].getPrecioNormal();
                totalconDesc += articulos[i].getPrecioOferta();
            }
            
        }
        
        total = totalconDesc + totalsinDesc;
        
        return total;
    }
    
}
