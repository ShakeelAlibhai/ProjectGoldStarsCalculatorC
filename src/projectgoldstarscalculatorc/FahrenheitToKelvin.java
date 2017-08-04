package projectgoldstarscalculatorc;
import java.util.Scanner;
public class FahrenheitToKelvin
{
    public FahrenheitToKelvin()
    {
        fahrenheitToKelvin();
    }
    
    private static void fahrenheitToKelvin()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of degrees Fahrenheit: ");
        String input = keyboard.next();
        double degreesFahrenheit = 0.0;
        try
        {
            degreesFahrenheit = Double.parseDouble(input);
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
            return;
        }
        System.out.println(degreesFahrenheit + " degrees Fahrenheit ≈ " + toKelvin(degreesFahrenheit) + " Kelvin");
    }
    
    private static double toKelvin(double degreesFahrenheit)
    {
        return ((degreesFahrenheit - 32) / 1.8) + 273.15;
    }
}