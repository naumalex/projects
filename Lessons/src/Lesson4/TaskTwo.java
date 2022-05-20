package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.printf("Please enter the array size:%n");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        int[][] mas = new int[n][n];
        Random r = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = r.nextInt(6);
                System.out.printf("%d ", mas[i][j]);
            }
            System.out.println();
        }

        int sumOne = 0;
        int sumTwo = 0;
        for (int i = 0; i < n; i++) {
            sumOne += mas[i][i];
            sumTwo += mas[n-1-i][i];
        }
        System.out.println();
        System.out.printf("Sum of first diagonal: %d%n", sumOne);
        System.out.printf("Sum of second diagonal: %d%n", sumTwo);
    }
}
