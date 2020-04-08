package ru.progwards.t4.n4_2;

public class IfElse1 {

    public static void main(String[] args) {

        if (2 * 2 == 5)
            System.out.println("Оказывается 2*2 = 5");

        if (2 * 2 == 4)
            System.out.println("Все таки 2*2 = 4");
        else
            System.out.println("Действительно, 2*2 не 4");

        if (2 * 2 < 0)
            System.out.println("2*2 это отрицательное число");
        else if (2 * 2 > 0)
            System.out.println("2*2 это положительное число");
        else
            System.out.println("2*2 это и есть ноль");
    }
}
