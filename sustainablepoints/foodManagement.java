package sustainablepoints;
import java.util.Scanner;

/**
 * this class to handle food waste calculation and points for it
 */
public class foodManagement
{
    int breakfastQuant;
    int lunchQuant;
    int dinnerQuant;

    /**
     * the constructor for the class
     * @param firstQuant the quantity for the fist meal
     * @param secondQuant the quantity for the second meal
     * @param thirdQuant the quantity for the third meal
     */
    public foodManagement(int firstQuant, int secondQuant, int thirdQuant)
    {
        this.breakfastQuant = firstQuant;
        this.lunchQuant = secondQuant;
        this.dinnerQuant = thirdQuant;
    }

    /**
     * this method to read the user input about the waste for breakfast
     * @return the int(%) of waste
     */
    public int breakfastCalc()
    {
        //
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the waste for breakfast");
        int breakfastWaste = input.nextInt();

        return breakfastWaste;
    }

    /**
     * this method to calculate the points for the first meal
     * @param breakfastWaste the percentage of waste in breakfast
     * @return the points earned for breakfast
     */
    // public int breakfastpointsCalc(int breakfastWaste)
    // {
    //     if (breakfastWaste >= )
    // }

    /**
     * this method to read the user input about the waste for breakfast
     * @return the int(%) of waste
     */
    public int lunchCalculation()
    {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the waste for lunch");
        int lunchtWaste = input.nextInt();

        return lunchtWaste;
    }

    // public int lunchPointsCalc(int lunchtWaste)
    // {

    // }

    /**
     * this method to read the user input about the waste for breakfast
     * @return the int(%) of waste
     */
    public int dinnerCalculation()
    {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the waste for dinner");
        int dinnerWaste = input.nextInt();

        return dinnerWaste;
    }

    // public int dinnerPointsCalc(int dinnerWaste)
    // {
        
    // }
}