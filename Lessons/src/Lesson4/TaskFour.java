package Lesson4;

import java.util.Random;

public class TaskFour {
    public static void main (String[] args) {
        int[][] mas = new int[4][4];
        Random r = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j =0; j < mas[i].length; j++) {
                mas[i][j] = r.nextInt(10);
                System.out.printf("%d  ", mas[i][j]);
            }
            System.out.println();
        }
        int min;
        int sum = 0;
        for (int i = 1; i < mas.length; i = i + 2) {
            min = mas[i][0];
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] < min) {
                    min = mas[i][j];
                }
             }
            sum += min;
        }
        System.out.printf("Sum of min elements of even rows is %d", sum);
    }
}
