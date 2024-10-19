package sustainablepoints;
import java.util.Scanner;

public class foodManagement
{
    // String breakfast;
    // String lunch;
    // String dinner;
    int breakfastQuant;
    int lunchQuant;
    int dinnerQuant;

    

    public foodManagement(int firstQuant, int secondQuant, int thirdQuant)
    {
        this.breakfastQuant = firstQuant;
        this.lunchQuant = secondQuant;
        this.dinnerQuant = thirdQuant;
    }

    public int breakfastCalc()
    {
        //
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the waste for breakfast");
        int breakfastWaste = input.nextInt();

        return breakfastWaste;
    }

    public int breakfastpointsCalc(int breakfastWaste)
    {
        if ()
    }

    public int lunchCalculation()
    {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the waste for lunch");
        int lunchtWaste = input.nextInt();

        return lunchtWaste;
    }

    public int dinnerCalculation()
    {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the waste for dinner");
        int dinnerWaste = input.nextInt();

        return dinnerWaste;
    }
}