package ru.progwards.task2;

import java.util.Scanner;


/*Даны 2 целых числа (5 и 18). Найдите сумму всех чисел от первого до второго включительно с помощью цикла for.*/
public class Testing {


    public static void main(String[] args) {
        int result = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        int c = a;
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        for (; a <= b; a++) {
            result += a;
        }

        System.out.println("Сумма чисел от " + c + " до " + b + " равна: " + result);
    }
}
