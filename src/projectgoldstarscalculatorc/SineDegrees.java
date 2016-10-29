package projectgoldstarscalculatorc;
import java.util.Scanner;
public class SineDegrees
{
    public SineDegrees()
    {
        sineDegrees();
    }
    
    private static void sineDegrees()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the degrees to find the sine of: ");
        String inputStr = keyboard.next();
        double input = 0.0;
        try
        {
            input = Double.parseDouble(inputStr);
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
            return;
        }
        System.out.println("The sine of " + input + " degrees = " + Math.sin(Math.toRadians(input)));
    }
}