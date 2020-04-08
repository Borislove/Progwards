package ru.progwards.t8.t8_2.figure;

//Класс делаем абстрактным
public abstract class Figure implements Comparable<Figure>, FigureIm {

    @Override
    public int compareArea(Figure figure) {
        return Double.compare(this.area(), figure.area());
    }

    //периметр фигуры
    abstract double perimeter(); //только декларация

    //площадь фигуры
    double area() {
        return 0d;
    }
}

