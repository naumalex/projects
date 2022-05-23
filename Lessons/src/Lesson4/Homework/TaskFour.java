package Lesson4.Homework;

import java.util.Random;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        System.out.println("Please enter the matrix size");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        Random r = new Random();
        int[][] mas = new int[n][n];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = r.nextInt(51);
                System.out.printf("%2d ", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i -1); j++) {
                if (mas[i][j]%2 == 0) {
                    sum += mas[i][j];
                }
            }
        }
        System.out.printf("Sum of elements above side diagonal: %d ", sum);
    }

}
