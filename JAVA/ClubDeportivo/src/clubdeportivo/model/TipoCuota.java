
package clubdeportivo.model;


public class TipoCuota {
    private String Descripcion;

    public TipoCuota(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    @Override
    public String toString() {
        return  Descripcion ;
    }
}
