package ru.progwards.t14.t14_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Collections.replaceAll
public class CollectionsReplaceAll {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1, 1, 2, 3, 4, 5);

        System.out.println(list);

        //заменить все вхождения элемента на другой элемент
        Collections.replaceAll(list, 1, 5);
        System.out.println(list);
    }
}
