
/*
programar una clase auto con datos de un automotor (marca,modelo,precio y kilometraje).
incluir un metodo que retorne la antiguedad del auto.
*/
public class Auto 
{
    String marca;
    int modelo, km;
    double precio;
    
    public Auto()
    {
        marca = "";
        modelo = 0;
        km = 0;
        precio = 0.0;
    }
    
    public Auto(String mar, int mod, int kim, double prec)
    {
        marca = mar;
        modelo = mod;
        km = kim;
        precio = prec;
    }

    public String getMarca() 
    {
        return marca;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public int getModelo() 
    {
        return modelo;
    }

    public void setModelo(int modelo)
    {
        this.modelo = modelo;
    }

    public int getKm() 
    {
        return km;
    }

    public void setKm(int km) 
    {
        this.km = km;
    }

    public double getPrecio() 
    {
        return precio;
    }

    public void setPrecio(double precio) 
    {
        this.precio = precio;
    }


    public String toStringAuto() 
    {
        return "marca: " + marca + 
                ", modelo: " + modelo + 
                ", km: " + km + 
                ", precio: " + String.format("%.3f", precio);
    }
    
    
    public int retornarAntiguedad(int anioActual)
    {
        int antiguedad;
        
        antiguedad = anioActual - modelo;
        
        return antiguedad;
    }
    
}
