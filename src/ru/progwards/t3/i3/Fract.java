package ru.progwards.t3.i3;

public class Fract {
    static double fractional(double num) {

       /* int value = (int)num;
        Double d1 = num - value ;
        System.out.println(d1);
        return 0; //*/
        System.out.println(num%1);
       return num%1;
    }


    public static void main(String[] args) {

        fractional(98.45);
        fractional (1.53);

        fractional(10102.2456);

        System.out.println(5%8);

        double x = 5 / 2;
        System.out.println(x);
    }
}

