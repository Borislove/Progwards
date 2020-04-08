package ru.progwards.t6.t6_2;

//Сравнение Integer через compareTo()
public class CompareToInteger {

    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 1;

        System.out.println(a.compareTo(b));   // 0

        a = 5;
        b = 1;

        System.out.println(a.compareTo(b));   // 1

        a = 1;
        b = 5;

        System.out.println(a.compareTo(b));   // -1
    }
}
