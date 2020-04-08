package ru.progwards.t8.t8_1;

//Примеры хеш_кодов одинаковых объектов
public class HashCode {

    public static void main(String[] args) {

        System.out.println(new Object().hashCode());
        System.out.println("Хешкоды от new Object():");
        System.out.println(new Object().hashCode());
        System.out.println(new Object().hashCode());
        System.out.println(new Object().hashCode());
        System.out.println("Хешкоды от new Integer(5):");
        System.out.println(new Integer(5).hashCode());
        System.out.println(new Integer(5).hashCode());
        System.out.println(new Integer(5).hashCode());
        System.out.println("Хешкоды от new String(\"Строка\":)");
        System.out.println(new String("Строка").hashCode());
        System.out.println(new String("Строка").hashCode());
        System.out.println(new String("Строка").hashCode());
    }
}
