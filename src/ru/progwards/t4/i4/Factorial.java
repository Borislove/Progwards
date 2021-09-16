package ru.progwards.t4.i4;

/*Напишите метод, вычисляющий факториал числа - n!. Сигнатура метода static long factorial(long n)
Напомним, что факториал n это произведение всех чисел от 1 до n и факториал 0 == 1*/

public class Factorial {

    //--------------------option 1------------------
    static long factorial(long n) {
        System.out.println("factorial");
        if (n == 0)
            return 1;
        if (n > 1) {
            n = n * factorial(--n);
        }
        //System.out.println(n);
        return n;
    }

    //---------------------option 2-----------------
    static long factorial1(long n) {
        System.out.println("factorial_1");
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    //--------------------option 3------------------
    static long factorial2(long n) {
        System.out.println("factorial_2");
        long result = 1L;
        for (int i = 1; i <= n; i++) {
            //   System.out.println(result);
            result *= i;
        }
        return result;
    }

    static long factorial3(long num) {
        System.out.println("factorial_3");
        return (num == 0) ? 1 : num * factorial(num - 1);
    }


    //----------------------------------------------------
    static long factorial4(long num) {

        System.out.println("factorial_4");

        long count = 1L;
        for (; num >= 1; num--)
            count = count * num;

        return count;
    }


    public static void main(String[] args) {

        //factorial(5); //120
        //  factorial(6);
        //System.out.println(factorial(n));
        // factorial(7);
        //  System.out.println(factorial(10));
        //  System.out.println(factorial2(6));

        //System.out.println(factorial3(5));

        //System.out.println(factorial(0));

        //System.out.println(factorial3(10)); //3628800

        /*System.out.println(factorial(5));      //120
        System.out.println("*************");
        System.out.println(factorial1(5));
        System.out.println("*************");
        System.out.println(factorial2(5));
        System.out.println("*************");
        System.out.println(factorial3(5));
        System.out.println("*************");*/
        System.out.println(factorial4(10));
    }
}

