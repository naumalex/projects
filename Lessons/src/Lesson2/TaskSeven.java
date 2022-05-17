package Lesson2;

public class TaskSeven {
    public static void main (String[] args) {
        System.out.printf("%-10s%s%-10s%n", "cm", "|", "inch");
        System.out.printf("--------------------%n");
        double convertedValue;
        for ( int i = 1; i <= 20; i++) {
            convertedValue = 2.54 * i;
            System.out.printf("%-10d%s%-10.2f%n", i, "|", convertedValue);
        }
    }
}
