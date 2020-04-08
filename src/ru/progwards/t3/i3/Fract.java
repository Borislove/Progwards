package ru.progwards.t3.i3;

public class Fract {
    static double fractional(double num) {

        int value = (int)num;
        Double d1 = num - value ;
        System.out.println(d1);
        return 0; //
    }


    public static void main(String[] args) {

        fractional(98.45);
        fractional (1.53);
    }
}

