package ru.progwards.t4.n4_1;

//Пример 3.1: явное приведение double к float
public class CastTypes4 {
    public static void main(String[] args) {
        double doubleValue = 333777555.999123005;
        float floatValue = (float) doubleValue;

        System.out.println("doubleValue = " + doubleValue);
        System.out.println("floatValue = " + floatValue);
    }
}
