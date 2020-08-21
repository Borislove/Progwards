package ru.progwards.t12.t12_1;

import java.util.ArrayList;
import java.util.List;

//Добавление элемента
public class ArrayListAdd {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList();
        //метод интерфейся Collection
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        //метод интерфейса List

        arrayList.add(0,5);

        for(Integer i : arrayList){
            System.out.println(i);
        }
    }
}
