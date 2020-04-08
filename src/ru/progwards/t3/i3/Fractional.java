package ru.progwards.t3.i3;

/*Напишите метод, который возвращает дробную часть числа. Сигнатура метода static double fractional(double num)

Например fractional(1.53) должен выдать 0.53*/


public class Fractional {

    static double fractional(double num) {
        return num - (int) num % (100);
    }

    public static void main(String[] args) {
        //fractional(1.53);
        System.out.println(fractional(1.53));
    }
}
