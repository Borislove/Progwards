package ru.progwards.t13.t13_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Удаление элементов через итератор
public class SetIteratorRemove {
    final static String TEXT = "на дворе трава на траве дрова не руби дрова на траве двора";

    public static void main(String[] args) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(TEXT.split(" ")));
        System.out.println(wordSet);

        Iterator<String> iter = wordSet.iterator();
        while (iter.hasNext())
            if(iter.next().contains("трав"))
                iter.remove();

        System.out.println(wordSet);
    }
}
