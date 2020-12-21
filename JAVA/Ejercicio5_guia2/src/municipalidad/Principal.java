
package municipalidad;


public class Principal 
{
    
    public static void main(String[] args) 
    {
        Municipalidad muni = new Municipalidad(1);
        
        Plan plan = new Plan("Pepe",0, 2);
    
        muni.agregarPlanes(plan);
        
        Pago p1 = new Pago(1, 20, 5);
        Pago p2 = new Pago(0, 20, 0);
        
        plan.agregarPago(p1);
        plan.agregarPago(p2);
        
        //Listar pagos
        System.out.println(plan.listadoPagos());
        
        /*Cantidad de planes pagados en su totalidad (es decir, que tengan tantos
          pagos recibidos como la cantidad de cuotas pactadas)*/
          
        System.out.println("Cantidad de planes pagados: " + muni.cantidadPlanesPagados());
        
        //Sumatoria de las deudas registradas
        System.out.println("Total deudas registradas: " + muni.sumatoriDeuda());
        
        //Listado de todos los pagos efectuados por un contribuyente en particular
            
        System.out.println("Listados de pagos por un contribuyente: " + muni.listarPagosContribuyentes("Pepe"));
        
        //Promedio general de intereses adicionales cobrados
        System.out.println("Promedio general de intereses adicionales cobrados");
        System.out.println(muni.promedioIntereses());
    }
    
}
