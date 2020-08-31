package ru.progwards.t13.t13_3;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

//TreeSet с компаратором
public class TreeSetWithCustomComparator {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(Math.abs(o1), Math.abs(o2));
            }
        });
        treeSet.addAll(List.of(3, 5, -1, -3, -5, -4, 4, -5, 5, 5, 1, 2, -2));

        System.out.println(treeSet);
    }
}

/*
 * В TreeSet, в отличии от других множеств, сравнение элементов на совпадение производится
 * при помощи компаратора, а не equals
 * */