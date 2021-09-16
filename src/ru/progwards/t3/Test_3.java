package ru.progwards.t3;

import static java.lang.Double.parseDouble;

/*Используя классы-обертки реализуйте следующие методы*/


public class Test_3 {

    //double toDouble(String str) метод преобразует строку в число с плавающей точкой
    double toDouble(String str) {
        return Double.valueOf(str);
    }

    //int maxInt() метод возвращает максимальное значение int
    int maxInt() {
        return Integer.MAX_VALUE;
    }

    /*  int toInt(String str) метод преобразует строку в число типа int*/
    int toInt(String str) {
        return Integer.parseInt(str);
    }


    public static void main(String[] args) {

    }
}
