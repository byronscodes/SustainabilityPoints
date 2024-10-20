package sustainablepoints;
import java.util.Scanner;

public class waterConsumption {
    public double totalWaterCon;
    public double singleAvgWaterCon;
    public double averageWaterCon;
    public double waterScore;
    Scanner scanner = new Scanner(System.in);

    /**
     * the constructor for this class
     * @param guestsPerRoom the number of guests in the room
     * @param singleAvgWaterCon the average water consumption of a single guest
     */
    public waterConsumption(int guestsPerRoom, double singleAvgWaterCon) {
        this.singleAvgWaterCon = singleAvgWaterCon;
        this.averageWaterCon = singleAvgWaterCon*guestsPerRoom;
    }

    /**
     * calculates the water score 
     * @return waterScore
     */
    public double calcWaterScore() {
        System.out.println("What was the total gallons of water consumed for the room today?");
        totalWaterCon = scanner.nextDouble();
        while (totalWaterCon < 0) {
            System.out.println("Invalid entry, try again: ");
            totalWaterCon = scanner.nextDouble();
        }
        waterScore = 1 - ((totalWaterCon - averageWaterCon*0.8) / (averageWaterCon*1.2));
        if (waterScore > 1) {
            return waterScore = 1;
        }
        else if (waterScore < 0) {
            return waterScore = 0;
        }
        return waterScore;
    }
}