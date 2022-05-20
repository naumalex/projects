package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;
        System.out.printf("Please enter the array size:%n");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            m = sc.nextInt();
        }
        int[][] mas = new int[n][m];
        Random r = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = r.nextInt(6);
                System.out.printf("%d ", mas[i][j]);
            }
            System.out.println();
        }
        int max = mas[0][0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] > max) {
                    max = mas[i][j];
                }
            }
        }
        System.out.printf("Max value: %d", max);
    }
}
