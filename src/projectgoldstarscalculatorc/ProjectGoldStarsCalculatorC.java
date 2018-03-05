package projectgoldstarscalculatorc;
import java.util.Scanner;
public class ProjectGoldStarsCalculatorC
{
    public static final String name = "Project GoldStars Calculator C 1.3";
    public static final String version = "Version 1.3";
    public static String theme = "***************";
    
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean continueRunning = true;
        System.out.println("Welcome to Project GoldStars Calculator C!");
        System.out.println(theme);
        new Menu();
        while(continueRunning)
        {
            System.out.println(theme);
            System.out.print("Please enter the number or letter of the option you want, or press M to see the menu again: ");
            String choice = keyboard.next().toUpperCase();
            System.out.println(theme);
            switch(choice)
            {
                case "M":
                {
                    new Menu();
                    break;
                }
                case "1":
                {
                    new Add();
                    break;
                }
                case "2":
                {
                    new Subtract();
                    break;
                }
                case "3":
                {
                    new Multiply();
                    break;
                }
                case "4":
                {
                    new Divide();
                    break;
                }
                case "5":
                {
                    new SquareRoot();
                    break;
                }
                case "6":
                {
                    new CubeRoot();
                    break;
                }
                case "7":
                {
                    new Exponents();
                    break;
                }
                case "8":
                {
                    new NaturalLog();
                    break;
                }
                case "9":
                {
                    new LogBase10();
                    break;
                }
                case "10":
                {
                    new Trigonometry();
                    break;
                }
                case "11":
                {
                    new Conversions();
                    break;
                }
                case "AV":
                {
                    new AverageCalculator();
                    break;
                }
                case "MPG":
                {
                    new MilesPerGallonCalculator();
                    break;
                }
                case "P":
                {
                    new PythagoreanTripleCalculator();
                    break;
                }
                case "Q":
                {
                    new QuadraticEquationSolver();
                    break;
                }
                case "A":
                {
                    new About();
                    break;
                }
                case "D":
                {
                    new Disclaimer();
                    break;
                }
                case "X":
                {
                    continueRunning = false;
                    break;
                }
                default:
                {
                    System.out.println("Error: Invalid Input");
                    break;
                }
            }
        }
    }
}