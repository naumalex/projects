package Lesson3.Lection;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        System.out.printf(" Please enter array size%n");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] mas = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Please enter element %d%n", i + 1);
            mas[i] = sc.nextInt();
        }
    }
}