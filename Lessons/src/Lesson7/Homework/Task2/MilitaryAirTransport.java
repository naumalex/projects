package Lesson7.Homework.Task2;

public class MilitaryAirTransport extends AirTransport{
    boolean hasCatapultingSystem;
    int numberOfRockets;
    String asString() {
        return String.format("%s, catapulting system: %b, number of rockets: %d",
                super.asString(), hasCatapultingSystem, numberOfRockets);
    }
    public void shoot() {
        if (numberOfRockets > 0) {
            System.out.println("Rocket launched.");
            numberOfRockets--;
        }
        else
            System.out.println("Out of ammunition.");
    }
    public void catapult() {
        if (hasCatapultingSystem) {
            System.out.println("Pilot has been catapulted.");
        }
        else
            System.out.println("No catapulting system.");
    }
}
