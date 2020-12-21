
package almacen_pkg;

import java.util.Scanner;


public class Principal 
{
    public static void main(String[] args)
    {
        String nombreCliente,telefono;
        int cantProdVend, cantidad;
        double importeTotal,saldoDeudor;
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Nombre del cliente: ");
        nombreCliente = entrada.next();
        
        System.out.println("Telefono del cliente: ");
        telefono = entrada.next();
        
        System.out.println("Agregar cantidad de compras: ");
        cantidad = entrada.nextInt();
        
       
        
        
        Almacen almacen = new Almacen(nombreCliente,telefono,cantidad);
        for (int i = 0; i < cantidad; i++)
        {
            System.out.println("Cantidad de Productos vendidos: ");
            cantProdVend = entrada.nextInt();
            
            System.out.println("Importe total de la venta: ");
            importeTotal = entrada.nextDouble();
            
            System.out.println("Saldo de la deuda: ");
            saldoDeudor = entrada.nextDouble();
            
            /*while (saldoDeudor <= importeTotal) 
            {
                if(saldoDeudor > importeTotal)
                {
                    System.out.println("Cargar otro saldo: ");
                    double saldo = entrada.nextDouble();
                    saldoDeudor = saldo;
                }
                
            }*/
            
            
            
            Venta v = new Venta(cantProdVend, importeTotal, saldoDeudor);
            
            almacen.agregarVenta(v);
        }
        
        System.out.println("Cantidad de ventas con importe superior a uno indicado por el usuario: ");
        System.out.println("Ingresar importe: ");
        double importe = entrada.nextDouble();
        
        System.out.print("Promedio general de todas las ventas: ");
        System.out.println(almacen.promedioGeneral());
        
        
        System.out.print("Sumatoria total de la deuda: ");
        System.out.println(almacen.sumatoriaTotalDeuda());
        
        System.out.println("Cantidad de ventas con importe superior a " + "$"+importe);
        System.out.println(almacen.cantidadVentas(importe));
    }
}
