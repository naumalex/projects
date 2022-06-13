package Lesson9;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int n = 4;
        List<String> strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            strings.add(sc.nextLine());
        }
        Map<Integer, String> map = new HashMap<>();
        for (String item: strings) {
            map.put(item.length(), item);
            System.out.printf("Key: %d Value: %s%n",item.length(), map.get(item.length()));
        }
        System.out.println("Second method");
        for (Map.Entry<Integer, String> item: map.entrySet()) {
            System.out.printf("Key: %d Value: %s%n",item.getKey(), item.getValue());
        }
    }
}
