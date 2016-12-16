package projectgoldstarscalculatorc;
import java.util.Scanner;
public class RadiansToDegrees
{
    public RadiansToDegrees()
    {
        radiansToDegrees();
    }
    
    private static void radiansToDegrees()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of radians: ");
        String input = keyboard.next();
        double radians = 0.0;
        try
        {
            radians = Double.parseDouble(input);
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
            return;
        }
        System.out.println(radians + " radians ≈ " + Math.toDegrees(radians) + " degrees");
    }
}