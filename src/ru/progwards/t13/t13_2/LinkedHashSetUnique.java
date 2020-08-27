package ru.progwards.t13.t13_2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//LinkedHashSet сохраняет порядок элементов
public class LinkedHashSetUnique {
    public static void main(String[] args) {
        Set<String> stringSet = new LinkedHashSet<>();
        for (int i = 0; i < 5; i++) {
            stringSet.add("добавим");
            stringSet.add("в");
            stringSet.add("цикле");
            stringSet.add("в");
            stringSet.add("множество");
            stringSet.add("слова");
            stringSet.add("но");
            stringSet.add("одинаковых");
            stringSet.add("не");
            stringSet.add("встретим");
            stringSet.add("даже");
            stringSet.add("два");
        }
        System.out.println(stringSet);
    }
}

