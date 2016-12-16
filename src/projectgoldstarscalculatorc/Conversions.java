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
        displayConversionsMenu();
        while(continueRunning)
        {
            System.out.print("Please enter the number or letter of the option you want, or press M to see the Conversions Menu again: ");
            String conversionsMenuChoice = keyboard.next();
            conversionsMenuChoice = conversionsMenuChoice.toUpperCase();
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
                case "3":
                {
                    new CelsiusToFahrenheit();
                    break;
                }
                case "4":
                {
                    new FahrenheitToCelsius();
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
    
    private static void displayConversionsMenu()
    {
        System.out.println("CONVERSIONS MENU\n"
                + "1: Degrees to Radians\n"
                + "2: Radians to Degrees\n"
                + "3: Celsius to Fahrenheit\n"
                + "4: Fahrenheit to Celsius\n"
                + "X: Exit Trigonometry Menu");
    }
}