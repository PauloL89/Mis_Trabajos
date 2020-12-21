
package GananciaClases;


public class ProfesorClase 
{
    
    private String diaHora, materia;
    private double costoBase;
   private int tipoClase;
    
   public ProfesorClase()
   {
       
   } 
   
   public ProfesorClase(String diaHor, String mate, double prec, int tipclase)
   {
       diaHora = diaHor;
       materia = mate;
       costoBase = prec;
       tipoClase = tipclase;
   } 

    public String getDiaHora()
    {
        return diaHora;
    }

    public void setDiaHora(String diaHora) 
    {
        this.diaHora = diaHora;
    }

    public String getMateria()
    {
        return materia;
    }

    public void setMateria(String materia) 
    {
        this.materia = materia;
    }

    public double getCostoBase()
    {
        return costoBase;
    }

    public void setCostoBase(double costoBase) 
    {
        this.costoBase = costoBase;
    }

    public int getTipoClase() 
    {
        return tipoClase;
    }

    public void setTipoClase(int tipoClase) 
    {
        this.tipoClase = tipoClase;
    }
    
    public String textoTipoClase()
    {
        String texto = "";
        if(tipoClase == 0)
        {
            texto = "Individual";
        }
        else if(tipoClase == 1)
        {
            texto = "Grupal";
        }
        return texto;
    }

    @Override
    public String toString() 
    {
        return "dia y Hora de la Clase :" + diaHora 
                + "\n Materia a dictar: " + materia 
                + "\n Costo Base de la clase " + costoBase 
                + "\n Tipo de Clase: " + textoTipoClase();
    }
    
    
   
   
}
