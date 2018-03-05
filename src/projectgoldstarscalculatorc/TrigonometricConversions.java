package projectgoldstarscalculatorc;
import java.util.Scanner;
public class TrigonometricConversions
{
    public TrigonometricConversions()
    {
        trigonometricConversions();
    }
    
    private static void trigonometricConversions()
    {
        Scanner keyboard = new Scanner(System.in);
        boolean continueRunning = true;
        displayConversionsMenu();
        while(continueRunning)
        {
            System.out.println(ProjectGoldStarsCalculatorC.theme);
            System.out.print("Please enter the number or letter of the option you want, or press M to see the Trigonometric Conversions Menu again: ");
            String conversionsMenuChoice = keyboard.next();
            conversionsMenuChoice = conversionsMenuChoice.toUpperCase();
            System.out.println(ProjectGoldStarsCalculatorC.theme);
            switch(conversionsMenuChoice)
            {
                case "M":
                {
                    displayConversionsMenu();
                    break;
                }
                case "1":
                {
                    new DegreesToRadians();
                    break;
                }
                case "2":
                {
                    new RadiansToDegrees();
                    break;
                }
                case "X":
                {
                    continueRunning = false;
                    new ConversionsMenu();
                    break;
                }
            }
        }
    }
    
    private static void displayConversionsMenu()
    {
        System.out.println("TRIGONOMETRIC CONVERSIONS MENU\n"
                + "1: Degrees to Radians\n"
                + "2: Radians to Degrees\n"
                + "X: Exit Trigonometric Conversions Menu");
    }
}