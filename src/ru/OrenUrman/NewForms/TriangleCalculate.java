package ru.OrenUrman.NewForms;


/**
 * Created by OrenUrman on 28.03.2017.
 * класс для треугольника
 */
public class TriangleCalculate implements CalculateForms {
    private  double firstSide;
    private  double secondSide;
    private  double thirdSide;

    public TriangleCalculate(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;

    }

    @Override
    public double perimeterForm() {
        return (firstSide + secondSide + thirdSide);
    }

    @Override
    public double areaForm() {
        double p = (firstSide + secondSide + thirdSide)/2;
        double S = p*(p-firstSide)*(p-secondSide)*(p-thirdSide);
        return (Math.pow(S, 0.5));
    }

    @Override
    public double[] calculateAll() {
        double[] array = {perimeterForm(), areaForm()};
        return array;
    }
    @Override
    public String toString() {
        return "TriangleCalculate{" +
                "area=" + areaForm() +
                ", perimeter=" + perimeterForm() +
                '}';
    }
}
