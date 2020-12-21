
public class Principal 
{

    
    public static void main(String[] args) 
    {
        Biblioteca biblioteca = new Biblioteca(2);
        Libro a = new Libro("A", 10,2);
        Libro b = new Libro("B", 20,1);
        Prestamo p1 = new Prestamo("jan", 15, true);
        Prestamo p2 = new Prestamo("Tan", 10, false);
        Prestamo p3 = new Prestamo("Ban", 5, true);
        
        
        a.setEstado(3);
        b.setEstado(3);
        b.setEstado(3);
        
        a.agregarPrestamo(p1);
        a.agregarPrestamo(p3);
        b.agregarPrestamo(p2);

        
        biblioteca.agregarLibro(a);
        biblioteca.agregarLibro(b);

        
        System.out.println("Lista de Libros: \n"+biblioteca.ListaLibros());
        
        System.out.println("Libros por estados: ");
        int[] resultado = biblioteca.cantidadLibrosPorEstado();
        
        for (int i = 0; i < resultado.length; i++) 
        {
            System.out.println("Libros con estado " + (i+1));
            System.out.println(resultado[i]);
            
        }
        
        
        System.out.println("Precio total de libros extraviados: ");
        System.out.println(biblioteca.sumaPrecioExtraviados());
        
        
        System.out.println("Listados de solicitantes por titulo: ");
        System.out.println(biblioteca.listadoSolicitantes("A"));
        
        
        System.out.println("El promedio de prestamos es: ");
        System.out.println(biblioteca.promedioPrestamos());
    }
    
}
