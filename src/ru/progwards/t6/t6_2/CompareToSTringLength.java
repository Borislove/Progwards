package ru.progwards.t6.t6_2;

//Lлина String через compareTo()
public class CompareToSTringLength {
    public static void main(String[] args) {
        String str1 = "12345";

        System.out.println(str1.compareTo("")); //5
        System.out.println("".compareTo(str1)); //-5

        System.out.println(str1.length()); //5
    }
}
