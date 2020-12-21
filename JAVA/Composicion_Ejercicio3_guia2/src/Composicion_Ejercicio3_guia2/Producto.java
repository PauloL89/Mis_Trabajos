
package Composicion_Ejercicio3_guia2;

/**
 *
 * @author Paulo-PC
 */
public class Producto 
{
    private String descripcion;
    private Material[] materiales;
    
    public Producto(String descripcion,int cantMateriales)
    {
        this.descripcion = descripcion;
        materiales = new Material[cantMateriales];
    }
    
    /*
         Desarrolle en la clase Producto un método que permita agregar un Material
        recibido por parámetro al vector.
    */
    
    public void AgregarMaterial(Material m)
    {
        for (int i = 0; i < materiales.length; i++) 
        {
            if(materiales[i] == null)
            {
                materiales[i] = m;
                break;
            }
            
        }
    }
    
    /*
        Desarrolle en la clase Producto un método que retorne el costo total. Dicho
        valor se calcula sumando todos los valores unitarios de los Materiales que
        componen el Producto.
    */
    
    public double costoTotal()
    {
        double sumaTotal = 0;
        for (int i = 0; i < materiales.length; i++)
        {
            if(materiales[i] != null)
            {
                sumaTotal += materiales[i].getValorUnitario();
            }
            
        }
        
        return  sumaTotal;
    }
    
    /*
         Desarrolle en la clase Producto un método que reciba por parámetro un código
        de material y retorne true si dicho material forma parte del Producto.
    */
    public boolean materialEnProducto(int codigoMaterial)
    {
        boolean estaEnProducto = false;
        for (int i = 0; i < materiales.length; i++) 
        {
            if(materiales[i].getCodigo() == codigoMaterial && materiales[i] != null)
            {
                estaEnProducto = true;
                break;
            }
            
        }
        
        
        return estaEnProducto;
    }
    
    /*
         Desarrolle en la clase producto un método que retorne un vector con todos los
         materiales que tengan un valor unitario menor a un parámetro.
    */
    
    public Material[] valorUnitarioMenor(double PrecioMaterial)
    {
        
        Material[] materialMenorPrecio = new Material[materiales.length];
        int proximaPosicion = 0;

        for (int i = 0; i < materiales.length; i++)
        {
            if(materiales[i] != null && materiales[i].getValorUnitario() < PrecioMaterial )
            {
                materialMenorPrecio[proximaPosicion] = materiales[i];
                proximaPosicion++;
            }
        }

        return materialMenorPrecio;  
    }
    
    
    
    /*
        Desarrolle en la clase producto un método que retorne un vector donde cada
        casillero contenga la cantidad de materiales por precio, siguiendo las siguiente
        regla: Si 0 < precio ≤ 10 contarlo en el primer casillero. Si 10 < precio ≤ 20
        contarlo en el segundo casillero. Si 20 < precio ≤ 30 contarlo en el tercer
        casillero. Si precio > 30 contarlo en el cuarto casillero.
    */
    
    public int[] materialXprecio()
    {
        int[] cantidadXPrecio = new int[4];

        for (int i = 0; i < materiales.length; i++) 
        {
            if (materiales[i] != null) 
            {
                if (materiales[i].getValorUnitario() > 0 && materiales[i].getValorUnitario() <= 10) 
                {
                    cantidadXPrecio[0]++;
                } else if (materiales[i].getValorUnitario() > 10 && materiales[i].getValorUnitario() <= 20)
                {
                    cantidadXPrecio[1]++;
                } else if (materiales[i].getValorUnitario() > 20 && materiales[i].getValorUnitario() <= 30)
                {
                    cantidadXPrecio[2]++;
                } else 
                {
                    cantidadXPrecio[3]++;
                }

            }

        }

        return cantidadXPrecio;
    }

}
