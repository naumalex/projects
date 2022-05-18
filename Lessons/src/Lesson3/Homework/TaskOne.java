package Lesson3.Homework;

public class TaskOne {
    public static void main (String[] args) {
        int[] mas = new int[11];
        for (int i = 0; i < 11; i++)
            mas[i] = 2 * i;

        System.out.println("Show the array as a row");
        for (int i: mas) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.println();

        System.out.println("Show the array as a column");
        for (int i: mas) {
            System.out.printf("%d%n", i);
        }


    }
}
