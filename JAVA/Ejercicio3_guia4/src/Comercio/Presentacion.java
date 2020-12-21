
package Comercio;


public class Presentacion
{
    private int numCliente, tipoPresentacion,sucursal;
    private String textPresentacion;
    private boolean solicitaLLamadoTelefonico;
    
    public Presentacion()
    {
        numCliente = 0;
        tipoPresentacion = 0;
        sucursal = 0;
        textPresentacion = "";
        solicitaLLamadoTelefonico = false;
    }
    
    public Presentacion(int numCli, int tipoPresen, int suc, String textPresen, boolean solicTel)
    {
        numCliente = numCli;
        tipoPresentacion = tipoPresen;
        sucursal = suc;
        textPresentacion = textPresen;
        solicitaLLamadoTelefonico = solicTel;
    }

    public int getNumCliente() 
    {
        return numCliente;
    }

    public void setNumCliente(int numCliente) 
    {
        this.numCliente = numCliente;
    }

    public int getTipoPresentacion() 
    {
        return tipoPresentacion;
    }

    public void setTipoPresentacion(int tipoPresentacion) 
    {
        this.tipoPresentacion = tipoPresentacion;
    }

    public int getSucursal()
    {
        return sucursal;
    }

    public void setSucursal(int sucursal) 
    {
        this.sucursal = sucursal;
    }

    public String getTextPresentacion() 
    {
        return textPresentacion;
    }

    public void setTextPresentacion(String textPresentacion) 
    {
        this.textPresentacion = textPresentacion;
    }

    public boolean isSolicitaLLamadoTelefonico() 
    {
        return solicitaLLamadoTelefonico;
    }
    
    public String TextoSolicitaLlamado()
    {
        String texto;
        if(solicitaLLamadoTelefonico == true)
        {
            texto = "Si";
        }else
        {
            texto = "No";
        }
        return texto;
    }
    
    public String textoPresentacion()
    {
        String texto;
        switch (tipoPresentacion) 
        {
            case 0:
                texto = "Reclamo";
                break;
            case 1:
                texto = "Consulta";
                break;
            case 2:
                texto = "Sugerencia";
                break;
            default:
                texto = "Elija algunas de las opciones disponibles";
        }
        return  texto;
    }

    @Override
    public String toString() 
    {
        return "-Numero de Cliente: " + numCliente 
                + "\n || Tipo de Presentacion: " + textoPresentacion()
                + "\n || Sucursal Afectada: " + sucursal + 
                "\n || Texto de Presentacion: " + textPresentacion
                + "\n || Solicita Lamado Telefonico: " + TextoSolicitaLlamado();
    }
    
    
    
}
