package ru.progwards.t13.t13_2;

import java.util.HashSet;
import java.util.Set;

//Объединение множеств
public class UnionOfSets {

    public static HashSet meetOfSets(final Set set1, final Set set2) {
        HashSet result = new HashSet(set1);
        result.addAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> intSet1 = Set.of(1, 2, 3, 4, 5);
        Set<Integer> intSet2 = Set.of(3, 4, 5, 6, 7, 8, 9);

        Set<Integer> meetSet = meetOfSets(intSet1, intSet2);

        System.out.println(intSet1);
        System.out.println(intSet2);
        System.out.println(meetSet);
    }
}

