package ru.progwards.t5.n5_3.poly_1;

//окружность
public class Circle extends Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area(){
        return Math.PI*radius*radius;
    }
    @Override
    double perimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public String toString(){
        return "Окружность с радиусом " +radius;
    }
}
