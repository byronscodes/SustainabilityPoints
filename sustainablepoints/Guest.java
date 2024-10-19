package sustainablepoints;

public class Guest
{
    public String name;
    public int roomNum;
    public int guestsPerRoom;
    public boolean loyaltyMember;
    
    
    /**
     * the constructor for the class
     * @param name the name under the reservation
     * @param num the room number
     * @param guestNum the guests per room
     * @param member loyalty member or not
     */
    public Guest(String name, int num, int guestNum, boolean member)
    {
        this.name = name;
        this.roomNum = num;
        this.guestsPerRoom = guestNum;
        this.loyaltyMember = member;
    }//end constructor

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