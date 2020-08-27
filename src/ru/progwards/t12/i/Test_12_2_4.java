package ru.progwards.t12.i;

import java.util.ArrayList;
import java.util.List;

public class Test_12_2_4 {

/*    public static List<Integer> filter(List<Integer> list) {

        int sum = 0;
        for (Integer value : list)
            sum += value.intValue();
        sum /= 100;

        for (int i = list.size() - 1; i >= 0; i--)
            if (list.get(i).intValue() >= sum)
                list.remove(i);

        return list;
    }*/

   /* public static List<Integer> filter(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = list.get(i) + sum;

            // System.out.print(list.get(i));
        }
        //System.out.println("list.size()- "+list.size());
        for (int j = list.size() - 1; j > -1; j--) {
            if (list.get(j) >= (sum / 100)) {
                list.remove(j);
                //System.out.println(list.get(j));

            }
        }
        return list;
    }*/

    public static List<Integer> filter(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = list.get(i) + sum;
        }

        for (int j = list.size() - 1; j > -1; j--) {
            if (list.get(j) > (sum / 100)) {
                list.remove(j);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        System.out.println(Test_12_2_4.filter(numbers));
    }
}
