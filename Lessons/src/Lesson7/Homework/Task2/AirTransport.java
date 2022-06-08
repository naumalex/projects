package Lesson7.Homework.Task2;

public class AirTransport extends Transport {
    double wingspan;
    double minTakeOffDistance;
    String asString() {
        return String.format("%s, wing span: %.2f, minimum distance to take off: %.2f",
                super.asString(), wingspan, minTakeOffDistance);
    }
}
