package Lesson3.Homework;

public class TaskOne {
    public static void main (String[] args) {
        int[] mas = new int[10];
        mas[0] = 2;
        for (int i = 1; i < 10; i++)
            mas[i] = mas[i-1] + 2;

        System.out.println("Show the array as a row");
        for (int i: mas) {
            System.out.printf("%d ", i);
        }
        System.out.println("");
        System.out.println("");

        System.out.println("Show the array as a column");
        for (int i: mas) {
            System.out.printf("%d%n", i);
        }


    }
}
