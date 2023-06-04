package com.oops.demo4.interface_abs;
//g         b
abstract class Shape{
    private String color;
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    abstract public double getArea();

}

class Square extends Shape{
    public double l;

    public Square(String color, double l){
        super(color);
        this.l=l;
    }
    @Override
    public double getArea() {
        return l*l;
    }

}
class Triangle extends Shape{
    public double l;

    public Triangle(String color, double l){
        super(color);
        this.l=l;
    }
    @Override
    public double getArea() {
        return l*l;
    }
}
public class A_NeedOfAbClass {

    public static void main(String[] args) {
        Shape shape=new Square("red",3);
        shape.getColor();
    }
}
