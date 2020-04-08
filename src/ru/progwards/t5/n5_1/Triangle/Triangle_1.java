package ru.progwards.t5.n5_1.Triangle;

//Правильный вызов конструкторя с использованияем this:
public class Triangle_1 {

    private double a, b, c;
    public boolean isOk = false;

    public Triangle_1() {
        //  isOk = a + b > c && a + c > b && b && b + c > a; //долго в такой мелочи разбирался пока не нашел ошибку...
        isOk = (a + b > c) && (a + c > b) && (b + c > a);
        isOk = a + b > c;
        isOk = a + c > b;
        isOk = b + c > a;
    }

    public Triangle_1(double a, double b, double c) {
        this();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {

    }
}
