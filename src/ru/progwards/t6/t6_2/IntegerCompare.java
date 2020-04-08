package ru.progwards.t6.t6_2;

//Сравнение Integer...
public class IntegerCompare {

    public static void main(String[] args) {

        Integer int1 = new Integer(5);
        Integer int2 = new Integer(5);

        System.out.println("int1 == int2 "+ (int1 == int2)); //false
        System.out.println(int1.equals(int2)); //true

        Integer a = 5;
        int b = 5;
        int d = 5;
        Integer c = 4;
        c++;

        System.out.println(a == b); //true
        System.out.println(a.equals(b)); //true

        System.out.println(a.equals(c)); //true

        // System.out.println(b.equals(b)); уже нельзя а и b  можно
    }
}
