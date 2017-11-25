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
        boolean continueRunning = true;
        new ConversionsMenu();
        while(continueRunning)
        {
            System.out.println(ProjectGoldStarsCalculatorC.theme);
            System.out.print("Please enter the number or letter of the option you want, or press M to see the Conversions Menu again: ");
            String conversionsMenuChoice = keyboard.next();
            conversionsMenuChoice = conversionsMenuChoice.toUpperCase();
            System.out.println(ProjectGoldStarsCalculatorC.theme);
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