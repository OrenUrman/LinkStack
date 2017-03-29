package ru.OrenUrman.Forms;

/**
 * Created by OrenUrman on 28.03.2017.
 * класс для круга
 */
public class CircleCalculate implements Calculate {
    private static final double pi = Math.PI;
    private double area;
    private double perimeter;
    private final double raduis;

    public CircleCalculate(double radius) {
        this.raduis = radius;
    }

    @Override
    public void perimeterForm() {
        perimeter = 2 * pi * raduis;
    }

    @Override
    public void areaForm() {
        area = pi * Math.pow(raduis, 2.0);
    }

    @Override
    public void calculate() {
        perimeterForm();
        areaForm();
    }

    @Override
    public String toString() {
        return "CircleCalculate{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
