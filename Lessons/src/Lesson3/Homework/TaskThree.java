package Lesson3.Homework;

import java.util.Random;

public class TaskThree {
    public static void main(String[] args) {
        int[] mas = new int[15];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100);
        }
        int numberOfEvenNumbers = 0;
        for (int i: mas) {
            System.out.printf("%d ", i);
            if (i%2 == 0)
                numberOfEvenNumbers++;
        }
        System.out.println();
        System.out.printf("Number of even numbers: %d", numberOfEvenNumbers);
    }
}
