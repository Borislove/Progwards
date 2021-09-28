package ru.progwards.t5.n5_2.Car;

public class Car_1 {

    //свойства
    /////////////////////////
    //Эти свойства должны определятся один раз, и дальше, на протяжении жизни объекта не будут менятсья
    final String brand;
    final String model;
    final int maxSpeed;
    /////////////////////////
    int speed; // добавим текущую скорость

    //конструктор
    //определяет базовые свойства, упрощает использование объектов
    public Car_1(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public static void main(String[] args) {

        Car_1 car_1 = new Car_1("Ford", "Focus", 10);
    }
}


