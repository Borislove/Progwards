package ru.progwards.t12.t12_3;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Пример итератора с циклом for
public class IteratorForLinkedList {

    static final int ELEMENTS_COUNT = 5;

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedList.add(i + 1);
        }

            System.out.println("Результат с итератором:");
            for (Iterator<Integer> iterator = linkedList.iterator(); iterator.hasNext(); ) {
                Integer intObj = iterator.next();
                System.out.println("Значение элемента = " + intObj);
            }

            System.out.println("\nРезультат с for-each:");
            for (Integer intObj : linkedList) {
                System.out.println("Значение элемента = " + intObj);
            }
        }
    }

