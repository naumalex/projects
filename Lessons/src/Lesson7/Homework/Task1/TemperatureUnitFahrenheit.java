package Lesson7.Homework.Task1;

import Lesson7.Homework.Task1.AbstractTemperatureUnit;

public class TemperatureUnitFahrenheit extends AbstractTemperatureUnit {
    public double Convert(double valueToConvert) {
        return 1.8 * valueToConvert + 32;
    }
}
