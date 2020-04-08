package ru.progwards.t8.t8_3;

//Пример со статическим методом
public class StaticMethodFromWrapper {

    public static void main(String[] args) {

        double a = 1.2345;
        double b = 5.4321;

        Double objA = 55.555;
        //  double maxAB = objA.max(a, b);
        //Правильное обращение к статическому методу
        double maxAB = Double.max(a, b);

        System.out.println("compareAB = " + maxAB);
    }
}
