package projectgoldstarscalculatorc;
import java.util.Scanner;
public class CosineRadians
{
    public CosineRadians()
    {
        cosineRadians();
    }
    
    private static void cosineRadians()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the radians to find the cosine of: ");
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
        System.out.println("The cosine of " + input + " radians = " + Math.cos(input));
    }
}