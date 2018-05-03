package projectgoldstarscalculatorc;
import java.util.Scanner;
public class Trigonometry
{
    public Trigonometry()
    {
        trigonometry();
    }
    
    private static void trigonometry()
    {
        Scanner keyboard = new Scanner(System.in);
        boolean continueRunning = true; //Tracks whether the trigonometry while loop should continue running
        new TrigonometryMenu();
        while(continueRunning)
        {
            System.out.println(ProjectGoldStarsCalculatorC.theme);
            //Prompt the user for input
            System.out.print("Please enter the number or letter of the option you want, or press M to see the Trigonometry Menu again: ");
            //Get the user's input, convert it to upper case, and save it in a String
            String trigonometryMenuChoice = keyboard.next().toUpperCase();
            System.out.println(ProjectGoldStarsCalculatorC.theme);
            //Process the user's input
            switch(trigonometryMenuChoice)
            {
                case "M":
                {
                    new TrigonometryMenu();
                    break;
                }
                case "1":
                {
                    new SineDegrees();
                    break;
                }
                case "2":
                {
                    new CosineDegrees();
                    break;
                }
                case "3":
                {
                    new TangentDegrees();
                    break;
                }
                case "4":
                {
                    new SineRadians();
                    break;
                }
                case "5":
                {
                    new CosineRadians();
                    break;
                }
                case "6":
                {
                    new TangentRadians();
                    break;
                }
                case "7":
                {
                    new DegreesToRadians();
                    break;
                }
                case "8":
                {
                    new RadiansToDegrees();
                    break;
                }
                case "X":
                {
                    continueRunning = false;
                    new Menu();
                    break;
                }
            }
        }
    }
}