package ru.progwards.t8.t8_1;

public class Example2 {

    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 1;
        Integer c = a;

        System.out.println("[Рефлексивность: a.equals(a) всегда true] " + a.equals(a));
        System.out.println("[Симметричность: a.equals(b) <-> b.equals(a)] " + b.equals(a) + " " + b.equals(a));
        System.out.println("[Транзитивность: если a.equals(b) и b.equals(c), то a.equals(c)] " + a.equals(b) + " " + b.equals(c) + " " + a.equals(c));
        System.out.println("");
        System.out.println("Согласованность: многократный вызов a.equals(b) даёт всегда один и тот же результат, " + "\n" + " при условии постоянства объектов a и b");
        System.out.println("");
        System.out.println("[Сравнение с null: a.equals(null) всегда false] " + a.equals(null));
    }
}
