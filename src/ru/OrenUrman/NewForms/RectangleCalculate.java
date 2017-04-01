package ru.OrenUrman.NewForms;

/**
 * Created by OrenUrman on 28.03.2017.
 * класс для прямоугольника
 */
public class RectangleCalculate implements CalculateForms {
    private double base;
    private double height;

    @Override
    public double perimeterForm() {
        return (2.0 * base + 2.0 * height);
    }

    @Override
    public double areaForm() {
        return (base * height);
    }

    public RectangleCalculate(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double[] calculateAll() {
        double[] array = {perimeterForm(), areaForm()};
        return array;
    }

    @Override
    public String toString() {
        return "RectangleCalculate{" +
                "area=" + areaForm() +
                ", perimeter=" + perimeterForm() +
                '}';
    }
}
