package sustainablepoints;

public class loyaltyPointConverter {
    public int loyaltyPointsEarned;
    public String loyaltyTier;

    public loyaltyPointConverter(String loyaltyTier) {
        this.loyaltyTier = loyaltyTier;
    }

    public int convertToPoints(double waterConDifference, double energyConDifference, double foodConDifference) {
        return 3;
    }

    public boolean addPointsToAccount(String name) {
        switch (loyaltyTier) {
            case "Base":
                break;
            case "Silver":
                loyaltyPointsEarned *= 1.1;
                break;
            case "Gold":
                loyaltyPointsEarned *= 1.2;
                break;
        }
        return true;
    }
}