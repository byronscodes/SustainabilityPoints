package sustainablepoints;

public class sustainablePoints {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Byron", 126, 1, false,  0);
        guest1.nightStayed();
        
        energyConsumption guest1Energy = new energyConsumption(1, 10);
        double guest1EnergyScore = guest1Energy.calcEnergyScore();
        
        waterConsumption guest1Water = new waterConsumption(1, 10);
        double guest1WaterScore = guest1Water.calcWaterScore();

        houseKeeping guest1HouseKeeping = new houseKeeping();
        int guest1houseKeepingScore = guest1HouseKeeping.wantAClean();
        
        loyaltyPointConverter guest1Converter = new loyaltyPointConverter(guest1.loyaltyTier(0));
        double guest1SustainScore = guest1Converter.calcSustainScore(guest1WaterScore, guest1EnergyScore, guest1houseKeepingScore);
        System.out.println(guest1Converter.convertToPoints(guest1SustainScore) + " loyalty points earned.");

    }
}
