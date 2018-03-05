package projectgoldstarscalculatorc;
import java.util.Scanner;
public class LogBase10
{
    public LogBase10()
    {
        logBase10();
    }
    
    private static void logBase10()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number to find the log base 10 of: ");
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
        System.out.println("The log base 10 of " + num + " is: " + Math.log10(num));
    }
}