package ru.progwards.t5.n5_3;

//Класс делаем абстрактным
public abstract class Figure {
    //периметр фигуры
    abstract double perimeter(); //только декларация

    //площадь фигуры
    double area() {
        return 0d;
    }

    @Override
    public String toString() {
        return "Абстрактная фигура";
    }
}
