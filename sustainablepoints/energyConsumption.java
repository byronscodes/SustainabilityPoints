package sustainablepoints;
import java.util.Scanner;

public class energyConsumption {
    public double totalEnergyCon;
    public double singleAvgEnergyCon;
    public double averageEnergyCon;
    public double energyConDifference;
    Scanner scanner = new Scanner(System.in);

    public energyConsumption(int guestsPerRoom, double singleAvgEnergyCon) {
        this.singleAvgEnergyCon = singleAvgEnergyCon;
        averageEnergyCon = singleAvgEnergyCon*guestsPerRoom;
        totalEnergyCon = scanner.nextDouble();
        energyConDifference = (totalEnergyCon - averageEnergyCon) / averageEnergyCon;
    }
}