package ru.progwards.t5.n5_2.Car;

public class UseCarSimple {
    public static void main(String[] args) {

        CarSimple jaguar = new CarSimple();
        //конструктор по умолчанию
        System.out.println("Марка: " + jaguar.brand);  //null
        System.out.println("Модель: " + jaguar.model); //null
        System.out.println("Максиальная скорость: " + jaguar.maxSpeed);  //0

        //присваиваем значения
        jaguar.brand = "Jaguar";
        jaguar.model = "F-TYPE";
        jaguar.maxSpeed = 300;

        System.out.println("Марка: " + jaguar.brand);
        System.out.println("Модель: " + jaguar.model);
        System.out.println("Максиальная скорость: " + jaguar.maxSpeed);
    }
}
