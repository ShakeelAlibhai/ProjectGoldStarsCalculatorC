package projectgoldstarscalculatorc;
import java.util.Scanner;
public class NaturalLog
{
    public NaturalLog()
    {
        naturalLog();
    }
    
    private static void naturalLog()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number to find the natural log of: ");
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
        System.out.println("The natural log of " + num + " is: " + Math.log(num));
    }
}