package Lesson2;

public class TaskFive {
    public static void main (String[] args) {
        int sum = 1;
        while (sum <= 256) {
            sum += 2 * sum;
        }
        System.out.printf("1 + 2 + 4 + 8 + ... + 256 = %d", sum);
    }

}
