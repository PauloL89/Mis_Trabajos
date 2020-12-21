
package Herencia;


public class CuentaCorriente extends Cuenta
{
    
    private double acuerdo = -2000, saldoInicial;

   
    @Override
    public double extraer(double monto)
    {
        saldoInicial = saldo;
        if(saldo >= acuerdo)
        {
            saldo = saldo - monto;
            if(saldo >= acuerdo)
            return saldo;
            else
                saldo = saldoInicial;
            System.out.println("Su saldo no puede ser inferior a: " + acuerdo);
            return saldo;
        }

        return saldo;
    }
    
    
    
}
