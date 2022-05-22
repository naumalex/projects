 package Lesson3.Homework;

import java.util.Random;
import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args){
        System.out.println("Please enter a positive number");
        Scanner sc = new Scanner(System.in);
        int arraySize = 0;
        if (sc.hasNextInt())
            arraySize = sc.nextInt();
        else
            System.out.println("Entered value is not valid");

        Random r = new Random();
        int[] mas = new int[arraySize];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt(16);
            System.out.print(mas[i] + " ");
        }
        int indexOfMiddleOfArray = 0;
        indexOfMiddleOfArray = (int)arraySize/2;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        for (int i = 0; i < indexOfMiddleOfArray; i++){
            firstHalfSum += mas[i];
            secondHalfSum += mas[indexOfMiddleOfArray + i];
        }
        if (!(arraySize%2 == 0)) {
            System.out.printf("%nTwo halves of the array are not equal. Middle element" +
                    " will be included to the first half sum");
            secondHalfSum += mas[mas.length - 1];
        }
        if (firstHalfSum > secondHalfSum)
            System.out.printf("%nSum of the first half of the array %d is more than " +
                    "the sum of the second half %d%n", firstHalfSum, secondHalfSum);
        if (firstHalfSum < secondHalfSum)
            System.out.printf("%nSum of the second half of the array %d is more than " +
                    "the sum of the second half %d%n", secondHalfSum, firstHalfSum);
        if (firstHalfSum == secondHalfSum)
            System.out.printf("%nSum of the first half of the array %d is equal to " +
                    "the sum of the second half %d%n", firstHalfSum, secondHalfSum);
    }
}
