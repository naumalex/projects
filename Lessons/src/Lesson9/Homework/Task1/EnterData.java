package Lesson9.Homework.Task1;

import java.util.Scanner;

public class EnterData {
    Scanner sc;
    EnterData() {
        sc = new Scanner(System.in);
    }
    String enterString() {
        do {
            if (sc.hasNextLine()) {
                return sc.nextLine();
            }
            else {
                System.out.println();
                sc.next();
            }
        } while (true);
    }

    double enterPositiveDouble() {
        double value = -1;
        do {
            if (sc.hasNextDouble()) {
                value = sc.nextDouble();
            }
            else {
                System.out.println("Invalid data entered");
                sc.next();
            }
        } while (value < 0);
        return value;
    }
    int enterPositiveInt(int maxAllowedValue) {
        int value = -1;
        do {
            if (sc.hasNextInt()) {
                value = sc.nextInt();
            }
            else {
                System.out.println("Invalid data entered");
                sc.next();
            }
        } while ((value < 0) || (value > maxAllowedValue));
        return value;
    }

}
