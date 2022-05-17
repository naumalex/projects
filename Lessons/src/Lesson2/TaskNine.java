package Lesson2;

public class TaskNine {
    public static void main (String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i%2 == 1)
                sum = sum + i;
        }
        System.out.printf ("Sum of odd numbers from 1 to 99 is %d", sum);
    }
}
