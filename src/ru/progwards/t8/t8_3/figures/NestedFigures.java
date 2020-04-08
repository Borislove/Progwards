package ru.progwards.t8.t8_3.figures;

import java.util.Arrays;

public class NestedFigures {
    //вложенные классы-фигуры

    public abstract static class Figure implements Comparable<Figure>, FigureIm {
        @Override
        public int compareTo(Figure figure) {
            return Double.compare(this.area(), figure.area());
        }

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

    public interface FigureIm {
        int compareArea(Figure figure);
    }

    //Класс Segment(отрезок)
    public static class Segment extends Figure {
        double a; //хранится длина отрезка

        public Segment(double a) { //конструктор
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

    //квадрат
    public static class Square extends Segment {

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

    //Класс Rectangle - прямоугольник
    public static final class Rectangle extends Square {
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

    //Класс Circle(окружность)
    public static class Circle extends Figure {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }

        @Override
        double perimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public String toString() {
            return "Окружность с радиусом " + radius;
        }

        //Генерация equals и hashCode
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Circle circle = (Circle) o;
            return Double.compare(circle.radius, radius) == 0;
        }
    }

    //Треугольник
    public static class Triangle extends Segment {
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

    //Статические методы
    public static void printInfo(Figure figure) {
        System.out.println(figure);
        System.out.println("    периметр " + figure.perimeter());
        System.out.println("    площадь " + figure.area());
        System.out.println("");
    }


    public static void main(String[] args) {
        Segment segment = new Segment(5);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 11);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 4, 5);

        printInfo(segment);
        printInfo(square);
        printInfo(rectangle);
        printInfo(circle);
        printInfo(triangle);

        System.out.println("segment.compareArea(square)       = " + segment.compareArea(square));
        System.out.println("square.compareArea(square)        = " + square.compareArea(square));
        System.out.println("square.compareArea(rectangle)     = " + square.compareArea(rectangle));
        System.out.println("circle.compareArea(triangle)      = " + circle.compareArea(triangle));
        System.out.println("rectangle.compareArea(triangle)   = " + rectangle.compareArea(triangle));

        Figure[] figures = {segment, square, rectangle, circle, triangle};
        Arrays.sort(figures);
        for (Figure figure : figures) {
            printInfo(figure);
        }
    }
}
