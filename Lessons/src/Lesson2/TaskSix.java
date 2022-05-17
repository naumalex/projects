package Lesson2;
import java.util.Scanner;

public class TaskSix {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter A: %n");
        int a = in.nextInt();
        System.out.printf("Please enter B: %n");
        int b = in.nextInt();
        int multiplication = a * b;
        System.out.printf("A*B= %d", multiplication);
    }
}
