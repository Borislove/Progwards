package ru.progwards.t14.t14_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Collections.swap
public class CollectionsSwap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "без", "труда", "не", "выловишь", "и", "рыбку", "из", "пруда"        );

        System.out.println(list);

        //рокировка двух элементов в списке
        Collections.swap(list,1,7);
        System.out.println(list);
        Collections.swap(list,list.indexOf("труда"), list.indexOf("пруда"));
        System.out.println(list);
    }
}
