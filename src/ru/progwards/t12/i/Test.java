package ru.progwards.t12.i;

import java.util.Collections;
import java.util.List;

/*Напишите метод с сигнатурой public List<Integer> listAction(List<Integer> list), который выполняет следующие действия:

удаляет минимальный элемент коллекции
по индексу 0 добавляет число равное количеству элементов
по индексу 2 добавляет максимальный элемент из list
возвращает list как результат метода*/
public class Test {

    public List<Integer> listAction(List<Integer> list) {

        list.remove(Collections.min(list));
        list.add(0, list.size());
        list.add(2, Collections.max(list));
        return list;
    }

    public static void main(String[] args) {

        Test test = new Test();

    }
}


