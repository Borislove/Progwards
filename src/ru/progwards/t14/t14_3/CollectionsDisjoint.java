package ru.progwards.t14.t14_3;

import java.util.Collections;
import java.util.List;

//Collections.disjoint
public class CollectionsDisjoint {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3,4,5);
        List<Integer> list2 = List.of(6,7,8,9,10);
        List<Integer> list3 = List.of(5,55,555);

        //пример добавления массива
        System.out.println(Collections.disjoint(list1,list2));
        System.out.println(Collections.disjoint(list1,list3));
        System.out.println(Collections.disjoint(list2,list3));
    }
}
