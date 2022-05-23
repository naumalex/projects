package Lesson3.Homework;

import java.util.Random;
import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        System.out.println("Please enter an integer number that more than 3");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n <= 3) {
                System.out.println("Entered value is less or equal 3");
                System.exit(0);
            }
        } else
            System.out.println("Invalid value entered");
        int[] mas = new int[n];
        Random r = new Random();
        int numberOfEvenElements = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt(n + 1);
            System.out.print(mas[i] + " ");
            if (mas[i] % 2 == 0)
                numberOfEvenElements++;
        }
        int[] masOfEvenElements = new int[numberOfEvenElements];
        int j = 0;
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                masOfEvenElements[j] = mas[i];
                System.out.print(masOfEvenElements[j] + " ");
                j++;
            }
        }
    }
}
