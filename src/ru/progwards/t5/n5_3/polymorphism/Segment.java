package ru.progwards.t5.n5_3.polymorphism;

public class Segment extends Figure{
    double a;

    Segment(double a){
        this.a = a;
    }

    @Override
    double perimeter(){
        return a;
    }
}
