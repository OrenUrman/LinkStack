package ru.OrenUrman.NewForms;


/**
 * Created by OrenUrman on 28.03.2017.
 * класс для круга
 */
public class CircleCalculate implements CalculateForms {
    private static final double pi = Math.PI;
    private final double raduis;

    public CircleCalculate(double radius) {
        this.raduis = radius;
    }

    @Override
    public double perimeterForm() {
        return (2 * pi * raduis);
    }

    @Override
    public double areaForm() {
        return (pi * Math.pow(raduis, 2.0));
    }

    @Override
    public double[] calculateAll() {
        double[] array = {perimeterForm(), areaForm()};
        return array;
    }

    @Override
    public String toString() {
        return "CircleCalculate{" +
                "area=" + areaForm() +
                ", perimeter=" + perimeterForm() +
                '}';
    }
}
