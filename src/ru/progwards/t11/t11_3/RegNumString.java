package ru.progwards.t11.t11_3;

import java.util.Arrays;

//Нормализация рег.номера, вер 2
public class RegNumString {

    private String regNum = "";

    public RegNumString(String str) {
        for (char c : str.toCharArray())
            if (Character.isDigit(c) || Character.isAlphabetic(c))  //цифра или элемент алфавита
                regNum += Character.toUpperCase(c);
    }

    @Override
    public String toString() {
        return regNum;
    }

    public static void main(String[] args) {
        String[] regNumArr = {"a 123 aK 577", " № в987Ва 599",
                "  Е555еЕ ### 55  ", " K 000 ek 0 0 ", " A 3 2 1 a a  9  5 5"};

        RegNumString[] regNums = new RegNumString[regNumArr.length];
        for (int i = 0; i < regNumArr.length; i++) {
            //превращаем строку в рег. номер
            regNums[i] = new RegNumString(regNumArr[i]);
        }
        System.out.println(Arrays.toString(regNums));
    }
}

