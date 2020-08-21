package ru.progwards.t12.t12_1.figures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class NestedFigures {

    public List<Figure> list = new ArrayList<>();

    public Figure maxFigure() {
        return Collections.max(list);
    }

    public Figure minFigure() {
        return Collections.min(list);
    }

    // вложенные классы-фигуры
    public abstract static class Figure implements Comparable<Figure> {

        @Override
        public int compareTo(Figure figure) {
            return Double.compare(this.area(), figure.area());
        }

        //периметр фигуры
        abstract double perimeter();

        //площадь фигуры
        double area() {
            return 0d;
        }

        //Статические методы
        public void printInfo() {
            System.out.println(this);
            System.out.println("    периметр " + perimeter());
            System.out.println("    площадь " + area());
            System.out.println("");
        }
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

        // TODO: 07.08.2020 !!!
    /*    @Override
        public int compareTo(Figure o) {
            return 0;
        }*/
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

        @Override
        public int hashCode() {
            return Objects.hash(radius);
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

    public static void main(String[] args) {
        NestedFigures figures = new NestedFigures();
        figures.list.add(new Segment(5));
        figures.list.add(new Square(5));
        figures.list.add(new Rectangle(5, 11));
        figures.list.add(new Circle(5));
        figures.list.add(new Triangle(3, 4, 5));

        //  figures.list.remove(figures.maxFigure());  //возвращает не индекс а объект
        //   figures.list.remove(figures.minFigure());

        //Collections.sort(figures.list);
        figures.list.sort(null);
        if (!figures.list.isEmpty())
            figures.list.remove(0);
        if (!figures.list.isEmpty())
            figures.list.remove(figures.list.size() - 1);

        /*for (Figure figure : figures.list) {
            figure.printInfo();
        }*/

        for (int i = 0; i < figures.list.size(); i++) {
            figures.list.get(i).printInfo();
        }
    }
}
