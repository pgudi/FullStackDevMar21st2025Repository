package com.gentech.oopsdemo;
abstract class GeometricFigure
{
    abstract void area();
}
class Rectangle extends GeometricFigure
{

    @Override
    void area() {
        int length, breadth;
        length=10;breadth=20;
        System.out.println("Area of Rectangle :"+(length * breadth));
    }
}
class Square extends GeometricFigure
{

    @Override
    void area() {
        int side=5;
        System.out.println("Area of Square :"+(side * side));
    }
}

class Circle extends GeometricFigure
{

    @Override
    void area() {
        double pi=3.14;
        double r=4.5;
        System.out.println("Area of Circle :"+(pi * r * r));
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        GeometricFigure figure=null;

        figure =new Rectangle();
        figure.area();

        figure =new Square();
        figure.area();

        figure =new Circle();
        figure.area();





    }
}
