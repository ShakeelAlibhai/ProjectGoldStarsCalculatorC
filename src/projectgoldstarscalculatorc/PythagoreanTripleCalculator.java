package projectgoldstarscalculatorc;
import java.util.Scanner;
public class PythagoreanTripleCalculator
{
    private int num1;
    private int num2;
    
    public PythagoreanTripleCalculator()
    {
        num1 = inputPromptFirstNumber();
        num2 = inputPromptSecondNumber();
        verify();
        solve();
    }
    
    private static int inputPromptFirstNumber()
    {
        Scanner keyboard = new Scanner(System.in);
        boolean repeat = false;
        int input = 0;
        do
        {
            System.out.print("Please enter the first number: ");
            String inputStr = keyboard.next();
            try
            {
                input = Integer.parseInt(inputStr);
                repeat = false;
            }
            catch(Exception e)
            {
                System.out.println("ERROR\n"
                        + "Please re-enter value.");
                repeat = true;
            }
        }while(repeat);
        while(input < 1)
        {
            repeat = true;
            do
            {
                System.out.println("ERROR: Number must be greater than or equal to 1.");
                System.out.print("Please enter the first number: ");
                String inputStr = keyboard.next();
                try
                {
                    input = Integer.parseInt(inputStr);
                    repeat = false;
                }
                catch(Exception e)
                {
                    System.out.println("ERROR\n"
                            + "Please re-enter value.");
                    repeat = true;
                }
            }while(repeat);
        }
        return input;
    }
    
    private static int inputPromptSecondNumber()
    {
        Scanner keyboard = new Scanner(System.in);
        boolean repeat = false;
        int input = 0;
        do
        {
            System.out.print("Please enter the second number: ");
            String inputStr = keyboard.next();
            try
            {
                input = Integer.parseInt(inputStr);
                repeat = false;
            }
            catch(Exception e)
            {
                System.out.println("ERROR\n"
                        + "Please re-enter value.");
                repeat = true;
            }
        }while(repeat);
        while(input < 1)
        {
            repeat = true;
            do
            {
                System.out.println("ERROR: Number must be greater than or equal to 1.");
                System.out.print("Please enter the second number: ");
                String inputStr = keyboard.next();
                try
                {
                    input = Integer.parseInt(inputStr);
                    repeat = false;
                }
                catch(Exception e)
                {
                    System.out.println("ERROR\n"
                            + "Please re-enter value.");
                    repeat = true;
                }
            }while(repeat);
        }
        return input;
    }
    
    private void verify()
    {
        if(num2 > num1)
        {
            int temp;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
    }
    
    private void solve()
    {
        int a, b, c;
        a = (int)(Math.pow(num1, 2) - Math.pow(num2, 2));
        b = 2 * num1 * num2;
        c = (int)(Math.pow(num1, 2) + Math.pow(num2, 2));
        String output = "a = " + a;
        output += "\nb = " + b;
        output += "\nc = " + c;
        System.out.println(output);
    }
}