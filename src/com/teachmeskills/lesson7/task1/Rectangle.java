package com.teachmeskills.lesson7.task1;

public class Rectangle extends Figure {

    double height;
    double base;
    public Rectangle(double height, double base) {
        this.height = height;
        this.base = base;
        name = "Rectangle";
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea(){
        double area;
        area = height * base;
        return area;
    }

    public double calculatePerimeter(){
        double perimeter;
        perimeter = (height * base) * 2;
        return perimeter;
    }

}
