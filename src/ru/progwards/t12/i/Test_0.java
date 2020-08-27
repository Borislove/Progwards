package ru.progwards.t12.i;

import ru.progwards.t6.t6_3.Array;

import java.util.ArrayList;
import java.util.List;

public class Test_0 {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList();

        for (int i = 0; i < 15; i++) {
            list.add(i);
          //  list.add(list.get(i));
        }
        System.out.println("list = " + list);
    }
}
