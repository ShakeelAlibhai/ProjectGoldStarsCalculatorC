package projectgoldstarscalculatorc;
import java.util.Scanner;
public class TemperatureConversions
{
    public TemperatureConversions()
    {
        temperatureConversions();
    }
    
    private static void temperatureConversions()
    {
        Scanner keyboard = new Scanner(System.in);
        boolean continueRunning = true;
        displayConversionsMenu();
        while(continueRunning)
        {
            System.out.print("Please enter the number or letter of the option you want, or press M to see the Temperature Conversions Menu again: ");
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
                    new CelsiusToFahrenheit();
                    break;
                }
                case "2":
                {
                    new CelsiusToKelvin();
                    break;
                }
                case "3":
                {
                    new FahrenheitToCelsius();
                    break;
                }
                case "4":
                {
                    new FahrenheitToKelvin();
                    break;
                }
                case "5":
                {
                    new KelvinToCelsius();
                    break;
                }
                case "6":
                {
                    new KelvinToFahrenheit();
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
        System.out.println("TEMPERATURE CONVERSIONS MENU\n"
                + "1: Celsius to Fahrenheit\n"
                + "2: Celsius to Kelvin\n"
                + "3: Fahrenheit to Celsius\n"
                + "4: Fahrenheit to Kelvin\n"
                + "5: Kelvin to Celsius\n"
                + "6: Kelvin to Fahrenheit\n"
                + "X: Exit Temperature Conversions Menu");
    }
}