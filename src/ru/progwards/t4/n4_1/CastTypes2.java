package ru.progwards.t4.n4_1;

//Пример 2.1: приведение к младшим типам
public class CastTypes2 {
    public static void main(String[] args) {
        long longValue = 25;

        //явное приведение типов
        int intValue = (int) longValue;
        short shortValue = (short) intValue;
        byte byteValue = (byte) shortValue;

        System.out.println("longValue = " + longValue);
        System.out.println("intValue = " + intValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("byteValue = " + byteValue);
    }
}
