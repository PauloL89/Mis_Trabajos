
package municipalidad;



public class Pago
{
    private int demora;
    private double importe, interesesAdicionales;

    public Pago() 
    {
        demora = 0;
        importe = 0;
        interesesAdicionales = 0;
    }

   
    public Pago(int demora, double importe, double interesesAdicionales) 
    {
        this.demora = demora;
        this.importe = importe;
        this.interesesAdicionales = interesesAdicionales;
    }

    public int getDemora() 
    {
        return demora;
    }

    public void setDemora(int demora) 
    {
        this.demora = demora;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) 
    {
        this.importe = importe;
    }

    public double getInteresesAdicionales() 
    {
        return interesesAdicionales;
    }

    public void setInteresesAdicionales(double interesesAdicionales) 
    {
        this.interesesAdicionales = interesesAdicionales;
    }
    
    
    public String toStringPago()
    {
        return "Demora: " + demora + "\n Importe: " + importe + "\n Intereses adicionales: " + interesesAdicionales;
    }
}
