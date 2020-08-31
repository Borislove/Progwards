package ru.progwards.t14.t14_3;

//Collections.reverseOrder для List

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsReverseComparator {
    //использование обратного компаратора для списка
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,3,2,1,4,5);
        System.out.println(list);

        //сортировка с компаратором
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
