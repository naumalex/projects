package Lesson3.Lection;
import java.util.Arrays;
import java.util.Scanner;

public class TaskOne {
    public static void main (String[] args) {
        int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        int min = mas[0];
        for (int a: mas) {
            if (a < min)
                min = a;
        }
        System.out.printf ("Min value %d%n", min);
        int max = mas[0];
        for (int a: mas) {
            if (a > max)
                max = a;
        }
        System.out.printf ("Max value %d", max);
    }

}
