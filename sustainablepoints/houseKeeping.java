package sustainablepoints;
import java.util.Scanner;

public class houseKeeping {

    /**
     * the constructor for the class
     */
    public houseKeeping()
    {
        //intintually empty
    }

    /**
     * this method to check if the customer wants the room to be cleaned or not
     * @return true if wants
     */
    public boolean wantAClean()
    {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want your room to be cleaned?");

        String answer = input.nextLine();

        if(answer == "Yes")
        {
            return true;
        }
        return false;
    }
    
}