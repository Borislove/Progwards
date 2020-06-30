package ru.progwards.t11.t11_3;

import java.util.Arrays;

//Получение массива из строки: split
public class StringSplit {
    public static void main(String[] args) {
        String regNums = "Слово1,Слово2,Слово3,Слово4,Слово5";
        String[] regNumArr = regNums.split(",");
        System.out.println("Длина массива: " + regNumArr.length);
        System.out.println(Arrays.toString(regNumArr));
    }
}
