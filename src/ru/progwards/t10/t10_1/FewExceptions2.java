package ru.progwards.t10.t10_1;

//Обработка обобщающих исключений
public class FewExceptions2 {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.out.println((new int[5])[5]);
            int e = 1 / 0;
            ((Object) null).toString();
        } catch (ArithmeticException e) {
            System.out.println("Произошло деление на 0");
        } catch (NullPointerException e) {
            System.out.println("Обращение к объекту по ссылке null");
        } catch (Exception e) {
            System.out.println("Какое-то другое исключение");
        }
    }
}


