package Lesson4;

import java.util.Random;

public class TaskThree {
    public static void main(String[] args) {
        int[][] mas = new int[5][5];
        Random r = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j =0; j < mas[i].length; j++) {
                mas[i][j] = r.nextInt(10);
                System.out.printf("%d ", mas[i][j]);
            }
            System.out.println();
        }
        int sum = 0;
        int maxInLine;
        for (int i = 0; i < mas.length; i++) {
            maxInLine = mas[i][0];
            for (int j = 1; j < mas[i].length; j++) {
                if (mas[i][j] > maxInLine) {
                    maxInLine = mas[i][j];
                }
            }
            sum += maxInLine;
            System.out.printf("%d ", maxInLine);
        }
        System.out.printf("Sum is %d", sum);
    }
}
