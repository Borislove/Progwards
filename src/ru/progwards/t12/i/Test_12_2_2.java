package ru.progwards.t12.i;

/*
/*Напишите метод, с сигнатурой public List<Integer> filter(List<Integer> list) который работает по следующему алгоритму

суммирует значения всех элементов списка
удаляет из списка элементы, значение которых больше суммы, деленной на 100 (целочисленное деление)
возвращает результирующий список*/

import java.util.ArrayList;
import java.util.List;

public class Test_12_2_2 {

    public static List<Integer> filter(List<Integer> list) {

        String str = "0";
        List<String> strList = new ArrayList();
        strList.add(str);

        List<Integer> intList = new ArrayList();

        int number = 0;

        for (int i = 0; i < strList.size(); i++) {
            number += Integer.parseInt(strList.get(i));
        }
        intList.add(number);


        for (int i = 0; i < list.size(); i++) {
            // System.out.println(i);
            str += i;
        }

        // list.remove(5);
        System.out.println(str);

        return intList;
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        //Test_12_2.filter(numbers);
        System.out.println(Test_12_2_2.filter(numbers));

        System.out.println(123 / 100);
        System.out.println(234 / 100);
        System.out.println(345 / 100);
        System.out.println((3 + 4 + 5) / 100);
    }

}
