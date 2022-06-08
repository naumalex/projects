package Lesson8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int numberOfStrings = 4;
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[numberOfStrings];
        for (int i = 0; i < numberOfStrings; i++) {
            System.out.printf("Please enter the string %d%n", i);
            strings[i] = sc.nextLine();
        }
        int sumStringLengths = 0;
        for (String line: strings) {
            sumStringLengths += line.length();
        }
        int avgStringLength = sumStringLengths/numberOfStrings;
        System.out.printf("Average string length is %d%n", avgStringLength);
        StringBuilder result = new StringBuilder();
        for (String line: strings) {
            if (line.length() > avgStringLength) {
                result.append(line).append(" ").append(line.length())
                        .append('\n');
            }
        }
        System.out.println(result);
    }
}
