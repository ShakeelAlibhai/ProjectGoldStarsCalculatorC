package projectgoldstarscalculatorc;
import java.util.Scanner;
public class DegreesToRadians
{
    public DegreesToRadians()
    {
        degreesToRadians();
    }
    
    private static void degreesToRadians()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of degrees: ");
        String input = keyboard.next();
        double degrees = 0.0;
        try
        {
            degrees = Double.parseDouble(input);
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
            return;
        }
        System.out.println(degrees + " degrees ≈ " + Math.toRadians(degrees) + " radians");
    }
}