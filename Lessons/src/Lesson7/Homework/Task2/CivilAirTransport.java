package Lesson7.Homework.Task2;

public class CivilAirTransport extends AirTransport{
    int passengersCapacity;
    boolean hasBusinessClass;
    String asString() {
        return String.format("%s, number of passengers: %d, business class: %b",
                super.asString(), passengersCapacity, hasBusinessClass);
    }
    void seatPassengers(int numberOfPassengersToSeat) {
        if (numberOfPassengersToSeat <= passengersCapacity) {
            System.out.println("Passengers has been seated to the plane.");
        }
        else
            System.out.println("You need a plane with more seats.");
    }

}
