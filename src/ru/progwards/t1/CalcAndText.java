package ru.progwards.t1;

/*Создайте класс с именем CalcAndText в котором разместите функцию main,
которая выводит информацию на консоль, используя сложение чисел и строк, следующую информацию

12 + 34 + 48 = <результат вычислений>
33 + 44 + 55 = <результат вычислений>
98 + 99 + 97 = <результат вычислений>

*/
/*public class CalcAndText {
    public static void main(String[] args) {
        System.out.print("12 + 34 + 48 = ");
        System.out.println(12 + 34 + 48);
        System.out.print("33 + 44 + 55 = ");
        System.out.println(33 + 44 + 55);
        System.out.print("98 + 99 + 97 = ");
        System.out.println(98 + 99 + 97);
    }
}*/

/*public class CalcAndText {
    public static void main(String[] args) {

        int a = 12;
        int b = 34;
        int c = 48;

        System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));

        a = 33;
        b = 44;
        c = 55;

        System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));

        a = 98;
        b = 99;
        c = 97;

        System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
    }
}*/


/////////////////////////////////////////////////////////////////////////
/*
public class CalcAndText {

    public static void func() {


        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 1; i < 5; i++) {
            String str = a + " + " + b + " + " + c + " = ";

            switch (i) {
                case 1:
                    a = 12;
                    b = 34;
                    c = 48;
                    System.out.println(str + (a + b + c));
                    break;

                case 2:
                    a = 33;
                    b = 44;
                    c = 55;
                    System.out.println(str + (a + b + c));
                    break;

                case 3:
                    a = 98;
                    b = 99;
                    c = 97;
                    System.out.println(str + (a + b + c));
                    //System.out.println(str + (a + b + c));
                    break;

                default:
                    System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        func();
    }
}
*/
/////////////////////////////////////////////////////////////////////////
/*12 + 34 + 48 = <результат вычислений>
33 + 44 + 55 = <результат вычислений>
98 + 99 + 97 = <результат вычислений>*/

// TODO: 06.07.2020 что то не так... 
public class CalcAndText {

    //стеки чисел
    static int[] stackOneNumbers = {12, 34, 48};
    static int[] stackTwoNumbers = {33, 44, 55};
    static int[] stackTreeNumbers = {98, 99, 97};

/*    static int a = stackOneNumbers[0];
    static int b = stackOneNumbers[1];
    static int c = stackOneNumbers[2];*/

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        CalcAndText.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        CalcAndText.b = b;
    }

    public static int getC() {
        return c;
    }

    public static void setC(int c) {
        CalcAndText.c = c;
    }

    static int a = 0;
    static int b = 0;
    static int c = 0;

    public static void numbersArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            a = stackOneNumbers[0];
            b = stackOneNumbers[1];
            c = stackOneNumbers[2];
        }
    }


    //возвращает сумму
    public static int numbers(int a, int b, int c) {
        //numbersArr(stackOneNumbers);
        return a + b + c;
    }

    //выводит сумму
    public static void str() {
        System.out.print(a + " + " + b + " + " + c + " = ");
//        System.out.print(getA() + " + " + getB() + " + " + getC() + " = ");
        System.out.println(numbers(a, b, c));
    }

    public static void main(String[] args) {

/*        System.out.println(numbers(12, 34, 48));
        System.out.println(numbers(33, 44, 55));
        System.out.println(numbers(98, 99, 97));*/
        str();
    }
}