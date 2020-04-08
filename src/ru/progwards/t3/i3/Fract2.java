package ru.progwards.t3.i3;

//что я делал и зачем...
public class Fract2 {

    static void fractional1(){
        double num = Double.valueOf(1.53);
        System.out.println(num);
    }

    public static void main(String[] args) {

        fractional1();

        double d1 = new Double (1.53);
        System.out.println("d1 = "+d1);

        Double d2 = 1.53;
    }
}
