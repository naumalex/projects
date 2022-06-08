package Lesson7.Homework.Task2;

public class LandTransport extends Transport{
    int numberOfWheels;
    double fuelConsumptionRate;
    String asString() {
        return String.format("%s, number of wheels %d, fuel consuming rate: %.2f",
                super.asString(), numberOfWheels, fuelConsumptionRate);
    }

}
