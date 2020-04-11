package ru.progwards.t10.t10_1;

//Особенности finally
public class Exception1 {
    static int finallyResearch() {
        try {
            System.out.println("try");
            return 1;
        } catch (Exception e) {
            System.out.println("catch");
            return 2;
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        System.out.println(finallyResearch());
    }
}


