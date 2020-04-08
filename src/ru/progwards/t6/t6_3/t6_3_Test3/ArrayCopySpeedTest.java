package ru.progwards.t6.t6_3.t6_3_Test3;

import java.util.Arrays;
import java.util.Date;

//Тест быстродействия методов копирования
public class ArrayCopySpeedTest {

    public static void main(String[] args) {

        Integer[] intArray = new Integer[1000000];
        Integer[] newArray = new Integer[1000000];

        long stratTime = new Date().getTime();
        for (int i = 0; i < 10000; i++) {
            newArray = Arrays.copyOf(intArray, intArray.length);
        }
        System.out.println("Arrays.copyOf(): " + (new Date().getTime() - stratTime));
        stratTime = new Date().getTime();
        for (int i = 0; i < 10000; i++) {
            System.arraycopy(intArray, 0, newArray, 0, intArray.length);
        }
        System.out.println("System.arraycopy():" + (new Date().getTime() - stratTime));
    }
}

//Arrays.copyOf(): 60342
//System.arraycopy():4307
