
public class Biblioteca
{
    private Libro[] libros;
    
    public Biblioteca(int cantidadLibros)
    {
        libros = new Libro[cantidadLibros];
    }
    
    public void agregarLibro(Libro l)
    {
        for (int i = 0; i < libros.length; i++) 
        {
            if(libros[i] == null)
            {
                libros[i] = l;
                break;
            }
            
        }
    }
    
     public String ListaLibros()
    {
        String listado = "";
        
        for (int i = 0; i < libros.length; i++)
        {
            if(libros[i] !=null)
            {
                Libro l = libros[i];
                listado += l.toStringLibro() + "\n";
            }
            
        }
        
        return listado;
    }
    
    
    public int cantidadLibros(int estado)
    {
        int cantidad = 0;
        for (int i = 0; i < libros.length; i++)
        {
            if(libros[i] !=null)
            {
              cantidad++;
            }
            
        }
        
        return cantidad;
              
    }
    
    public int[] cantidadLibrosPorEstado()
    {
        int[] cantidad = new int[3];
        int disponible = 0, prestado = 0, extraviado = 0;
        for (int i = 0; i < libros.length; i++)
        {
            switch (libros[i].getEstado())
            {
                case 1:
                    disponible++;
                    break;
                case 2:
                    prestado++;
                    break;
                default:
                    extraviado++;
                    break;
            }
            
        }
        
        // asignar el resultado de los contadores al arreglo cantidad
        cantidad[0] = disponible;
        cantidad[1] = prestado;
        cantidad[2] = extraviado;
        return cantidad;
    }
    
    public String listadoSolicitantes(String titulo)
    {
        String listado = "";
        
        for (int i = 0; i < libros.length; i++)
        {
            if(libros[i] != null && libros[i].getTitulo().equals(titulo))
            {
                listado += libros[i].listadoSolicitantes();
            }
            
        }
        return listado;
    }
    
    
    public float promedioPrestamos()
    {
        float promedio = 0;
        int acumulador = 0;
        int contador= 0;
        
        for (int i = 0; i < libros.length; i++) 
        {
            if(libros[i] != null)
            {
                acumulador += libros[i].cantidadPrestamos(); 
            }
            
        }
        // asumir que se cargar todos los libros
        contador = libros.length;
        promedio = acumulador / contador;
        return promedio;
    }
    
    
    public float sumaPrecioExtraviados()
    {
        float precioTotal = 0;
        
        for (int i = 0; i < libros.length; i++)
        {
            if(libros[i].getEstado() == 3 && libros[i] != null)
            {
                precioTotal += libros[i].getPrecio();
            }
            
        }
        
        return precioTotal;
    }
}
