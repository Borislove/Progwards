package ru.progwards.t13.t13_1;

import java.util.Set;

//Пример Set.of для проверки на числа Фибоначчи
public class SetOfFibo {
    public static void main(String[] args) {
        Set<Integer> fiboSet1000 =
                Set.of(0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987); //нельзя передать 2 одинаковых значения

        System.out.println(fiboSet1000);

        for (int i = 5; i < 10; i++) {
            System.out.println(i + " " + (fiboSet1000.contains(i) ? "да" : "нет"));
        }
    }
}
