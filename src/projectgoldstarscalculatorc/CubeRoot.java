package projectgoldstarscalculatorc;
import java.util.Scanner;
public class CubeRoot
{
    public CubeRoot()
    {
        cubeRoot();
    }
    
    private static void cubeRoot()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number to find the cube root of: ");
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
        System.out.println("The square root of " + num + " is: " + Math.cbrt(num));
    }
}