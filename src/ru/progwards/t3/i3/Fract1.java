package ru.progwards.t3.i3;

public class Fract1 {


    static double fractional(double num) {

        Integer value = new Integer((int) num);
        final Double d1 = num - value ;
        final Double d2 = d1;
        System.out.println(d2);
        return 0;
    }


    public static void main(String[] args) {

        fractional(98.45);
        fractional (1.53);
    }
}
