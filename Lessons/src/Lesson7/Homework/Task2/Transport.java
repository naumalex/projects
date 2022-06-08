package Lesson7.Homework.Task2;

public class Transport {
    double horsepower;
    int maxSpeed;
    double mass;
    String brand;

    double getPowerInKw() {
        return horsepower * 0.74;
    }

    String asString() {
        return String.format("Brand: %s, horsepower: %.2f, power in KW: %.2f," +
                        " mass: %.2f, maximum speed: %d",
                brand, horsepower, getPowerInKw(), mass, maxSpeed);
    }


}

