package Lesson7.Homework.Task2;

public class Program {
    public static void main(String[] args) {
        Car c = new Car();
        c.maxSpeed = 200;
        c.brand = "Mercedes";
        c.fuelConsumptionRate = 10;
        c.displayDistanceAndFuelAmountForDrivingWithMaxSpeed(2.1);
        Lorry l = new Lorry();
        l.loadCapacity = 5;
        l.loadCargo(5.1);
        CivilAirTransport cAT = new CivilAirTransport();
        cAT.passengersCapacity = 40;
        cAT.seatPassengers(41);
        MilitaryAirTransport mAT = new MilitaryAirTransport();
        mAT.numberOfRockets = 5;
        mAT.shoot();
        mAT.hasCatapultingSystem = true;
        mAT.catapult();
    }
}
