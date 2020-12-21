

package MODELO;

public class Vendedor 
{
    private int codVendedor;
    private String nombreVendedor, apellidoVendedor;
    private String telefono,domicilio, ciudad;
    private Provincia provincia;

    public Vendedor(int codVendedor, String nombreVendedor, String apellidoVendedor, String telefono, String domicilio, String ciudad, Provincia provincia) 
    {
        this.codVendedor = codVendedor;
        this.nombreVendedor = nombreVendedor;
        this.apellidoVendedor = apellidoVendedor;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    public int getCodVendedor() 
    {
        return codVendedor;
    }

    public void setCodVendedor(int codVendedor) 
    {
        this.codVendedor = codVendedor;
    }

    public String getNombreVendedor() 
    {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) 
    {
        this.nombreVendedor = nombreVendedor;
    }

    public String getApellidoVendedor()
    {
        return apellidoVendedor;
    }

    public void setApellidoVendedor(String apellidoVendedor)
    {
        this.apellidoVendedor = apellidoVendedor;
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

    public void setDomicilio(String domicilio) 
    {
        this.domicilio = domicilio;
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

    @Override
    public String toString() 
    {
        return "NombreVendedor: " + nombreVendedor 
                + "\n Apellido Vendedor:" + apellidoVendedor 
                + "\n telefono: " + telefono 
                + "\n domicilio: " + domicilio 
                + "\n ciudad: " + ciudad 
                + "\n provincia: " + provincia;
    }
    
    
    
    
}
