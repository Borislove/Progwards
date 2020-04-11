package ru.progwards.t10.t10_1;

//Особенности finally 2
public class Ecxeption2 {
    static int finallyResearch() {
        try {
            System.out.println("try");
            return 1;
        } catch (Exception e) {
            System.out.println("catch");
            return 2;
        } finally {
            System.out.println("finally");
            return 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(finallyResearch());
    }
}

