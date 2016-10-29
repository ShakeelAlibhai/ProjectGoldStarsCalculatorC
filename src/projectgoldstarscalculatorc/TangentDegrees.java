package projectgoldstarscalculatorc;
import java.util.Scanner;
public class TangentDegrees
{
    public TangentDegrees()
    {
        tangentDegrees();
    }
    
    private static void tangentDegrees()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the degrees to find the tangent of: ");
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
        System.out.println("The tangent of " + input + " degrees = " + Math.tan(Math.toRadians(input)));
    }
}