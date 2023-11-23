package com.teachmeskills.lesson7.task1;
/**Write a hierarchy of classes Shape, Triangle, Rectangle, Circle.
 * Implement a function to calculate the area for each type of shape and calculate the perimeter(using abstract class/methods).
 * Create an array of 5 different shapes.
 * Loop through the array and output information about each shape.
 * Display the sum of the perimeters of all the shapes in the array.*/
public class Runner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 6);
        Triangle triangle = new Triangle(5, 9, 17);
        Circle circle = new Circle(6);
        Triangle triangle2 = new Triangle(55, 32, 50);
        Circle circle2 = new Circle(71);

        Figure[] figure = new Figure[5];
        figure[0] = rectangle;
        figure[1] = triangle;
        figure[2] = circle;
        figure[3] = triangle2;
        figure[4] = circle2;

        for(Figure counter : figure){
            System.out.println("figure name: " + counter.name + ". figure area: " + counter.area + " figure perimeter: " + counter.perimeter);
        }

    }

}
