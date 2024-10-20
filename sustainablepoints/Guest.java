package sustainablepoints;
import java.util.Scanner;

public class Guest
{
    public String name;
    public int roomNum;
    public int guestsPerRoom;
    public int totalNights;
    public int newNights;
    public int totalLoyaltyPoints;
    
    
    /**
     * the constructor for the class
     * @param name the name under the reservation
     * @param num the room number
     * @param guestNum the guests per room
     * @param member loyalty member or not
     * @param nights total nights the customer have
     */
    public Guest(String name, int num, int guestNum, int nights, int loyaltyPoints)
    {
        this.name = name;
        this.roomNum = num;
        this.guestsPerRoom = guestNum;
        this.totalNights = nights;
        this.totalLoyaltyPoints = loyaltyPoints;
    }//end constructor

    /**
     * this method to calculate the total nights the cusomer have
     * @return
     */
    public int nightStayed()
    {
        //create a scanner object
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        
        //old nights
        System.out.println("Enter the number of nights stayed in the previous calendar year: ");
        int oldNights = input.nextInt();
        while (oldNights < 0 || oldNights > 365) {
            System.out.println("Invalid entry, try again: ");
            oldNights = input.nextInt();
        }

        //newNights
        System.out.println("\nEnter the nights for the current visit: ");
        newNights = input.nextInt();
        while (newNights < 0 || newNights > 365 || newNights + oldNights > 365) {
            System.out.println("Invalid entry, try again: ");
            newNights = input.nextInt();
        }

        totalNights = (oldNights + newNights);
        return totalNights;
    }
    
    /**
     * this method to determine the status of the tier
     * @param totalNights the customer has so far
     * @return the status or error message if not found
     */
    public String loyaltyTier(int totalNights)
    {
        if ((totalNights >= 0) && (totalNights < 10))
        {
            return "Base";
        }
        else if ((totalNights >= 10) && (totalNights < 25))
        {
            return "Silver Elite";
        }
        else if ((totalNights >= 25) && (totalNights < 50))
        {
            return "Gold Elite";
        }
        else if((totalNights >= 50) && (totalNights < 75))
        {
            return "Platinum Elite";
        }
        else if((totalNights >= 75) && (totalNights < 100))
        {
            return "Titanium Elite";
        }
        else if(totalNights >= 100)
        {
            return "Ambassador Elite";
        }
        return "invalid entry";
    }
}