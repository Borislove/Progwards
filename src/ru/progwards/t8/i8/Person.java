package ru.progwards.t8.i8;

/*Создайте класс Person, а внутри него 2 класса

вложенный класс Child1
внутренний класс Child2
У каждого класса, Child1 и Child2 создайте метод String hello()

У Child1 String hello() должен вернуть "привет"
У Child2 String hello() должен вернуть "servus"*/

public class Person {

    static class Child1 { //вложенный

        public String hello() {
            //getClass();
            return "привет";
        }
    }

    class Child2 {  //внутренний
        public String hello() {
            //getClass();
            return "servus";
        }
    }


    public static void main(String[] args) {
        System.out.println(new Person().new Child2().hello());
        System.out.println(new Person.Child1().hello());
    }
}


