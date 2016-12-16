package projectgoldstarscalculatorc;
import java.util.Scanner;
public class MilesPerGallonCalculator
{
    private double reading1;
    private double reading2;
    private double gallons;
    
    public MilesPerGallonCalculator()
    {
        reading1 = inputPrompt("the beginning odometer reading");
        reading2 = inputPrompt("the ending odometer reading");
        gallons = inputPrompt("the number of gallons of gas used");
        if(check())
        {
            solve();
        }
    }
    
    private double inputPrompt(String prompt)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean repeat = false;
        double input = 0.0;
        do
        {
            System.out.print("Please enter " + prompt + ": ");
            String inputStr = keyboard.next();
            try
            {
                input = Double.parseDouble(inputStr);
                repeat = false;
            }
            catch(Exception e)
            {
                System.out.println("ERROR\n"
                        + "Please re-enter value.");
                repeat = true;
            }
        }while(repeat);
        while(input < 0.0)
        {
            repeat = true;
            do
            {
                System.out.println("ERROR: Number cannot be negative.");
                System.out.print("Please enter " + prompt + ": ");
                String inputStr = keyboard.next();
                try
                {
                    input = Double.parseDouble(inputStr);
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
    
    private boolean check()
    {
        if(reading1 > reading2)
        {
            System.out.println("ERROR: Final odometer reading is less than original odometer reading.");
            return false;
        }
        if(gallons == 0)
        {
            System.out.println("ERROR: Gallons is 0.");
            return false;
        }
        return true;
    }
    
    private void solve()
    {
        String output = "The travel distance was " + (reading2 - reading1) + " miles.";
        output += "\nThe average miles per gallon was " + ((reading2 - reading1) / gallons) + ".";
        System.out.println(output);
    }
}