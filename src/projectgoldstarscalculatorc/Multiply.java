package projectgoldstarscalculatorc;
import java.util.Scanner;
public class Multiply
{
    public Multiply()
    {
        multiply();
    }
    
    private static void multiply()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many numbers do you want to multiply together? ");
        String input = keyboard.next();
        int numOfNums = 0;
        try
        {
            numOfNums = Integer.parseInt(input);
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
            return;
        }
        double product = 1.0;
        for(int i = 0; i < numOfNums; i++)
        {
            System.out.print("Please enter Number " + (i + 1) + ": ");
            try
            {
                product *= keyboard.nextDouble();
            }
            catch(Exception e)
            {
                System.out.println("ERROR");
                return;
            }
        }
        System.out.println("The numbers multiplied together equal " + product + ".");
    }
}