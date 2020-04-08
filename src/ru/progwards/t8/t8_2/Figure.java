package ru.progwards.t8.t8_2;

public abstract class Figure implements FigureInterface {

    @Override
    public int compareArea(Figure figure) {
        return Double.compare(this.area(), figure.area());
    }

    //периметр фигуры
    abstract double perimeter();

    //площадь фигуры
    double area() {
        return 0d;
    }
}

