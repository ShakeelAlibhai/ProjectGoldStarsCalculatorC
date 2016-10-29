package projectgoldstarscalculatorc;
import java.util.Scanner;
public class CosineDegrees
{
    public CosineDegrees()
    {
        cosineDegrees();
    }
    
    private static void cosineDegrees()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the degrees to find the cosine of: ");
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
        System.out.println("The cosine of " + input + " degrees = " + Math.cos(Math.toRadians(input)));
    }
}