package projectgoldstarscalculatorc;
import java.util.Scanner;
public class Exponents
{
    public Exponents()
    {
        exponents();
    }
    
    private static void exponents()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the base number: ");
        String input = keyboard.next();
        double baseNum = 0.0;
        try
        {
            baseNum = Double.parseDouble(input);
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
            return;
        }
        System.out.print("Please enter the number to raise " + baseNum + " to: ");
        input = keyboard.next();
        double exponent = 0.0;
        try
        {
            exponent = Double.parseDouble(input);
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
            return;
        }
        System.out.println(baseNum + " ^ " + exponent + " = " + Math.pow(baseNum, exponent));
    }
}