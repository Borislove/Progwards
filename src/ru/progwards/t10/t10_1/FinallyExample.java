package ru.progwards.t10.t10_1;

//Блок finally
public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("try");

        }catch (Exception e){
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }
    }
}
