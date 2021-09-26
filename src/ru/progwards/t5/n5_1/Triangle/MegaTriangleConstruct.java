package ru.progwards.t5.n5_1.Triangle;

public class MegaTriangleConstruct {

    double a, b,c;
    private static boolean isOk = false;

    MegaTriangleConstruct(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

        isOk = a + b > c && a + c > b && b + c > a;
    }

    public MegaTriangleConstruct(double base, double side){
        this(base, side, side);
    }

    public static void main(String[] args) {
         new MegaTriangleConstruct(20,20,20);
    }
}
