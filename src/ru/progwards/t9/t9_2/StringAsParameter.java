package ru.progwards.t9.t9_2;

//Строка как параметр
public class StringAsParameter {
    static void stringAsParam(String str) {
        str = "Строка изменена в методе stringAsParam";
        System.out.println(str);
    }

    public static void main(String[] args) {
        String str = "Строка проиницилиазирована в main";
        System.out.println(str);
        stringAsParam(str);
        System.out.println(str);
    }
}
