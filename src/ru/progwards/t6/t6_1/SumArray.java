package ru.progwards.t6.t6_1;

//Напишите функцию, суммирующие значения элементов одномерного массива, содержащего целые числа. Сигнатура:
//
//public int sumArrayItems(int[] a)

// TODO: 28.12.2019  пока не забыл , int[] array  - java
                                  //   int array []  - взято с СИ
public class SumArray {

    public static int[] a = {14, 25, 36, -48, 105, -76};  //сумма должна быть 56

    public static int sumArrayItems(int[]a){
        int sum = 0;
        for (int value: a){
          sum = value+sum;
        }
        return sum;
    }
        public static void main (String[]args){
        }
    }
