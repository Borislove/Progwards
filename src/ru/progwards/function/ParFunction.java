package ru.progwards.function;

//Параметры функции
public class ParFunction {
    static void anything(String message) {
        System.out.println("Я - функция с параметром.");
        System.out.println("message = " + message);
    }

    public static void main(String[] args) {
        anything("Привет от Progwards!");
    }
}
