package ru.progwards.t12.t12_1;

import java.util.ArrayList;

//Объявление без указания типа объекта
public class ArrayListDeclaration1 {
    public static void main(String[] args) {

        //массив object
        ArrayList arrayList = new ArrayList();

        arrayList.add(1); // автоупаковка   Integer
        arrayList.add(1.0); // автоупаковка  Double
        arrayList.add(true); // автоупаковка
        arrayList.add(new Object());
        arrayList.add(new ArrayList());

        //ограничение на тип
        ArrayList<Integer> arrayList1 = new ArrayList<>(); //в качестве generic обобщения
        arrayList1.add(1); // автоупаковка   Integer

        //ошибки
      /*  arrayList1.add(1.0); // автоупаковка  Double
        arrayList1.add(true); // автоупаковка
        arrayList1.add(new Object());
        arrayList1.add(new ArrayList());*/
    }
}
