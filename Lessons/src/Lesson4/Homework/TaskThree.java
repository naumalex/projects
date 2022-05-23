package Lesson4.Homework;

import java.util.Random;
import java.util.Scanner;

public class TaskThree {
    public static void main (String[] args) {
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
        int multiplicationOfMainDiagonal = 1;
        int multiplicationOfOtherDiagonal = 1;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == j)
                    multiplicationOfMainDiagonal *= mas[i][j];
                if (i == (n - j -1))
                    multiplicationOfOtherDiagonal *= mas[i][j];
            }
        }
        if (multiplicationOfMainDiagonal > multiplicationOfOtherDiagonal)
            System.out.printf ("Multiplication of elements of main diagonal (%d) is more than " +
                    "multiplication of elements of side diagonal (%d)", multiplicationOfMainDiagonal,
                    multiplicationOfOtherDiagonal);
        if (multiplicationOfMainDiagonal < multiplicationOfOtherDiagonal)
            System.out.printf ("Multiplication of elements of side diagonal (%d) is more than " +
                    "multiplication of elements of main diagonal", multiplicationOfOtherDiagonal,
                    multiplicationOfMainDiagonal);
        if (multiplicationOfMainDiagonal == multiplicationOfOtherDiagonal)
            System.out.printf ("Multiplication of elements of main diagonal (%d) is equal to " +
                            "multiplication of elements of side diagonal (%d)", multiplicationOfMainDiagonal,
                    multiplicationOfOtherDiagonal);
    }
}
