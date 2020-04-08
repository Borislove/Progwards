package ru.progwards.t8.t8_2.figure;

//Класс Rectangle - прямоугольник
public final class Rectangle extends Square {
    double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    @Override
    double area() {
        return a * b;
    }

    @Override
    double perimeter() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return "Прямоугольник " + a + " x " + b;
    }
}
