package projectgoldstarscalculatorc;
import java.util.Scanner;
public class Conversions
{
    public Conversions()
    {
        conversions();
    }
    
    private static void conversions()
    {
        Scanner keyboard = new Scanner(System.in);
        boolean continueRunning = true; //Tracks whether the conversions while loop should continue running
        new ConversionsMenu();
        while(continueRunning)
        {
            System.out.println(ProjectGoldStarsCalculatorC.theme);
            //Prompt the user for input
            System.out.print("Please enter the number or letter of the option you want, or press M to see the Conversions Menu again: ");
            //Get the user's input, convert it to upper case, and save it in a String
            String conversionsMenuChoice = keyboard.next().toUpperCase();
            System.out.println(ProjectGoldStarsCalculatorC.theme);
            //Process the user's input
            switch(conversionsMenuChoice)
            {
                case "M":
                {
                    new ConversionsMenu();
                    break;
                }
                case "1":
                {
                    new TemperatureConversions();
                    break;
                }
                case "2":
                {
                    new TrigonometricConversions();
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