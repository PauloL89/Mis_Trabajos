
public class Principal 
{
    public static void main(String[] args)
    {
        int antiguedad;
        Auto car = new Auto();
        
        car.marca = "CHEVROLET";
        car.modelo = 2016;
        car.precio = 180.000;
        car.km = 0;
        
        antiguedad = car.retornarAntiguedad(2020);
        
        System.out.println(car.toStringAuto() + " atiguedad coche: " + antiguedad + " años");
        
        
        
    }
}
