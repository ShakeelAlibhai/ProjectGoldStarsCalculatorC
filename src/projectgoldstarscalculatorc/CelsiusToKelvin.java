package projectgoldstarscalculatorc;
import java.util.Scanner;
public class CelsiusToKelvin
{
    public CelsiusToKelvin()
    {
        celsiusToKelvin();
    }
    
    private static void celsiusToKelvin()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of degrees Celsius: ");
        String input = keyboard.next();
        double degreesCelsius = 0.0;
        try
        {
            degreesCelsius = Double.parseDouble(input);
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
            return;
        }
        System.out.println(degreesCelsius + " degrees Celsius ≈ " + toKelvin(degreesCelsius) + " Kelvin");
    }
    
    private static double toKelvin(double degreesCelsius)
    {
        return degreesCelsius + 273.15;
    }
}