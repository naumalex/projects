package Lesson3.Homework;

public class TaskTwo{
    public static void main (String[] args) {
        int[] mas = new int[50];
        mas[0] = 1;
        for (int i = 1; i < 50; i++)
            mas[i] = mas[i - 1] + 2;

        System.out.println("Show the array");
        for (int i : mas) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.println();

        System.out.println("Show the array in a reversed order");
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.printf("%d ", mas[i]);
        }

    }
}