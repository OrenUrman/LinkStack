package ru.OrenUrman.NewForms;


/**
 * Created by OrenUrman on 28.03.2017.
 * класс для квадрата
 */
public class SqureCalculate implements CalculateForms {
    private double base;

    public SqureCalculate(double base) {
        this.base = base;
    }

    @Override
    public double perimeterForm() {
        return (4.0 * base);
    }

    @Override
    public double areaForm() {
        return (base * base);
    }


    @Override
    public double[] calculateAll() {
        double[] array = {perimeterForm(), areaForm()};
        return array;
    }

    @Override
    public String toString() {
        return "SqureCalculate{" +
                "area=" + areaForm() +
                ", perimeter=" + perimeterForm() +
                '}';
    }

}
