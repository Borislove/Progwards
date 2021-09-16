package ru.progwards.task2.task2;

public class Task2 {

    // public static void printJava(String[] args) {
    public static void printJava() {
        String a = ("Хорошо идут дела");
        String b = ("Изучаю Java я!");
        String c = ("");
        System.out.println(a);
        System.out.println(b);
        System.out.print(a + b);
        System.out.print(b + a);
    }

    public static int subtraction(int x, int y) { //without arguments
        //int z = x - y;
        System.out.println("Вызвана функция subtraction() с параметрами x = " + x + "y= " + y);
        return x - y;
    }

    public static int addition(int x, int y) { //without arguments
        // int z = x + y;
        System.out.println("Вызвана функция addition() с параметрами x = " + x + "y= " + y);
        return x + y;
    }

    public static int multiplication(int x, int y) {//without arguments
        //int z = x * y;
        System.out.println("Вызвана функция multiplication() с параметрами x = " + x + "y= " + y);
        return x * y;
    }

  /*  public static int calculation() {
        int a = 34;
        int b = 55;
        System.out.print("a= " + a);
        System.out.print("b= " + b);
        int c = a + b;
        return c;
        System.out.println("a+b= " + (a + b));
        int c = a - b;
        return c;
        System.out.println("a-b= " + (a - b));
        int c = a * b;
        System.out.println("a*b= " + (a * b));
        return c;
    }*/

    public static void main(String[] args) {
        /*Реализовать функцию public static void main(String[] args) в которой:
- вызвать функцию printJava()
- вызвать функцию substruction() c параметрами 45 и 12
- вызвать функцию substruction() c параметрами 23 и 55
- вызвать функцию addition() c параметрами 128 и 787
- вызвать функцию addition() c параметрами 528 и 387
- вызвать функцию multiplication() c параметрами 124 и 87
- вызвать функцию multiplication() c параметрами 1528 и 3*/
        printJava();
        subtraction(45, 12);
        subtraction(23, 55);
    }
}
