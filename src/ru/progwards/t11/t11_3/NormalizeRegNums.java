package ru.progwards.t11.t11_3;

import java.util.Arrays;

//Нормализация рег.номера
public class NormalizeRegNums {
    public static void main(String[] args) {
        String [] regNumArr = {"a 123 aK 577", " № в987Ва 599", "  Е555еЕ ### 55  ", " K 000 ek 0 0 ", " A 3 2 1 a a  9  5 5"};
        for (int i = 0; i <  regNumArr.length; i++) {
            regNumArr[i] = regNumArr[i].replace(" ", ""); //убираем пробелы
            regNumArr[i] = regNumArr[i].replace("№", "") ; //убираем №
            regNumArr[i] = regNumArr[i].toUpperCase(); //переводим в верхний регистр
        }
        System.out.println(Arrays.toString(regNumArr));
    }
}
