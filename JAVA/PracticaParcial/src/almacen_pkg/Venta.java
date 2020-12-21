
package almacen_pkg;


public class Venta 
{
    
    int cantProdVend;
    double importeTotal,saldoDeudor;
    
    

    public Venta(int cant, double importTot, double saldoDeud) 
    {
        
        cantProdVend = cant;
        importeTotal = importTot;
        saldoDeudor = saldoDeud;
    }

   
    public int getCantProcVend() 
    {
        return cantProdVend;
    }

    public void setCantProcVend(int cantProcVend) 
    {
        this.cantProdVend = cantProcVend;
    }

    public double getImporteTotal() 
    {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal)
    {
        this.importeTotal = importeTotal;
    }

    public double getSaldoDeudor() 
    {
        return saldoDeudor;
    }

    public void setSaldoDeudor(double saldoDeudor) 
    {
        this.saldoDeudor = saldoDeudor;
    }


    public String toStringVenta() 
    {
        return  "\n cantidad de productos vendidos: " + "\n Cantidad de productos vendidos: " +cantProdVend + "\n Importe total de la venta: " + importeTotal 
                + "\n Saldo deudor: " + saldoDeudor;
    }
    
    
    
   
}
