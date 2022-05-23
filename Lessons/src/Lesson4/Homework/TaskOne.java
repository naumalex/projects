package Lesson4.Homework;

import java.util.Random;
import java.util.Scanner;

public class TaskOne {
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
                System.out.printf("%2d ",mas[i][j]);
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i][i]%2 == 0)
                sum += mas[i][i];
        }
        System.out.printf("Sum of even elements on the main diagonal: %d", sum);
    }
}
