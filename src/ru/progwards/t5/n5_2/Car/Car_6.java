package ru.progwards.t5.n5_2.Car;

import java.time.Duration;
import java.time.LocalTime;

public class Car_6 {

    //свойства
    String brand;
    String model;
    int maxSpeed;

    //конструктор
    public Car_6(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    //метод для сравнения объектов (машин)
    public boolean isFasterThan(Car_6 anotherCar) {
        //сравнение текущей скорости с другим авто
        return this.maxSpeed > anotherCar.maxSpeed;
    }
}

class UseCar_6 {
    public static void main(String[] args) {

        LocalTime lc1 = LocalTime.now();
        ///////////////////////////////////////////////////////////////////////////
        Car_6 jaguar = new Car_6("Jaguar", "F-TYPE", 300);
        Car_6 ford = new Car_6("Ford", "Focus", 180);
        Car_6 niva = new Car_6("VAZ", "Niva", 140);

        Car_6 fastestCar = niva;
        if (ford.isFasterThan(fastestCar))
            fastestCar = ford;
        if (jaguar.isFasterThan(fastestCar))
            fastestCar = jaguar;

        System.out.println("Быстрейшая машина " + fastestCar.brand);
        ///////////////////////////////////////////////////////////////////////////

        LocalTime lc2 = LocalTime.now();

        Duration duration = Duration.between(lc1,lc2);
        System.out.println(duration);  // ~PT0.0030017S
    }
}


