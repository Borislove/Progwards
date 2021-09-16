package ru.progwards.t4.i4;

//склеивание двух чисел
public class Gluing {

    //--------------------Решение-----1---------------------------  //Passed all tests!
    static int addAsStrings(int n1, int n2) {
        String str = ((n1) + "" + (n2));
        Integer ci = Integer.valueOf(str);
        return ci;
    }

    //--------------------Решение------2-------------------------- //Passed all tests!
    static int addAsStrings1(int n1, int n2) {

        String str2 = Integer.toString(n1);
        String str3 = Integer.toString(n2);

        //System.out.println(Integer.parseInt(str2 + "" + str3));
        return Integer.parseInt(str2 + "" + str3);
    }

    //--------------------Решение-------2сокр---------------------- //Passed all tests!
    static int addAsStrings2(int n1, int n2) {

        return Integer.parseInt((n1) + "" + (n2));
    }

    //--------------------Решение------3-------------------------- //Passed all tests!
    static int addAsStrings3(int n1, int n2) {

        //упаковал в класс обёртку
        Integer num1 = Integer.valueOf(n1);
        Integer num2 = Integer.valueOf(n2);

        //завел переменные и привел к строке
        String a = num1.toString();
        String b = num2.toString();

        String c = a + "" + b;

        Integer result = Integer.valueOf(c);
        return result;
    }

    //от 1 отличается тут parse
    //------------------Решение----4-------------------------------  //Passed all tests!
    static int addAsStrings4(int n1, int n2) {
        String str = (n1) + "" + (n2);
        Integer test = Integer.parseInt(str);
        //System.out.println(test);
        return test;
    }

    //От Бориса
    //---------------Решение---5-------------
    public static int addAsStrings5(int n1, int n2) {
        String s = "" + n1 + n2;
        return Integer.parseInt(s);
    }

    public static int addAsStrings6(int n1, int n2) {
        return Integer.parseInt(n1 + "" + n2);
    }

    public static void main(String[] args) {
        addAsStrings(2, 3);
        System.out.println(addAsStrings(2, 3));
        addAsStrings1(5, 5);
        System.out.println(addAsStrings2(4, 4));
        System.out.println(addAsStrings4(99, 100));

        System.out.println(addAsStrings2(2, 3));

        System.out.println(addAsStrings6(5, 5));
    }
}

