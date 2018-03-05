package projectgoldstarscalculatorc;
import java.util.Scanner;
public class QuadraticEquationSolver
{
    private double a, b, c;
    
    public QuadraticEquationSolver()
    {
        System.out.println("Please enter the quadratic equation in the form ax^2 + bx + c = 0.");
        a = userPrompt('a');
        b = userPrompt('b');
        c = userPrompt('c');
        solve();
    }
    
    private double userPrompt(char variable)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean repeat = false;
        double input = 0.0;
        do
        {
            System.out.print(variable + ": ");
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
        return input;
    }
    
    private void solve()
    {
        double x1, x2, quadSqrt;
        quadSqrt = b * b;
        quadSqrt = quadSqrt - (4 * a * c);
        quadSqrt = Math.sqrt(quadSqrt);
        x1 = (-1) * b;
        x2 = (-1) * b;
        x1 = x1 + quadSqrt;
        x2 = x2 - quadSqrt;
        x1 = x1 / (2 * a);
        x2 = x2 / (2 * a);
        if(x1 == x2)
        {
            System.out.println("There is 1 possible solution: " + x1);
        }
        else
        {
            System.out.println("There are 2 possible solutions: " + x1 + " and " + x2);
        }
    }
}