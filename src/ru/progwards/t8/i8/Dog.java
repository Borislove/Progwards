package ru.progwards.t8.i8;

public class Dog implements Eating,Speaking{
    @Override
    public String eat() {
        return "Мясо";
    }

    @Override
    public String say() {
        return  "Гав";
    }
}
