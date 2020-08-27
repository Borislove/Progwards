package ru.progwards.t12.i;

import java.util.ArrayList;
import java.util.List;

// TODO: 21.08.2020 Сумма через билдер...
public class Test_12_2_1 {

/*Напишите метод, с сигнатурой public List<Integer> filter(List<Integer> list) который работает по следующему алгоритму

суммирует значения всех элементов списка
удаляет из списка элементы, значение которых больше суммы, деленной на 100 (целочисленное деление)
возвращает результирующий список*/

    public List<Integer> filter(List<Integer> list) {

        StringBuilder sum = new StringBuilder();

        List<Integer> sumList = new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            sum.append(list.get(i));
        }

        sumList.add(Integer.valueOf(sum.toString()));
        System.out.println(sum.toString());
        System.out.println(sum);

        return sumList;
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
        numbers.add(5);

        //Test_12_2.filter(numbers);
        System.out.println(Test_12_2.filter(numbers));
    }
}
