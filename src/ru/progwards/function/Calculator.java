package ru.progwards.function;

//Функция может возвращать значение
public class Calculator {
    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        int c1 = sum(5, 10);
        System.out.println("c1 = " + c1);
        int c2 = sum(1000, 1);
        System.out.println("c2 = " + c2);
        int c3 = sum(-5, 10);
        System.out.println("c3 = " + c3);
    }
}
