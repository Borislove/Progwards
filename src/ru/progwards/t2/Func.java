package ru.progwards.t2;

/*Реализуйте функцию с сигнатурой public String sayHello(String greeting, String name)

Функция принимает 2 параметра, приветствие и имя. Функция должна вернуть строку по шаблону:

<приветствие>, <имя>!

например:

sayHello("Привет", "Долли") должна вернуть "Привет, Долли!"

sayHello("Добрый день", "Марь Иванна") должна вернуть "Добрый день, Марь Иванна!"*/


public class Func {

    public static String sayHello(String greeting, String name){
        return greeting+", "+name+"!";
    }

    public static void main(String[] args) {
        sayHello("ddd", "daf");

        System.out.println(sayHello("test", "jo"));
    }
}
