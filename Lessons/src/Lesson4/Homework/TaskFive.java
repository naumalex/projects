package Lesson4.Homework;

import java.util.Random;
import java.util.Scanner;

public class TaskFive {
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
            for (int j = 0; j < mas[i].length; j++){
                mas[i][j] = r.nextInt(51);
                System.out.printf("%2d ", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int tmp;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < i; j++) {
                tmp = mas[i][j];
                mas[i][j] = mas[j][i];
                mas[j][i] = tmp;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%2d ", mas[i][j]);
            }
            System.out.println();
        }
    }
}