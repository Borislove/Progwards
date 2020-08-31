package ru.progwards.t13.t13_3;

import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

//Пример subSet
public class TreeSetSubSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(Math.abs(o1), Math.abs(o2));
            }
        });
        treeSet.addAll(List.of(3, 5, -1, -3, -5, -4, 4, -5, 5, 5, 1, 2, -2));
        SortedSet<Integer> subSet = treeSet.subSet(2, 5);

        System.out.println(treeSet);
        System.out.println(subSet);
    }
}
