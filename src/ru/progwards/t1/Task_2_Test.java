package ru.progwards.t1;

public class Task_2_Test {

    private static void Test1() {
        System.out.println("Изучать Java это интересно");
        System.out.println("Изучать Java это полезно");
        System.out.println("Изучать Java это не сложно");
    }

    private static void Test2() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Изучать Java это");
            if (i == 0) {
                System.out.println(" интересно");
            }
            if (i == 1) {
                System.out.println(" полезно");
            }
            if (i == 2) {
                System.out.println(" не сложно");
            }
        }
    }

    private static void Test3() {
        String str = "Изучать Java это";
        for (int i = 1; i < 4; i++) {
            switch (i) {
                case 1:
                    System.out.println(str + " интересно");
                    break;
                case 2:
                    System.out.println(str + " полезно");
                    break;
                case 3:
                    System.out.println(str + " не сложно");
                    break;
            }
        }
    }

    private static void Test4() {
        String str = "Изучать Java это интересно";
        System.out.println(str);
        System.out.println(str.replace("интересно", "полезно"));
        System.out.println(str.replace("интересно", "не сложно"));
    }

    // TODO: 06.07.2020 без комментариев)
    public static void main(String[] args) {

        int length = 5000000;

        long start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) { //50000000  - i
            Test1();
        }
        long end = System.currentTimeMillis();
        System.err.println("Продолжительность вычислений: " + (end - start) + " миллисекунд");
        long a1 = end - start;


        long start1 = System.currentTimeMillis();
        for (int i = 0; i < length; i++) { //50000000  - i
            Test2();
        }
        long end1 = System.currentTimeMillis();
        System.err.println("Продолжительность вычислений: " + (end1 - start1) + " миллисекунд");
        long a2 = end1 - start1;


        long start2 = System.currentTimeMillis();
        for (int i = 0; i < length; i++) { //50000000  - i
            Test3();
        }
        long end2 = System.currentTimeMillis();
        System.err.println("Продолжительность вычислений: " + (end2 - start2) + " миллисекунд");
        long a3 = end2 - start2;


        long start3 = System.currentTimeMillis();
        for (int i = 0; i < length; i++) { //50000000  - i
            Test4();
        }
        long end3 = System.currentTimeMillis();
        System.err.println("Продолжительность вычислений: " + (end3 - start3) + " миллисекунд");
        long a4 = end3 - start3;


        System.out.println("a1 " + a1);
        System.out.println("a2 " + a2);
        System.out.println("a3 " + a3);
        System.out.println("a4 " + a4);

        /*  a1 34288
            a2 54921
            a3 33354
            a4 34645*/

    }
}

