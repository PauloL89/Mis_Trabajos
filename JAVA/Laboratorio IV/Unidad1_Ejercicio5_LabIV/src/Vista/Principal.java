

package Vista;

import Controlador.Conexion;
import DTO.DtoTransaccionMayortipoVenta;
import java.util.ArrayList;


public class Principal
{
    public static void main(String[] args) 
    {
        Conexion con = new Conexion();
        
        ArrayList<DtoTransaccionMayortipoVenta> lista = con.obtenerTransaccionesOficinas();
        
        for (DtoTransaccionMayortipoVenta transacciones : lista) 
        {
           System.out.println(transacciones); 
        }
                
        double porcentaje = con.PorcentajeTransaccionAlquiler();
        
        System.out.println("Porcentajes de Alquileres: " + porcentaje +"%");
        
    }
}
