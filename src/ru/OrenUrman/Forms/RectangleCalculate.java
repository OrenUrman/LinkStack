package ru.OrenUrman.Forms;

/**
 * Created by OrenUrman on 28.03.2017.
 * класс для прямоугольника
 */
public class RectangleCalculate extends BaseSquare implements Calculate {
    @Override
    public void perimeterForm() {
        perimeter = 2.0 * base + 2.0 * height;
    }

    @Override
    public void areaForm() {
        area = base * height;
    }

    public RectangleCalculate(double base, double height) {
        super(base, height);
    }
    @Override
    public void calculate() {
        perimeterForm();
        areaForm();
    }
}
