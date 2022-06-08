package Lesson7.Homework.Task1;

import Lesson7.Homework.Task1.AbstractTemperatureUnit;

public class BaseConverter {

    public double valueToConvert;
    public double convert (AbstractTemperatureUnit unit) {
             return unit.Convert(valueToConvert);
    }
}
