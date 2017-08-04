package projectgoldstarscalculatorc;
import java.util.Scanner;
public class KelvinToCelsius
{
    public KelvinToCelsius()
    {
        kelvinToCelsius();
    }
    
    private static void kelvinToCelsius()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of degrees Kelvin: ");
        String input = keyboard.next();
        double kelvin = 0.0;
        try
        {
            kelvin = Double.parseDouble(input);
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
            return;
        }
        System.out.println(kelvin + " Kelvin ≈ " + toCelsius(kelvin) + " degrees Celsius");
    }
    
    private static double toCelsius(double kelvin)
    {
        return kelvin - 273.15;
    }
}