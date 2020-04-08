package ru.progwards.t8.t8_2.figure;

//квадрат
public class Square extends Segment {

    public Square(double a) {
        super(a);
    }

    @Override
    double area() {
        return a * a;
    }

    @Override
    double perimeter() {
        return 4 * a;
    }

    @Override
    public String toString() {
        return "Квадрат " + a + " x " + a;
    }
}
