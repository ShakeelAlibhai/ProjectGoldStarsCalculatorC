package projectgoldstarscalculatorc;
import java.util.Scanner;
public class Divide
{
    public Divide()
    {
        divide();
    }
    
    private static void divide()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        String input = keyboard.next();
        double num1 = 0.0;
        try
        {
            num1 = Double.parseDouble(input);
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
            return;
        }
        System.out.print("Please enter the second number: ");
        input = keyboard.next();
        double num2 = 0.0;
        try
        {
            num2 = Double.parseDouble(input);
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
            return;
        }
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}