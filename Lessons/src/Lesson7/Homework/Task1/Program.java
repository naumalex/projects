package Lesson7.Homework.Task1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        final double MIN_TEMPERATURE = -273.15;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter temperature in Celsius:");
        BaseConverter bc = new BaseConverter();
        double value = MIN_TEMPERATURE - 1;
        do {
            if (sc.hasNextDouble()) {
                value = sc.nextDouble();
                if (value >= MIN_TEMPERATURE)
                    bc.valueToConvert = value;
                else
                    System.out.println("Temperature in Celsius cannot be less than -273.15 degrees");
            }
            else {
                System.out.println("Entered value is not valid");
                sc.next();
            }
        } while ((value < MIN_TEMPERATURE));

        TemperatureUnitKelvin kelvin = new TemperatureUnitKelvin();
        System.out.printf("Temperature in Kelvins is %5.2f%n",
                bc.convert(kelvin));
        TemperatureUnitFahrenheit fahrenheit = new TemperatureUnitFahrenheit();
        System.out.printf("Temperature in Fahrenheits is %5.2f%n",
                bc.convert(fahrenheit));
    }
}
