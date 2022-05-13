package Lesson2;

public class TaskTwo {
    public static void main(String[] args) {
        int i = 10;
        int sumOfEvenNumbers = 0;
        while (i <= 56) {
            int remainderOfDevision = (i % 2);
            if (remainderOfDevision == 0) {
                sumOfEvenNumbers += i;
            }
            i++;
        }
        System.out.printf("Sum Of Even Numbers From 10 to 56 is %d",
                sumOfEvenNumbers);
    }
}
