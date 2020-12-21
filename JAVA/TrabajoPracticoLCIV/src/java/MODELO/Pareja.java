

package MODELO;

public class Pareja 
{
    private int idPareja;
    private String primerConyuge, segundoConyuge;
    private String telefono,domicilio,ciudad;
    private Provincia provincia;
    private boolean estado;
    private float saldo;
    
    public Pareja()
    {
        
    }

    public Pareja(float saldo) 
    {
        this.saldo = saldo;
    }
    

    public Pareja(int idPareja, String primerConyuge, String segundoConyuge, String telefono, String domcilio, String ciudad, Provincia provincia) 
    {
        this.idPareja = idPareja;
        this.primerConyuge = primerConyuge;
        this.segundoConyuge = segundoConyuge;
        this.telefono = telefono;
        this.domicilio = domcilio;
        this.ciudad = ciudad;
        this.provincia = provincia;
        estado = true;
    }

    public int getIdPareja() 
    {
        return idPareja;
    }

    public void setIdPareja(int idPareja) 
    {
        this.idPareja = idPareja;
    }

    public String getPrimerConyuge() 
    {
        return primerConyuge;
    }

    public void setPrimerConyuge(String primerConyuge) 
    {
        this.primerConyuge = primerConyuge;
    }

    public String getSegundoConyuge() 
    {
        return segundoConyuge;
    }

    public void setSegundoConyuge(String segundoConyuge) 
    {
        this.segundoConyuge = segundoConyuge;
    }

    public String getTelefono() 
    {
        return telefono;
    }

    public void setTelefono(String telefono) 
    {
        this.telefono = telefono;
    }

    public String getDomicilio() 
    {
        return domicilio;
    }

    public void setDomicilio(String domcilio) 
    {
        this.domicilio = domcilio;
    }

    public String getCiudad() 
    {
        return ciudad;
    }

    public void setCiudad(String ciudad) 
    {
        this.ciudad = ciudad;
    }

    public Provincia getProvincia() 
    {
        return provincia;
    }

    public void setProvincia(Provincia provincia) 
    {
        this.provincia = provincia;
    }
    
    public boolean isEstado() 
    {
        return estado;
    }

    public void setEstado(boolean estado) 
    {
        this.estado = estado;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    

    @Override
    public String toString() 
    {
        return "primerConyuge:" + primerConyuge +
                "\n segundoConyuge:" + segundoConyuge + 
                "\n telefono:" + telefono + 
                "\n domcilio:" + domicilio + 
                "\n ciudad:" + ciudad +
                "\n provincia:" + provincia.getProvincia();
    }
    
    
    

}
