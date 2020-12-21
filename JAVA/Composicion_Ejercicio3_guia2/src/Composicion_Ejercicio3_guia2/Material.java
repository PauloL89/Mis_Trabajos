/*
    Desarrolle la clase Material de manera que contenga en su interior los
atributos: descripción (String) código(int) valorUnitario (float).
 */
package Composicion_Ejercicio3_guia2;

/**
 *
 * @author Paulo-PC
 */
public class Material 
{
    private String descripcion;
    private int codigo;
    private float valorUnitario;
    
    public Material()
    {
        descripcion = "";
        codigo = 0;
        valorUnitario = 0;
    }
    
    public Material(String desc, int codig,float valorUnit)
    {
        descripcion = desc;
        codigo = codig;
        valorUnitario = valorUnit;
    }

    public String getDescripcion() 
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public float getValorUnitario() 
    {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario)
    {
        this.valorUnitario = valorUnitario;
    }
    
    
    
}
