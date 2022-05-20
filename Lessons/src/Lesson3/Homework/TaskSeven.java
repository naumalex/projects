package Lesson3.Homework;

import java.util.Random;

public class TaskSeven {
    public static void main(String[] avg) {
        int[] mas = new int[12];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(16) ;
            System.out.printf("%d ", mas[i]);
        }
        int max = mas[0];
        int lastIndexOfMaxElement = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] >= max) {
                lastIndexOfMaxElement = i;
                if (mas[i] > max)
                    max = mas[i];
            }
        }
        System.out.printf("%nLast entry index of max element: %d", lastIndexOfMaxElement );
    }
}
