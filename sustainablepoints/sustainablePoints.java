package sustainablepoints;
import java.util.Scanner;

public class sustainablePoints {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhat is the name of the guest?");
        String name = scanner.nextLine();
        System.out.println("\nHello " + name + "!\n");

        System.out.println("What is the total number of guests that will be staying in the room?");
        int guestNum = scanner.nextInt();

        Guest guest1 = new Guest(name, 126, guestNum,  0, 1123);
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
            int points = guest1Converter.convertToPoints(guest1SustainScore);
            guest1.totalLoyaltyPoints += points;
            visitPoints += points;
            System.out.printf("\nYour sustainability score for today is %.2f out of 100", guest1Converter.sustainabilityScore);
            if (points == 0) {
                System.out.println("\nNo points earned today.");
            }
            else {
                System.out.println("\n" + points + " loyalty points earned!");
            }
        }

        System.out.println("\n<-----------------STAY ENDED---------------->\n");
        System.out.println("Total points in account: " + guest1.totalLoyaltyPoints);
        System.out.println("Eco-points earned from trip: " + visitPoints + "\n");
    }
}
