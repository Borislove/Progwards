package ru.progwards.t7.t7_2;

// ~ NOT = битовое отрицание
public class BitOperationNOT {

    public static void main(String[] args) {

        int x = 0b11111111_11110000_01010101_00000000;
        int result = ~x;
        System.out.print("Переменная         x = ");
        System.out.println(Integer.toBinaryString(x));
        System.out.print("Переменная    result = ");
        System.out.println(String.format("%32s", Integer.toBinaryString(result)).replace(' ', '0'));
    }
}
