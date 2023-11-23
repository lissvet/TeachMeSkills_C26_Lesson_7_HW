package com.teachmeskills.lesson7.task1;

public class Triangle extends Figure {

    public double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        name = "Triangle";
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea(){
        double semiPerimeter;
        double area;
        semiPerimeter = (side1 + side2 + side3)/2;
        area = Math.sqrt(semiPerimeter*(semiPerimeter - side1) + (semiPerimeter - side2) + (semiPerimeter -side3));
        return area;
    }

    double calculatePerimeter(){
        double perimeter;
        perimeter = side1 + side2 + side3;
        return perimeter;
    }

}
