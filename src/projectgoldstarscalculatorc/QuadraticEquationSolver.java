package projectgoldstarscalculatorc;
import java.util.Scanner;
public class QuadraticEquationSolver
{
    private double a, b, c;
    
    public QuadraticEquationSolver()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the quadratic equation in the form ax^2 + bx + c = 0.");
        System.out.print("a: ");
        String input = keyboard.next();
        try
        {
            a = Double.parseDouble(input);
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
            return;
        }
        System.out.print("b: ");
        input = keyboard.next();
        try
        {
            b = Double.parseDouble(input);
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
            return;
        }
        System.out.print("c: ");
        input = keyboard.next();
        try
        {
            c = Double.parseDouble(input);
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
            return;
        }
        solve();
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