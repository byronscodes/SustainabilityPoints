package sustainablepoints;
import java.lang.Math;

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
     * @param housekeepingScore
     * @return sustainability score
     */
    public double calcSustainScore(double waterScore, double energyScore, double housekeepingScore) {
        sustainabilityScore = waterScore*30 + energyScore*20 + housekeepingScore*50;
        return sustainabilityScore;
    }

    /**
     * calculates the total amount of loyalty points earned from the sustainability score
     * @param sustainabilityScore score of sustainable actions
     * @return total amount of loyalty points earned
     */
    public int convertToPoints(double sustainabilityScore) {
        if (sustainabilityScore > 90) {
            loyaltyPointsEarned = 500;
        }
        else if (sustainabilityScore > 80) {
            loyaltyPointsEarned = 400;
        }
        else if (sustainabilityScore > 70) {
            loyaltyPointsEarned = 300;
        }
        else if (sustainabilityScore > 60) {
            loyaltyPointsEarned = 200;
        }
        else if (sustainabilityScore > 50) {
            loyaltyPointsEarned = 100;
        }
        else if (sustainabilityScore > 30) {
            loyaltyPointsEarned = 50;
        }
        else {
            loyaltyPointsEarned = 0;
        }

        switch (loyaltyTier) {
            case "Base":
                return loyaltyPointsEarned;
            case "Silver Elite":
                return (int) Math.round(loyaltyPointsEarned*1.1);
            case "Gold Elite":
                return (int) Math.round(loyaltyPointsEarned*1.25);
            case "Plantinum Elite":
                return (int) Math.round(loyaltyPointsEarned*1.5);
            case "Titanium Elite":
                return (int) Math.round(loyaltyPointsEarned*1.75);
            case "Ambassador Elite":
                return (int) Math.round(loyaltyPointsEarned*1.75);
            default:
                return loyaltyPointsEarned;
        }
    }
}