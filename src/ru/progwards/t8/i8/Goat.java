package ru.progwards.t8.i8;

public class Goat implements Eating,Speaking {

    @Override
    public String eat() {
        return "Сено";
    }

    @Override
    public String say() {
        return "Мее";
    }
}
