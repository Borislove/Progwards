package ru.progwards.t5.n5_3.Inheritance;

//отрезок
public class Segment extends Figure {
    double a;

    Segment(double a) {
        this.a = a;
    }

    @Override
    double perimeter() {
        return a;
    }
    @Override
    public String toString(){
        return "Отрезок, длина "+a;
    }
}