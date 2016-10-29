package projectgoldstarscalculatorc;
import java.util.Scanner;
public class TangentRadians
{
    public TangentRadians()
    {
        tangentRadians();
    }
    
    private static void tangentRadians()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the radians to find the tangent of: ");
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
        System.out.println("The tangent of " + input + " radians = " + Math.tan(input));
    }
}