package Lesson2;

public class TaskThree {
    public static void main (String[] args) {
        float totalDistance = 10;
        float distancePerDay = 10;
        for (int i = 1; i < 7; i++) {
            distancePerDay = distancePerDay + distancePerDay * 0.1f;
            totalDistance += distancePerDay;
        }
        System.out.printf("Total Distance is %.2f km", totalDistance);
    }
}
