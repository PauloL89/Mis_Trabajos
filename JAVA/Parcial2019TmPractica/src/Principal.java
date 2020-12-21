
import java.util.Scanner;


public class Principal
{

   
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int cantidad;
        
        //variables para los articulos
        int codigo,stock,cantDiaOfert;
        double precNormal,precOfert;
        String nombre;
        // crear objeto folleto y pasar por parametro la cantidad de articulos
        //Folleto folleto = new Folleto(3);
        
        // Crear objetos articulos
       // Articulo a1 = new Articulo(1, 6, 10, "Fideo", 15, 25);
       // Articulo a2 = new Articulo(2, 5, 20, "Arroz", 40, 80);
        
        
        // cargar folleto
        System.out.println("Ingrese cantidad de articulos en el folleto");
        cantidad = entrada.nextInt();
        Folleto folleto = new Folleto(cantidad);
        
        //cargar articulos
        
        Articulo[] articulos = new Articulo[cantidad];
        for (int i = 0; i < articulos.length; i++)
        {
            if(articulos[i] == null)
            {
                System.out.println("Ingrese los datos de los articulos " + " Son " + cantidad + " articulos a cargar");
                System.out.println("Nombre del articulo");
                 nombre = entrada.next();
                 System.out.println("Codigo del producto");
                codigo = entrada.nextInt();
                System.out.println("cantidad de stock del producto");
                stock = entrada.nextInt();
                System.out.println("Precio normal del producto");
                precNormal = entrada.nextDouble();
                System.out.println("Precio con oferta del producto");
                precOfert = entrada.nextDouble();
                System.out.println("Cantidad de dias de la oferta");
                cantDiaOfert = entrada.nextInt();
                
                articulos[i] = new Articulo(codigo, cantDiaOfert,stock,nombre, precOfert, precNormal);
                folleto.agregarArticulo(articulos[i]);
            }
            
        }
        
        
        
          //Articulo a1 = new Articulo(codigo, cantDiaOfert,stock,nombre, precOfert, precNormal);
         // Articulo a2 = new Articulo(codigo, cantDiaOfert,stock,nombre, precOfert, precNormal);
         
        //Agregar articulos al folleto
        //folleto.agregarArticulo(a1);
        //folleto.agregarArticulo(a2);
       // folleto.agregarArticulo(a1);
        
        // Listar los productos cargados al folleto
        System.out.println(folleto.ListarArticulos());
        
        
        //1. Cantidad de artículos ofertados por más de 5 días.
        
        System.out.println("Cantidad de artículos ofertados por más de 5 días.");
        System.out.println(folleto.cantidadArticuloOferta() + " Articulos ofertados");
        
        System.out.println("");
        
        //2. Total de unidades que hay a la venta (sumatoria del stock).
        System.out.println("Total de unidades que hay a la venta");
        System.out.println("El stock total de unidades de todos los productos es de: " + folleto.totalStock());
        
        System.out.println("");
        
       // 3. Cantidad de artículos ofrecidos con un descuento superior a $20.
       
        System.out.println("Cantidad de artículos ofrecidos con un descuento superior a $20.");
        System.out.println(folleto.cantidadArticulosConDescuento() + " Articulos");
        
        System.out.println("");
       
       /*4. Total a recaudar por un artículo en particular indicado por su código, 
       suponiendo que se vendan todas las unidades disponibles.*/
        
        System.out.println("Total a recaudar por un artículo en particular indicado por su código");
        System.out.println("Ingrese codigo del producto");
        codigo = entrada.nextInt();
        System.out.println("$"+folleto.totalRecaudcionArticuloporCodigo(codigo));
       
    }
    
}
