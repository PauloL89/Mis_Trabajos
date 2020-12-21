
package veterinaria;


public class Principal
{
    public static void main(String[] args)
    {
        Veterinaria vete = new Veterinaria(2);
        
        Mascota m1 = new Mascota("Odin", 5);
        Mascota m2 = new Mascota("Thor", 8);
        
        Cliente c1 = new Cliente("Ragnar", 1, 10, m1);
        Cliente c2 = new Cliente("Lagherta", 2, 6, m2);
        
        vete.agregarCliente(c1);
        vete.agregarCliente(c2);
        
        System.out.println("Listado de Clientes:");
        System.out.println(vete.listarClientes());
        
        System.out.print("Cantidad de Clietnes: ");
        System.out.println(vete.cantidadCliente());
        
        System.out.print("Promedio de edad de las mascotas: ");
        System.out.println(vete.promedioEdadMascota());
        
        System.out.print("Cantidad de clientes con una antiguedad igual o mayor a 5 años: ");
        System.out.println(vete.mayorAntiguedad());
        
        
    }
}
