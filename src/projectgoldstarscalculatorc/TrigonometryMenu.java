package projectgoldstarscalculatorc;
public class TrigonometryMenu
{
    public TrigonometryMenu()
    {
        trigonometryMenu();
    }
    
    //Prints the Trigonometry Menu to the screen
    private static void trigonometryMenu()
    {
        System.out.println("TRIGONOMETRY MENU\n"
                + "1: Sine (Degrees)\n"
                + "2: Cosine (Degrees)\n"
                + "3: Tangent (Degrees)\n"
                + "4: Sine (Radians)\n"
                + "5: Cosine (Radians)\n"
                + "6: Tangent (Radians)\n"
                + "7: Convert Degrees to Radians\n"
                + "8: Convert Radians to Degrees\n"
                + "X: Exit Trigonometry Menu");
    }
}
