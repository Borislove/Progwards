package ru.progwards.t5.n5_3.poly_1;

//квадрат
public class Square extends Segment{
    Square(double a){
        super(a);   //вызов родителя т.е отрезок
    }
    @Override
    double area(){
        return a*a;
    }
    @Override
    double perimeter(){
        return 4*a;
    }
    @Override
    public String toString(){
        return "Квадрат "+a + " x "+a;
    }

    public static void main(String[] args) {
        System.out.println(new Square(10));
    }
}
