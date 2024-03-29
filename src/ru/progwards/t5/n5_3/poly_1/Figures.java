package ru.progwards.t5.n5_3.poly_1;

public class Figures {
    public static void printInfo(Figure figure) {
        System.out.println(figure);
        System.out.println("  периметр " + figure.perimeter());
        System.out.println("  площадь " + figure.area());
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
    }
}
