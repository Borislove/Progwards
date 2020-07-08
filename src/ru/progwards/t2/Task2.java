package ru.progwards.t2;

public class Task2 {

    public static void printJava() {

        String a = "Хорошо идут дела";
        String b = "Изучаю Java я!";
        String c = " ";

        System.out.println(a);
        System.out.println(b);
        System.out.println(a + c + b);
        System.out.println(b + c + a);
    }

    public static int subtraction(int x, int y) {
        System.out.print("Вызвана функция subtraction() с параметрами");
        System.out.print(" x = " + x);
        System.out.print(",");
        System.out.println(" y = " + y);
        return x - y;
    }

    public static int addition(int x, int y) {
        System.out.print("Вызвана функция addition() с параметрами");
        System.out.print(" x = " + x);
        System.out.print(",");
        System.out.println(" y = " + y);
        return x + y;
    }

    public static int multiplication(int x, int y) {
        System.out.print("Вызвана функция multiplication() с параметрами");
        System.out.print(" x = " + x);
        System.out.print(",");
        System.out.println(" y = " + y);
        return x * y;
    }

    public static void calculation() {
        int a, b, c;
        a = 34;
        b = 55;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        c = addition(a, b);
        System.out.println("a + b = " + c);
        System.out.println("a - b = " + subtraction(a, b));
        System.out.println("a * b = " + multiplication(a, b));
    }


    public static void main(String[] args) {
        printJava();
        subtraction(45, 12);
        subtraction(23, 55);
        addition(128, 787);
        addition(528, 387);
        multiplication(124, 87);
        multiplication(1528, 3);
    }
}
