package ru.progwards.t8.t8_3;

//Статический конструктор
public class StaticConstructor {

    static String staticString = "Значение присвоено при описании переменной";

    static {
        staticString = "Значение присвоено в статическом конструкторе класса";
    }

    public static void main(String[] args) {
        System.out.println(StaticConstructor.staticString);
    }
}
