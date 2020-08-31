package ru.progwards.t13.t13_3;

import java.util.TreeSet;

//Простой пример TreeSet с Integer
public class TreeSetSimple {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(4);

        System.out.println(treeSet);
    }
}
