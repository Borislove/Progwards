package ru.progwards.t5.n5_3;

//Треугольник
public class Triangle extends Segment {
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        //считаем площадь по формуле Герона
        double hP = perimeter() / 2;
        return Math.sqrt(hP * (hP - a) * (hP - b) * (hP - c));
    }

    @Override
    double perimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Треугольник со сторонами " + a + ", " + b + ", " + c;
    }
}
