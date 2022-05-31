package Lesson6.Homework.TaskOne;

import java.util.Random;
import java.util.Scanner;
public class Computer {
    String processor;
    String ram;
    String hardDrive;
    int resourceInCycles;
    int CurrentCycleNumber;
    enum State {ON, OFF, BROKEN}
    State state;
    Computer() {
        this.processor = "Intel Core I5";
        this.ram = "12GB";
        this.hardDrive = "1TB";
        this.resourceInCycles = 1;
        this.state = State.OFF;
        this.CurrentCycleNumber = 0;
    }
    Computer(String processor, String ram, String hardDrive,
             int resourceInCycles) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.resourceInCycles = resourceInCycles;
        this.state = State.OFF;
        this.CurrentCycleNumber = 0;
    }
    public void DisplayConfiguration() {
        System.out.printf("Computer configuration%n Processor: %s, RAM: %s, Hard Drive: %s," +
                " Resource in Cycles: %d%n", processor, ram, hardDrive,
                resourceInCycles);
    }
    private boolean IsActionSuccessful() {
        Random r = new Random();
        int numberGenerated = r.nextInt(2);
        Scanner sc = new Scanner(System.in);
        int numberEntered = -1;
        do {
            System.out.println("Please enter 0 or 1");
            if (sc.hasNextInt()) {
                numberEntered = sc.nextInt();
            }
            else
                sc.next();
        } while ((numberEntered < 0) || (numberEntered > 1));
        if (numberGenerated == numberEntered)
            return true;
        else {
            System.out.println("Computer crashed");
            state = State.BROKEN;
            return false;
        }
    }

    private void IncrementCycle() {
        CurrentCycleNumber++;
        if (CurrentCycleNumber > resourceInCycles) {
            System.out.println("Computer crashed. Limit of working cycles exceeded.");
            state = State.BROKEN;
        }
    }
    public void TurnOn() {
        if (state == State.ON) {
            System.out.println("Computer has already been turned on");
            return;
        }
        if (state == State.BROKEN) {
            System.out.println("Computer is broken");
            return;
        }
        if (IsActionSuccessful()) {
            System.out.println("Computer is on");
            state = State.ON;
            IncrementCycle();
        }
    }
    public void TurnOff() {
        if (state == State.OFF) {
            System.out.println("Computer has already been turned off");
            return;
        }
        if (state == State.BROKEN) {
            System.out.println("Computer is broken");
            return;
        }
        if (IsActionSuccessful()) {
            System.out.println("Computer is off");
            state = State.OFF;
        }
    }
}
