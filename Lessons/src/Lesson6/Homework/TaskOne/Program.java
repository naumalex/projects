package Lesson6.Homework.TaskOne;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Computer comp = new Computer();
        Scanner sc = new Scanner(System.in);
        int i = -1;
        do {
            System.out.printf("Please enter the command%n0 - Turn off the computer%n" +
                    "1 - Turn on the computer%n2 - Display information%n3 - Exit%n");
            if (sc.hasNextInt()) {
                i = sc.nextInt();
            }
            else
                sc.next();
            switch (i) {
                case 0:
                    comp.TurnOff();
                    break;
                case 1:
                    comp.TurnOn();
                    break;
                case 2:
                    comp.DisplayConfiguration();
                    break;
                case 3:
                    System.exit(0);
            }

        } while (!(i == 3));
    }

}
