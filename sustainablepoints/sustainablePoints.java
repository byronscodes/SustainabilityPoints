package sustainablepoints;
import java.util.Scanner;

public class sustainablePoints {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the name of the guest?");
        String name = scanner.nextLine();
        
        Guest guest1 = new Guest(name, 126, 1,  0, 1123);
        System.out.println("\nHello " + guest1.name + "!\n");
        guest1.nightStayed();
        int visitPoints = 0;

        for (int i = 1; i <= guest1.newNights; i++) {
            System.out.println("\n<-------------------DAY " + i + "------------------->\n");
            energyConsumption guest1Energy = new energyConsumption(1, 200);
            double guest1EnergyScore = guest1Energy.calcEnergyScore();
        
            waterConsumption guest1Water = new waterConsumption(1, 90);
            double guest1WaterScore = guest1Water.calcWaterScore();

            houseKeeping guest1HouseKeeping = new houseKeeping();
            double guest1houseKeepingScore = guest1HouseKeeping.wantAClean();
        
            loyaltyPointConverter guest1Converter = new loyaltyPointConverter(guest1.loyaltyTier(guest1.totalNights));
            double guest1SustainScore = guest1Converter.calcSustainScore(guest1WaterScore, guest1EnergyScore, guest1houseKeepingScore);
            guest1.totalLoyaltyPoints += guest1Converter.convertToPoints(guest1SustainScore);
            visitPoints += guest1Converter.convertToPoints(guest1SustainScore);
            System.out.println("\n" + guest1Converter.convertToPoints(guest1SustainScore) + " loyalty points earned!\n");
        }

        System.out.println("Total points in account: " + guest1.totalLoyaltyPoints);
        System.out.println("Points earned from trip: " + visitPoints);
    }
}
