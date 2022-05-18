package Lesson3.Homework;

import java.util.Random;

public class TaskSix {
    public static void main(String[] args) {
        int[] mas = new int[4];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
        }
        for (int i: mas) {
            System.out.printf("%d ", i);
        }
        boolean isSequenceStrictlyMonotonicIncreasing = true;
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i + 1] <= mas[i]) {
                isSequenceStrictlyMonotonicIncreasing = false;
                break;
            }
        }
        System.out.println();
        if (isSequenceStrictlyMonotonicIncreasing)
                System.out.println("The sequence is strictly monotonic increasing");
        else
            System.out.println("The sequence is not strictly monotonic increasing");
    }
}
