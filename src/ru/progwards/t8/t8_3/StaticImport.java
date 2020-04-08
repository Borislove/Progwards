package ru.progwards.t8.t8_3;

import static java.lang.Math.sqrt;
//import static java.lang.Math.*;

public class StaticImport {

    public static void main(String[] args) {
        double result = Math.sqrt(25);
        System.out.println("result = " + result);

        double result1 = sqrt(25);
        System.out.println("result1 = " + result1);
    }
}


