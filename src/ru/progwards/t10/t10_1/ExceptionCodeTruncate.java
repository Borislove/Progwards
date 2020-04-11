package ru.progwards.t10.t10_1;

//Исключение прерывает исполнение кода
public class ExceptionCodeTruncate {
    public static void main(String[] args) {
        try {
            System.out.println("В try будет исключение");
            int e = 1/0;
            System.out.println("Жди");
            System.out.println("кода");
            System.out.println("отсечение");

        }catch (Exception e) {
            System.out.println("А в блоке catch - лечение");
        }
    }
}
