package projectgoldstarscalculatorc;
import java.util.Scanner;
public class CelsiusToFahrenheit
{
    public CelsiusToFahrenheit()
    {
        celsiusToFahrenheit();
    }
    
    private static void celsiusToFahrenheit()
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
        System.out.println(degreesCelsius + " degrees Celsius ≈ " + toFahrenheit(degreesCelsius) + " degrees Fahrenheit");
    }
    
    private static double toFahrenheit(double degreesCelsius)
    {
        return (degreesCelsius * 9 / 5) + 32;
    }
}