package Lesson3.Homework;

import java.util.Random;

public class TaskFour {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(20);
        }
        for (int i: mas) {
            System.out.printf("%2d ", i);
        }
        for (int i = 0; i < mas.length; i++) {
            if (i%2 ==1) {
                mas[i] = 0;
            }
        }
        System.out.println();
        for (int i: mas) {
            System.out.printf("%2d ", i);
        }
    }
}
