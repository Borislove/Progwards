package ru.progwards.t8.t8_1;

//У каждого объекта свой уникальный хеш-код, он хранится в памяти
public class Example {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

           System.out.println(new Object().hashCode());
        }
    }
}
