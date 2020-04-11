package ru.progwards.t10.t10_1;

//Исключения за минуту
public class ExceptionsInMinute {
    public static void main(String[] args) {
        Object objectNull = null;
        try {
            objectNull.toString();
        } catch (Exception e) {
            System.out.println("Произошло исключение...");
        }
    }
}
