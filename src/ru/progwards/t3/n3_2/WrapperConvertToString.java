package ru.progwards.t3.n3_2;

//Конвертация чисел в строки
public class WrapperConvertToString {

    public static void main(String[] args) {

        String str1 = Integer.toString(123456789);
        Integer intObj1 = 987654321;
        String str2 = intObj1.toString();

        System.out.println(str1);
        System.out.println(str2);
    }
}
