package ru.progwards.t6.t6_3;


import java.util.Arrays;

//Поиск элемента Arras.binarySearch()
//работает только после сортировки
//ищем элемент в массиве и выводим его значение
public class ArraysBinarySearch {

    public static void main(String[] args) {

        int[] arrayInt = {-7,5,0,58,-1};

        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Номер элемента: "+Arrays.binarySearch(arrayInt,5));
        Arrays.sort(arrayInt);

        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Номер элемента: "+Arrays.binarySearch(arrayInt,5));
    }
}
