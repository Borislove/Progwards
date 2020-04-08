package ru.progwards.t4.i4;

/*Напишите метод, вычисляющий факториал числа - n!. Сигнатура метода static long factorial(long n)
Напомним, что факториал n это произведение всех чисел от 1 до n и факториал 0 == 1*/

public class Factorial {

    //--------------------option 1------------------
    static long factorial(long n) {
        if (n == 0)
            return 0;
        if (n > 1) {
            n = n * factorial(--n);
        }
        System.out.println(n);
        return n;
    }

    //---------------------option 2-----------------
    static long factorial1(long n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    //--------------------option 3------------------
    static long factorial2(long n) {
        long result = 1L;
        for (int i = 1; i <= n; i++) {
            //   System.out.println(result);
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        //factorial(5); //120
        //  factorial(6);
        //System.out.println(factorial(n));
        // factorial(7);
        //  System.out.println(factorial(10));
        System.out.println(factorial2(6));
    }
}

