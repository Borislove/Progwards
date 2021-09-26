package ru.progwards.t5.n5_1.Triangle_2;

public class Triangle {
    //свойства
    private double a, b, c;

    //конструктор
    public Triangle(double side_a, double side_b, double side_c) {
        this.a = side_a;
        this.b = side_b;
        this.c = side_c;
    }

    //проверка
    private static boolean isOk(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    //Статический метод как конструктор
    public static Triangle makeTriangle(double a, double b, double c) {
        if (isOk(a, b, c))
            return new Triangle(a, b, c);
        else
            return null;
    }

    public double perimeter() {
        return a + b + c;
    }

    public double area() {
        //считаем по форумуле Герона
        double hp = perimeter() / 2;
        return Math.sqrt(hp * (hp - a) * (hp - b) * (hp - c));
    }

    public static void main(String[] args) {

        Triangle triangle1 = Triangle.makeTriangle(2, 4, 5);

        if (triangle1 == null) {
            System.out.println("Треугольника с такими сторонами не существует!");
        } else {
            System.out.println("Периметр triangle = " + triangle1.perimeter());
            System.out.println("Площадь triangle = " + triangle1.area());
        }
    }
}
