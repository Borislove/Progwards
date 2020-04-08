package ru.progwards.t6.t6_2;

//принудительно создали объект
public class StringCompare1 {

    public static void main(String[] args) {

        String str1 = new String("12345");
        String str2 = new String("12345");

        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2)); //true
    }
}
