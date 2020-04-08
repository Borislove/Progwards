package ru.progwards.t6.t6_2;

public class StringCompare2 {

    public static void main(String[] args) {

        String str1 = "12345";
        String str2 = "1234";
        //System.out.println(str2.hashCode());
        str2 += "5";

        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2)); //true

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        //System.out.println(str1.hashCode().equals(str2.hashCode())); //не работает
    }
}
