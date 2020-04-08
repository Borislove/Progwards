package ru.progwards.t8.i8;

/*Описаны интерфейсы

public interface Speaking {
    public String say();
 }

public interface Eating {
     public String eat();
 }

реализовать 2 класса, Dog и Goat.
У класса Dog метод say() должен вернуть "Гав"
У класса Dog метод eat() должен вернуть "Мясо"
У класса Goat метод say() должен вернуть "Мее"
У класса Goat метод eat() должен вернуть "Сено"   */

public class Test {

    public interface Speaking {
        public String say();
    }

    public interface Eating {
        public String eat();
    }

    class Dog implements Speaking, Eating {
        @Override
        public String say() {
            return "Гав";
        }

        @Override
        public String eat() {
            return "Мясо";
        }
    }


    class Goat implements Speaking, Eating {
        @Override
        public String say() {
            return "Мее";
        }

        @Override
        public String eat() {
            return "Сено";
        }
    }
}


