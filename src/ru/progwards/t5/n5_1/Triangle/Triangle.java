package ru.progwards.t5.n5_1.Triangle;

public class Triangle {
    //свойства
     double a, b, c;

    //конструктор
    public Triangle(double side_a, double side_b, double side_c) {
        a = side_a;
        b = side_b;
        c = side_c;
    }
    //методы
    public double perimeter() {
        return a + b + c;
    }
    public double area() {
        //считаем по форумуле Герона
        double hp = perimeter() / 2;
        return Math.sqrt(hp * (hp - a) * (hp - b) * (hp - c));
    }
}
