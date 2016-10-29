package projectgoldstarscalculatorc;
import java.util.Scanner;
public class Add
{
    public Add()
    {
        add();
    }
    
    private static void add()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many numbers do you want to add together? ");
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
        double sum = 0;
        for(int i = 0; i < numOfNums; i++)
        {
            System.out.print("Please enter Number " + (i + 1) + ": ");
            try
            {
                sum += keyboard.nextDouble();
            }
            catch(Exception e)
            {
                System.out.println("ERROR");
                return;
            }
        }
        System.out.println("The numbers added together equal " + sum + ".");
    }
}