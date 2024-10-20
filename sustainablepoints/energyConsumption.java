package sustainablepoints;
import java.util.Scanner;

public class energyConsumption {
    public double totalEnergyCon;
    public double singleAvgEnergyCon;
    public double averageEnergyCon;
    public double energyScore;
    Scanner scanner = new Scanner(System.in);

    /**
     * the constructor for this class
     * @param guestsPerRoom guests per room
     * @param singleAvgEnergyCon the average energy consumption of a single guest
     */
    public energyConsumption(int guestsPerRoom, double singleAvgEnergyCon) {
        this.singleAvgEnergyCon = singleAvgEnergyCon;
        this.averageEnergyCon = singleAvgEnergyCon*guestsPerRoom;
    }

    /**
     * calculates the energy score 
     */
    public double calcEnergyScore() {
        System.out.println("What was the total watts of energy consumed for the room today?");
        totalEnergyCon = scanner.nextDouble();
        while (totalEnergyCon < 0) {
            System.out.println("Invalid entry, try again: ");
            totalEnergyCon = scanner.nextDouble();
        }
        energyScore = 1 - ((totalEnergyCon - averageEnergyCon*0.8) / (averageEnergyCon*1.2));
        if (energyScore > 1) {
            return energyScore = 1;
        }
        else if (energyScore < 0) {
            return energyScore = 0;
        }
        return energyScore;
    }
}