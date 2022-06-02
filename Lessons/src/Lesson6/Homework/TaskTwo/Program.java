package Lesson6.Homework.TaskTwo;

import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) {
        Cat ct = new Cat();
        ct.animal_id = 1;
        System.out.printf("Animal id: %d%n", ct.animal_id);
        Dog dg = new Dog();
        dg.weight = new BigDecimal(21);
        System.out.printf("Dog weight: %d%n", dg.weight.intValue());

    }
}
