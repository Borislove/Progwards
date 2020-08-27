package ru.progwards.t12.i;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*Напишите метод с сигнатурой public void iterator3(ListIterator<Integer> iterator)
 который заменяет значение каждого элемента, которое кратно 3 на значение его индекса.*/

public class Testing {

    public void iterator3(ListIterator<Integer> iterator) {
        while (iterator.hasNext()) {
            Integer n = iterator.next();
            if (n % 3 == 0) {
                iterator.set(iterator.nextIndex() - 1);
            }
        }
    }
}
