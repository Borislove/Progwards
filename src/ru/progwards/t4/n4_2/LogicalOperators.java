package ru.progwards.t4.n4_2;

//Оператор сравнения на примере
public class LogicalOperators {

    public static void main(String[] args) {

        int x = 555;
        int y = 999;

        boolean result1 = x > y;
        boolean result2 = x < y;
        boolean result3 = x == y;
        boolean result4 = x >= y;
        boolean result5 = x <= y;

        System.out.println("Результат x > y:  " + result1 + ";");
        System.out.println("Результат x < y:  " + result2 + ";");
        System.out.println("Результат x == y: " + result3 + ";");
        System.out.println("Результат x >= y: " + result4 + ";");
        System.out.println("Результат x <= y: " + result5 + ";");

        System.out.println("Результат x !=y:  " + (x != y) + ";"); //более компактная форма записи
    }
}
