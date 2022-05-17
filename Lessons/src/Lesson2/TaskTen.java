package Lesson2;

public class TaskTen {
    public static void main (String[] args) {
        String lineToPaint = "";
        for (int i = 0; i < 4; i++) {
            lineToPaint += "* ";
            System.out.printf("%8s%n", lineToPaint);
        }
        System.out.printf("%n");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%8s%n", lineToPaint);
            lineToPaint = lineToPaint.substring(0, lineToPaint.length() - 2);
        }

    }

}
