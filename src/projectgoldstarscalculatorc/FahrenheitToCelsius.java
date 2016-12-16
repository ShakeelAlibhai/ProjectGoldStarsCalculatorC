package projectgoldstarscalculatorc;
import java.util.Scanner;
public class FahrenheitToCelsius
{
    public FahrenheitToCelsius()
    {
        fahrenheitToCelsius();
    }
    
    private static void fahrenheitToCelsius()
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
        System.out.println(degreesFahrenheit + " degrees Fahrenheit ≈ " + toCelsius(degreesFahrenheit) + " degrees Celsius");
    }
    
    private static double toCelsius(double degreesFahrenheit)
    {
        return (degreesFahrenheit - 32) * 5 / 9;
    }
}