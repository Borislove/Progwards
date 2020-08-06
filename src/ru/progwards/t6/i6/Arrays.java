package ru.progwards.t6.i6;

/*Реализуйте функцию, возвращающую максимальный по значению элемент массива.
Если в массиве 0 элементов, вернуть 0. Сигнатура функции
public int arrayMax(int[] a)
Подсказка - для быстрой реализации удобно использовать функцию Arrays.sort()*/

public class Arrays {

    private static int[] a = {1, 2, 3, 0, -10, -99999, -3123, 4424};

    public int arrayMax(int[] a) {  //Passed all tests!

        if (a.length == 0) {
            return 0;
        }
        java.util.Arrays.sort(a);
        int max = a[a.length - 1];

        //--------тут не проходит тест
        /*if(a.length == 0){
            return 0;
        }*/
        return max;
    }

    public static void main(String[] args) {

    }
}
