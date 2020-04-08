package ru.progwards.t6.t6_1;

//Заполнение массива значениями + чтение
public class Array2 {

    static int[] simpleArray = new int[5];

    public static void main(String[] args) {
        for (int i = 0; i < simpleArray.length; i++) {
            simpleArray[i] = -1;
        }
        for (int value : simpleArray) { //для чтения
            System.out.println(value);
        }
    }
}
