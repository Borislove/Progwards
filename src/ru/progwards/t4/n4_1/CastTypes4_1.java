package ru.progwards.t4.n4_1;

//Пример 3.2: явное приведение double к float
public class CastTypes4_1 {

    public static void main(String[] args) {

        double doubleValue = 1E308;
        float floatValue = (float) doubleValue;

        System.out.println("doubleValue = " + doubleValue);
        System.out.println("floatValue = " + floatValue);

        System.out.println("\nЗначение floatValue бесконечность? " + Float.isInfinite(floatValue));
        System.out.println("floatValue + 555 = " + (floatValue + 555));
        System.out.println("doubleValue / floatValue = " + doubleValue / floatValue);
    }
}
