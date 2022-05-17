package Lesson3.Homework;

import java.util.Random;

public class TaskFive {
    public static void main (String[] args) {
        int[] masOne = new int[5];
        int[] masTwo = new int[5];
        Random random = new Random();
        for (int i = 0; i < masOne.length; i++) {
            masOne[i] = random.nextInt(15);
        }
        for (int i = 0; i < masTwo.length; i++) {
            masTwo[i] = random.nextInt(15);
        }
        for (int i: masOne) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
        for (int i: masTwo) {
            System.out.printf("%2d ", i);
        }
        int sum = 0;
        double avgMasOne;
        for (int i: masOne) {
            sum += i;
        }
        avgMasOne = (double) sum/masOne.length;

        sum = 0;
        double avgMasTwo;
        for (int i: masTwo) {
            sum += i;
        }
        avgMasTwo = (double) sum/masTwo.length;

        System.out.printf("%nAverage value for array one: %2.2f%n", avgMasOne);
        System.out.printf("Average value for array two: %2.2f%n", avgMasTwo);
        if (avgMasOne > avgMasTwo)
            System.out.println("Average value for the array one is more than average " +
                    "value for the array two");
        else if (avgMasOne < avgMasTwo)
            System.out.println("Average value for the array two is more than average " +
                    "value for the array one");
        else
            System.out.println("Average value for the array two is equal to average " +
                    "value for the array one");

    }
}
