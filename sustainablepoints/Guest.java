package sustainablepoints;

public class Guest
{
    public String name;
    public int roomNum;
    public int guestsPerRoom;
    public boolean loyaltyMember;
    public int totalNights;
    
    
    /**
     * the constructor for the class
     * @param name the name under the reservation
     * @param num the room number
     * @param guestNum the guests per room
     * @param member loyalty member or not
     * @param nights total nights the customer have
     */
    public Guest(String name, int num, int guestNum, boolean member, int nights)
    {
        this.name = name;
        this.roomNum = num;
        this.guestsPerRoom = guestNum;
        this.loyaltyMember = member;
        this.totalNights = nights;
    }//end constructor

    /**
     * this method to determine the status of the tear
     * @param totalNights the customer has so far
     * @return the status or error message if not found
     */
    public String loyaltyTear(int totalNights)
    {
        if((totalNights >= 0) && (totalNights <= 10))
        {
            return "Silver Elite";
        }
        else if ((totalNights > 10) && (totalNights <= 25))
        {
            return "Gold Elite";
        }
        else if((totalNights > 25) && (totalNights <= 50))
        {
            return "Platinum Elite";
        }
        else if((totalNights > 50) && (totalNights <= 75))
        {
            return "Titanium Elite";
        }
        else if((totalNights > 75) && (totalNights <= 100))
        {
            return "Ambassador Elite";
        }
        return "invalid entry";
    }

    /**
     * this method to determine if the guest is loyal member or not
     * @return true if they are
     */
    public boolean isLoyaltyMember()
    {
        if(loyaltyMember)
        {
            return true;
        }
        return false;
    }

}