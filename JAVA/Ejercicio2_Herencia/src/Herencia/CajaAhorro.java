
package Herencia;

public class CajaAhorro extends Cuenta
{

    
    @Override
    public double extraer(double monto)
    {
        if(saldo > monto)
        {
            saldo =  saldo - monto;
            System.out.println("Se extrajeron: " + "$"+monto + " de su cuenta");
            return saldo;
        }
        else
        {
            System.out.println("No se puede retirar ese monto porque su saldo es inferior");
        }
        
        return saldo;
    }
    
    
}
