package ru.progwards.t5.n5_2.Car;

public class Car {
    //свойства
    String brand;
    String model;
    int maxSpeed;
    int speed; // добавим текущую скорость

    //конструктор
    //определяет базовые свойства, упрощает использование объектов
    public Car(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}
