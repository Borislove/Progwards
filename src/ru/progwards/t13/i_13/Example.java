package ru.progwards.t13.i_13;

import java.util.HashSet;
import java.util.Set;

//Реализуйте метод,с сигнатурой public Set<Integer> a2set(int[] a),
// который преобразует массив в множество
public class Example {
    //убрать повторы
    public static Set<Integer> a2set(int[] a) {

        Set<Integer> integerSet = new HashSet<>();

        for (Integer i : a) {
            integerSet.add(i);
        }
//     System.out.println(integerSet);
        return integerSet;
    }

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 1, 1, 1};
        Example.a2set(num);
    }
}
