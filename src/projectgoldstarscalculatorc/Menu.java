package projectgoldstarscalculatorc;
public class Menu
{
    public Menu()
    {
        menu();
    }
    
    //Prints the main menu to the screen
    private static void menu()
    {
        System.out.println("MENU\n"
                + "1: Add\n"
                + "2: Subtract\n"
                + "3: Multiply\n"
                + "4: Divide\n"
                + "5: Square Root\n"
                + "6: Cube Root\n"
                + "7: Exponents\n"
                + "8: Natural Log\n"
                + "9: Log Base 10\n"
                + "10: Trigonometry\n"
                + "11: Conversions\n"
                + "----------\n"
                + "AV: Average Calculator\n"
                + "MPG: Miles Per Gallon Calculator\n"
                + "P: Pythagorean Triple Calculator\n"
                + "Q: Quadratic Equation Solver\n"
                + "----------\n"
                + "A: About\n"
                + "D: Disclaimer\n"
                + "X: Exit");
    }
}