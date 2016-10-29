package projectgoldstarscalculatorc;
import java.util.Scanner;
public class AverageCalculator
{
    private int numOfNums;
    private double sum;
    private double average;
    
    public AverageCalculator()
    {
        numOfNums = inputPromptNumOfNums();
        boolean continueComputation = getValues();
        //Continue the computation if the getValues() method was successful.
        if(continueComputation)
        {
            computeAverage();
            output();
        }
    }
    
    private int inputPromptNumOfNums()
    {
        Scanner keyboard = new Scanner(System.in);
        boolean repeat = false;
        int input = 0;
        do
        {
            System.out.print("How many numbers do you want to find the average of? ");
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
        return input;
    }
    
    private boolean getValues()
    {
        Scanner keyboard = new Scanner(System.in);
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
                return false;
            }
        }
        return true;
    }
    
    private void computeAverage()
    {
        average = sum / numOfNums;
    }
    
    private void output()
    {
        System.out.println("The average of the numbers is: " + average);
    }
}