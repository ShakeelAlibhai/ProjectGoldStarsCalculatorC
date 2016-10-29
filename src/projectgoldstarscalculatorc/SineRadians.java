package projectgoldstarscalculatorc;
import java.util.Scanner;
public class SineRadians
{
    public SineRadians()
    {
        sineRadians();
    }
    
    private static void sineRadians()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the radians to find the sine of: ");
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
        System.out.println("The sine of " + input + " radians = " + Math.sin(input));
    }
}