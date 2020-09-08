package ru.progwards.function;

//Условный вызов return в середине функции
public class ReturnByIf {
    static int div(int a, int b) {
        if (b == 0) {
            System.out.println("На 0 делить нельзя!");
            return 0;
        }
        System.out.println("Нормальное вичисление.");
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {

        int c1 = div(25,5);
        System.out.println("c1 = " + c1);
        int c2 = div(1000,0);
        System.out.println("c2 = " + c2);
    }
}
