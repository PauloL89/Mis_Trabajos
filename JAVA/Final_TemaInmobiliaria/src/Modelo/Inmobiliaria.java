
package Modelo;

import java.util.ArrayList;


public class Inmobiliaria 
{
    private ArrayList<Inmueble> listaInmueble;
    private boolean bandera = true;
    
    public Inmobiliaria()
    {
        listaInmueble = new ArrayList();
    }

    
    //1. Agregar inmuebles
    
    public void AgregarInmueble(Inmueble inmueble)
    {
        listaInmueble.add(inmueble);
    }
    
    
    
    
    
    // 2.  Promedio del monto total de los inmuebles.
    
    public double promedioMontoTotal()
    {
        
        double acumulador = 0;
        int contador = 0;
        
        for (Inmueble inmueble : listaInmueble) 
        {
            acumulador += inmueble.montoAlquiler();
            contador++;
        }
        
        return acumulador / contador;
    }
    
    
    
    //3. Cantidad de casas alquiladas con 2 habitaciones
    
    public int cantidadCasasConDosHab()
    {
        int contador = 0;
        for (Inmueble inmueble : listaInmueble) 
        {
            if(inmueble instanceof  Casa && inmueble.getCantHabitaciones() == 2)
            {
                contador++;
            }
        }
        
        return contador;
    }
    
    
    
    //4 Dirección del departamento con alquiler más alto.
    //  La dirección debe incluir el piso y el número de departamento
    
    public String direccionDptoAlquilerMasCaro()
    {
        String direccionMayor ="";
        int piso = 0,numDpto = 0;
        double montoMayor = 0;
        
        
        for (Inmueble inmueble : listaInmueble) 
        {
            
            if(inmueble instanceof Departamento && bandera)
            {
                Departamento dpto = (Departamento)inmueble;
                
                direccionMayor = dpto.getDireccion();
                piso = dpto.getPisoDpto();
                numDpto = dpto.getNumDpto();
                montoMayor = dpto.montoAlquiler();
                
                bandera = false;
            }
            else if(inmueble instanceof  Departamento && inmueble.montoAlquiler() > montoMayor)
            {
                Departamento dpto = (Departamento)inmueble;
                
                direccionMayor = dpto.getDireccion();
                piso = dpto.getPisoDpto();
                numDpto = dpto.getNumDpto();
                montoMayor = dpto.montoAlquiler();
                
            }
        }
        
        return "Direccion Dpto: " + direccionMayor + ", Piso n°: " + piso + ", Numero Dpto: " + numDpto;
    }
}
