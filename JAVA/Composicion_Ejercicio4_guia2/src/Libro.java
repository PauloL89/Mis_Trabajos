
/*
    De cada libro conoce su título, precio de reposición
    (para el caso de extravíos o daños) y 
    estado (1: disponible, 2: prestado, 3:extraviado)
*/
public class Libro 
{
    private String titulo;
    private int precio, estado;
    Prestamo[] prestamos;

    // CONTRUCTORES
    public Libro(String titulo, int precio,int cantPrestamos) 
    {
        this.titulo = titulo;
        this.precio = precio;
        estado = 1;
        prestamos = new Prestamo[cantPrestamos];
    }
    
    
    
    
    // METODOS
    public void agregarPrestamo(Prestamo nvoPrestamo)
    {
        for (int i = 0; i < prestamos.length; i++) 
        {
            if(prestamos[i] == null)
            {
                prestamos[i] = nvoPrestamo;
                break;
            }
            
        }
    }
    
   
    
    public String listadoSolicitantes()
    {
        String listado, resultado = "";
        for (int i = 0; i < prestamos.length; i++) 
        {
            listado = prestamos[i].getSolicitante();
            resultado += listado + " - ";
        }
        return resultado;
    }
    
    public int cantidadPrestamos()
    {
        return prestamos.length;
    }

   
    public String toStringLibro() 
    {
        return "titulo: " + titulo + "\n precio: " + precio;
    }

    //METODOS GET y SET
    public int getEstado() 
    {
        return estado;
    }

    public void setEstado(int estado)
    {
        this.estado = estado;
    }

    public int getPrecio() 
    {
        return precio;
    }

    public void setPrecio(int precio) 
    {
        this.precio = precio;
    }

    public String getTitulo() 
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public Prestamo[] getPrestamos() 
    {
        return prestamos;
    }

    public void setPrestamos(Prestamo[] prestamos) 
    {
        this.prestamos = prestamos;
    }
    
    
    
    
    
}
