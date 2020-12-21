
package Herencia;


public class Principal
{
    public static void main(String[] args) 
    {
        CajaAhorro ca = new CajaAhorro();
        CuentaCorriente cr = new CuentaCorriente();
        
        ca.setNombre("Ragnar");
        ca.setNumeroCuenta(1);
        ca.setSaldo(100);
        ca.depositar(500);
        ca.extraer(200);
        
        System.out.println("Caja de Ahorro:");
        System.out.println(ca.toStringCuenta());
        
        System.out.println("=================");
        
        cr.setNombre("Ragnar");
        cr.setNumeroCuenta(1);
        cr.setSaldo(100);
        cr.depositar(200);
        cr.extraer(2000);
        
        System.out.println("Cuenta Corriente:");
        System.out.println(cr.toStringCuenta());
    }
}
