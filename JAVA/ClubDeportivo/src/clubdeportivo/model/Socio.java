
package clubdeportivo.model;

public class Socio {
    private int documento;
    private String nombre;
    private int cantAdicionales;
    private TipoCuota tipoCta;

    public Socio(int documento, String nombre, int cantAdicionales, TipoCuota tipoCta) {
        this.documento = documento;
        this.nombre = nombre;
        this.cantAdicionales = cantAdicionales;
        this.tipoCta = tipoCta;
    }
    public String getDescripcionCta()
    {
    return tipoCta.getDescripcion();
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantAdicionales() {
        return cantAdicionales;
    }

    public void setCantAdicionales(int cantAdicionales) {
        this.cantAdicionales = cantAdicionales;
    }

    public TipoCuota getTipoCta() {
        return tipoCta;
    }

    public void setTipoCta(TipoCuota tipoCta) {
        this.tipoCta = tipoCta;
    }

    @Override
    public String toString() {
        return "Socio{" + "documento=" + documento + ", nombre=" + nombre + ", cantAdicionales=" + cantAdicionales + ", tipoCta=" + tipoCta + '}';
    }

   
    
    
}
