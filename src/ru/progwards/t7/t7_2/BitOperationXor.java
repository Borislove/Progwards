package ru.progwards.t7.t7_2;

//Битовые операции
// ^ Xor - битовое исключающее ИЛИ
public class BitOperationXor {

    public static void main(String[] args) {
        int x = 0b11111111_11110000_01010101_00000000;
        int y = 0b10101010_10101010_10101010_10101010;
        int result = x ^ y;
        System.out.print("Переменная         x = ");
        System.out.println(Integer.toBinaryString(x));
        System.out.print("Переменная         y = ");
        System.out.println(Integer.toBinaryString(y));
        System.out.print("Переменная    result = ");

        System.out.println(String.format("%32s", Integer.toBinaryString(result)).replace(' ', '0'));
    }
}


