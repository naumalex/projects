package Lesson7.Homework.Task2;

public class Car extends LandTransport{
    String bodyType;
    int numberOfPassengers;
    String asString() {
        return String.format("%s, body type: %s, number of passengers: %d",
                super.asString(), bodyType, numberOfPassengers);
    }

    public void displayDistanceAndFuelAmountForDrivingWithMaxSpeed(double timeInHours) {
        DrivingWithMaxSpeedForParticularTime maxSpeedDriving =
                new DrivingWithMaxSpeedForParticularTime(maxSpeed, timeInHours);
        maxSpeedDriving.displayDistanceAndAmountOfFuelConsumed(brand, fuelConsumptionRate);
    }

    }



