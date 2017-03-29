package ru.OrenUrman.Forms;

/**
 * Created by OrenUrman on 28.03.2017.
 * класс для треугольника
 */
public class TriangleCalculate implements Calculate {
    private double area;
    private double perimeter;
    private  double firstSide;
    private  double secondSide;
    private  double thirdSide;

    public TriangleCalculate(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;

    }

    @Override
    public void perimeterForm() {
        perimeter = firstSide + secondSide + thirdSide;
    }

    @Override
    public void areaForm() {
        double p = (firstSide + secondSide + thirdSide)/2;
        double S = p*(p-firstSide)*(p-secondSide)*(p-thirdSide);
        area = Math.pow(S,0.5);
    }

    @Override
    public String toString() {
        return "TriangleCalculate{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
    @Override
    public void calculate() {
        perimeterForm();
        areaForm();
    }
}
