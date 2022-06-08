package Lesson7.Homework.Task2;

public class DrivingWithMaxSpeedForParticularTime {
    int maxSpeed;
    double timeInHours;
    boolean isDataValid;
    DrivingWithMaxSpeedForParticularTime(int maxSpeed, double timeInHours){
        if ((maxSpeed >= 0) && (timeInHours >= 0)) {
            this.maxSpeed = maxSpeed;
            this.timeInHours = timeInHours;
            isDataValid = true;
        }
        else
            isDataValid = false;
    }
    double getDistance() {
        if (isDataValid) {
            return maxSpeed * timeInHours;
        } else {
            System.out.println("Invalid data entered. Distance cannot calculated.");
            return 0;
        }
    }
    double getAmountOfFuelConsumed(double fuelConsumptionRate) {
        if ((isDataValid) && (fuelConsumptionRate > 0)) {
            return getDistance() / 100 * fuelConsumptionRate;
        } else {
            System.out.println("Invalid data entered. Fuel Consumption amount cannot be calculated");
            return 0;
        }
    }
    void displayDistanceAndAmountOfFuelConsumed(String brand, double fuelConsumptionRate) {

        if ((isDataValid) && (fuelConsumptionRate >= 0)) {
            System.out.printf("For time %.1f h, car %s moving with maximum " +
                            "speed %d km/h will pass %.1f km and consume %.1f liters of fuel%n",
                    timeInHours, brand, maxSpeed, getDistance(),
                    getAmountOfFuelConsumed(fuelConsumptionRate));
        }
        else
            System.out.println("Invalid data entered. Distance or Amount of fuel consumed cannot be calculated.");
    }
}
