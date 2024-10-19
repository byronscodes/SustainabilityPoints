package sustainablepoints;

public class loyaltyPointConverter {
    public int loyaltyPointsEarned;
    public String loyaltyTier;
    public double sustainabilityScore = 0;

    /**
     * the constructor for this class
     * @param loyaltyTier takes in the loyatly tier of the guest's account
     */
    public loyaltyPointConverter(String loyaltyTier) {
        this.loyaltyTier = loyaltyTier;
    }

    /**
     * calculates the sustainability score from the sum of all sustainable actions
     * @param waterScore
     * @param energyScore
     * @param foodScore
     * @return sustainability score
     */
    public double calcSustainScore(double waterScore, double energyScore, double foodScore) {
        sustainabilityScore = waterScore*0.35 + energyScore*0.2 + foodScore*0.45;
        return sustainabilityScore;
    }

    /**
     * calculates the total amount of loyalty points earned from the sustainability score
     * @param sustainabilityScore score of sustainable actions
     * @return total amount of loyalty points earned
     */
    public int convertToPoints(double sustainabilityScore) {
        if (sustainabilityScore > 90) {
            loyaltyPointsEarned = 100;
        }
        else if (sustainabilityScore > 75) {
            loyaltyPointsEarned = 50;
        }
        else if (sustainabilityScore > 50) {
            loyaltyPointsEarned = 25;
        }
        else {
            loyaltyPointsEarned = 0;
        }

        switch (loyaltyTier) {
            case "Base":
                return loyaltyPointsEarned;
            case "Silver Elite":
                return loyaltyPointsEarned *= 1.1;
            case "Gold Elite":
                return loyaltyPointsEarned *= 1.25;
            case "Plantinum Elite":
                return loyaltyPointsEarned *= 1.5;
            case "Titanium Elite":
                return loyaltyPointsEarned *= 1.75;
            case "Ambassador Elite":
                return loyaltyPointsEarned *= 1.75;
            default:
                return loyaltyPointsEarned;
        }
    }

    /**
     * adds the loyalty points earned to account
     * @param name name of the account that earned the points
     * @return true if loyalty points were added, false if not
     */
    public boolean addPointsToAccount(String name) {
        if (loyaltyPointsEarned == 0) {
            return false;
        }

        return true;
    }
}