package Lesson7.Homework.Task2;

public class Lorry extends LandTransport{
    double loadCapacity;
    String asString() {
        return String.format("%s, load capacity: %.2f",
                super.asString(), loadCapacity);
    }
    public void loadCargo(double masOfCargoInTons) {
        if (masOfCargoInTons <= loadCapacity) {
            System.out.println("Lorry has been loaded.");
        }
        else {
            System.out.println("You need a lorry with more load capacity.");
        }
    }

}
