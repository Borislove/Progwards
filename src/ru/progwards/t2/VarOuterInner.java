package ru.progwards.t2;

public class VarOuterInner {
    public static void main(String[] args) {

        String outer = "Внешняя для блока переменная outer";

        {
            String inner = "Внутренняя переменная блока inner";
            System.out.println("Переменная outer = " + outer);
        }

        System.out.println(outer);
    }
}
