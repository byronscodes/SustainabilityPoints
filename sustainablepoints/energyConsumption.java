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
        this.totalEnergyCon = scanner.nextDouble();
        this.energyScore = 1 - ((totalEnergyCon - averageEnergyCon*0.8) / (averageEnergyCon*1.2));
    }
}