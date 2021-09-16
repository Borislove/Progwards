package ru.progwards.t2;

public class Test {

    static int a = 10;

    public static void main(String[] args) {

        System.out.println(a);

        {
            a = 15;
        }

        System.out.println(a);
    }
}
