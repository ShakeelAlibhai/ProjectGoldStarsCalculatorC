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
        boolean continueRunning = true;
        displayTrigonometryMenu();
        while(continueRunning)
        {
            System.out.print("Please enter the number or letter of the option you want, or press M to see the Trigonometry Menu again: ");
            String trigonometryMenuChoice = keyboard.next();
            trigonometryMenuChoice = trigonometryMenuChoice.toUpperCase();
            switch(trigonometryMenuChoice)
            {
                case "M":
                {
                    displayTrigonometryMenu();
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
                case "X":
                {
                    continueRunning = false;
                    new Menu();
                    break;
                }
            }
        }
    }
    
    private static void displayTrigonometryMenu()
    {
        System.out.println("TRIGONOMETRY MENU\n"
                + "1: Sine (Degrees)\n"
                + "2: Cosine (Degrees)\n"
                + "3: Tangent (Degrees)\n"
                + "4: Sine (Radians)\n"
                + "5: Cosine (Radians)\n"
                + "6: Tangent (Radians)\n"
                + "X: Exit Trigonometry Menu");
    }
}