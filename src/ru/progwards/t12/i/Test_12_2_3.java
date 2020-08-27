package ru.progwards.t12.i;

import java.util.ArrayList;
import java.util.List;

/*
/*Напишите метод, с сигнатурой public List<Integer> filter(List<Integer> list) который работает по следующему алгоритму

суммирует значения всех элементов списка
удаляет из списка элементы, значение которых больше суммы, деленной на 100 (целочисленное деление)
возвращает результирующий список*/
public class Test_12_2_3 {

    public static List<Integer> filter(List<Integer> list) {

        String str = "";

        List<String> intList = new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            str += list.get(i);
        }

        //intList.add(Integer.parseInt(str));  //выше будет ошибка
        intList.add(str);

//        list.add(Integer.parseInt(str));

        return list;
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

        System.out.println(Test_12_2_3.filter(numbers));
    }

}
