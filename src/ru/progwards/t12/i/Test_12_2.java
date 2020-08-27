package ru.progwards.t12.i;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

// TODO: 21.08.2020 Суммировать значения...а не сумму всех значений XX

/*Напишите метод, с сигнатурой public List<Integer> filter(List<Integer> list) который работает по следующему алгоритму

суммирует значения всех элементов списка
удаляет из списка элементы, значение которых больше суммы, деленной на 100 (целочисленное деление)
возвращает результирующий список*/
public class Test_12_2 {

    public static List<Integer> filter(List<Integer> list) {

        int sum = 0;

        List<Integer> sumList = new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            /*if (i != sum % 100) {
                list.remove(i);
            }*/
            sum += list.get(i);
        }
        sumList.add(sum);
        //  System.out.println(sum);
        //System.out.println(list);  //основной
        //System.out.println(sumList);

        return sumList;
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList();

        // 1+2,....+9 = 45
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
        //  numbers.add(1);
        //   numbers.add(101);
        System.out.println(filter(numbers));


        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; //78
        List<Integer> listArr = Arrays.stream(array).boxed().collect(Collectors.toList());
        System.out.println("arr" + filter(listArr));

        //считал сумму от 0 до 9
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            //System.out.println(i);
            sum += i;
        }
        System.out.println(sum);  //45

        System.out.println(12 / 100);
    }
}





/*double sum = m.stream()
    .mapToDouble(a -> a)
    .sum();

System.out.println(sum); */