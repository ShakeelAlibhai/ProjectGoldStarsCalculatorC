package projectgoldstarscalculatorc;
import java.util.Scanner;
public class SquareRoot
{
    public SquareRoot()
    {
        squareRoot();
    }
    
    private static void squareRoot()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number to find the square root of: ");
        String input = keyboard.next();
        double num = 0.0;
        try
        {
            num = Double.parseDouble(input);
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
            return;
        }
        System.out.println("The square root of " + num + " is: " + Math.sqrt(num));
    }
}