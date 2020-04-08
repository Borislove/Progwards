package ru.progwards.t5.i5;

/*Создайте класс Person, содержащий
приватную переменную String name; +
приватную переменную int age; +
приватную переменную String country; +
конструктор по умолчанию, устанавливающий country = "RU";
конструктор с параметрами String name, int age, вызывающий конструктор по умолчанию, и устанавливающий значения переменным name и age из соответствующих параметров;
публичные функции String getName(), int getAge(), String getCountry(), возвращающие значения соответствующих переменных*/

public class Person { //Passed all tests!

    private String name;
    private int age;
    private String country = "RU";  //с пустым не работает

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person() {
        this.country = "RU";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}

