package ru.progwards.t4.n4_2;


public class LogicalOperationOrder {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 5;

        boolean result1 = a++ == b && ++c == --d;

        System.out.println("result1 = " + result1);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        boolean result2 = a == b && ++c == --d;

        System.out.println("result2 = " + result2);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
