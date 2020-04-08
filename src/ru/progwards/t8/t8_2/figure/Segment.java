package ru.progwards.t8.t8_2.figure;

//Класс Segment(отрезок)
public class Segment extends Figure {
    double a; //хранится длина отрезка

    Segment(double a) { //конструктор
        this.a = a;
    }

    @Override
    double perimeter() {
        return a;
    }

    @Override
    public String toString() {
        return "Отрезок, длина " + a;
    }

    @Override
    public int compareTo(Figure o) {
        return 0;
    }
}
