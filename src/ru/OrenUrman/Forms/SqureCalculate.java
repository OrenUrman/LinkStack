package ru.OrenUrman.Forms;

/**
 * Created by OrenUrman on 28.03.2017.
 * класс для квадрата
 */
public class SqureCalculate extends BaseSquare implements Calculate {

    public SqureCalculate(double base) {
        super(base);
    }

    @Override
    public void perimeterForm() {
        perimeter = 4.0 * base;
    }

    @Override
    public void areaForm() {
        area = base * base;
    }
    @Override
    public void calculate() {
        perimeterForm();
        areaForm();
    }

}
