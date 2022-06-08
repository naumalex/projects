package Lesson7.Homework.Task1;

import Lesson7.Homework.Task1.AbstractTemperatureUnit;

public class TemperatureUnitKelvin extends AbstractTemperatureUnit {
    public double Convert(double valueToConvert) {
        return valueToConvert + 273.15;
    }
}
