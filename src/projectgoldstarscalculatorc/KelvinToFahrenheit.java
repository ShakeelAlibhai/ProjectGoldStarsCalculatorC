package projectgoldstarscalculatorc;
import java.util.Scanner;
public class KelvinToFahrenheit
{
    public KelvinToFahrenheit()
    {
        kelvinToFahrenheit();
    }
    
    private static void kelvinToFahrenheit()
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
        System.out.println(kelvin + " Kelvin ≈ " + toFahrenheit(kelvin) + " degrees Fahrenheit");
    }
    
    private static double toFahrenheit(double kelvin)
    {
        return 1.8 * (kelvin - 273.15) + 32;
    }
}