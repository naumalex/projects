package Lesson3.Homework;

import java.util.Random;

public class TaskEight {
    public static void main(String[] args) {
        int[] masOne = new int[10];
        int[] masTwo = new int[10];
        double[] masThree = new double[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            masOne[i] = r.nextInt(10);
            masTwo[i] = r.nextInt(10);
            masThree[i] = (double) masOne[i]/masTwo[i];
        }
        System.out.print("Array One: ");
        for (int i = 0; i < masOne.length; i++) {
            System.out.printf("%8d ", masOne[i]);
        }
        System.out.printf("%nArray Two: ");
        for (int i = 0; i < masTwo.length; i++) {
            System.out.printf("%8d ", masTwo[i]);
        }
        System.out.printf("%nArray Three: ");
        int NumberOfIntValues = 0;
        for (int i = 0; i < masThree.length; i++) {
            System.out.printf("%8.2f ", masThree[i]);
            double fraction;
            if (Double.isFinite(masThree[i]))  {
               fraction = masThree[i] - (int) masThree[i];
               if (fraction == 0)
                   NumberOfIntValues++;
            }
        }
        System.out.println();
        System.out.printf("Number of integer values: %d%n", NumberOfIntValues);
    }
}