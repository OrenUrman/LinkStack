package ru.OrenUrman.Forms;

import java.util.Iterator;

/**
 * Created by OrenUrman on 28.03.2017.
 * суперкласс для прямоуголника и квадрата
 */
class BaseSquare {
    protected  double base;
    protected  double height;
    protected double area;
    protected double perimeter;

    public BaseSquare(double base) {
        this.base = base;
        this.height=0;
    }

    public BaseSquare(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName()+" {" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

}
