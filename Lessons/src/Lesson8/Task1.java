package Lesson8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int numberOfStrings = 4;
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[numberOfStrings];
        for (int i = 0; i < numberOfStrings; i++) {
            System.out.printf("Please enter the string %d%n", i);
            strings[i] = sc.nextLine();
        }
        String maxLengthString = strings[0];
        String minLengthString = strings[0];
        StringBuilder stringsAndTheirLengths = new StringBuilder("Res");
        StringBuilder result = new StringBuilder("Res");
        for (String line: strings) {
            if (line.length() > maxLengthString.length()) {
                maxLengthString = line;
            }
            if (line.length() < minLengthString.length()) {
                minLengthString = line;
            }
        }
        result.append(" Max is ").append(maxLengthString).append(": ").append(maxLengthString.length());
        System.out.println(result);

    }
}
