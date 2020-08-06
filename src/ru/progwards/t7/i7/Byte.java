package ru.progwards.t7.i7;

/*Написать программный код, который возвращает младший (нулевой) бит переменной byte value. Ответ нужно поместить в переменную int result.

Таким образом, если младший бит параметра value равен 0, то result должен быть равен 0. Если младший бит равен 1, то и result должен быть равен 1.*/

//при реализации этой функции удобно использовать битовую операцию &
public class Byte {

    public static void func(byte value) {

        int result = 0;
        int test = Integer.parseInt(String.valueOf(value));
        //    System.out.println(test);
        if (test % 2 == 0) {
            result = 1;
            System.out.println(result);
        } else {
            result = 0;
            System.out.println(result);
        }
    }

    //решение...
    /*   int result ;
        int test = Integer.parseInt(String.valueOf(value));
        //    System.out.println(test);
        if (test % 2 == 0) {
            result = 0;
          //  System.out.println(result);
        } else {
            result = 1;
            //System.out.println(result);
        }*/

    public static void main(String[] args) {

        func((byte) 0b0101111);
    }
}
