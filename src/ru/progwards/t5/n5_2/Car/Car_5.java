package ru.progwards.t5.n5_2.Car;

import java.time.Duration;
import java.time.LocalTime;

public class Car_5 {
    //свойства
    String brand;
    String model;
    int maxSpeed;

    //конструктор
    public Car_5(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

class UseCar_5 {
    public static void main(String[] args) {

        LocalTime lc1 = LocalTime.now();
        ////////////////////////////////////////////////////////////////////////
        Car_5 jaguar = new Car_5("Jaguar", "F-TYPE", 300);
        Car_5 ford = new Car_5("Ford", "Focus", 180);
        Car_5 niva = new Car_5("VAZ", "Niva", 140);

        Car_5 fastestCar = niva;
        if (ford.maxSpeed > fastestCar.maxSpeed)
            fastestCar = ford;
        if (jaguar.maxSpeed > fastestCar.maxSpeed)
            fastestCar = jaguar;

        System.out.println("Быстрейшая машина " + fastestCar.brand);
        ////////////////////////////////////////////////////////////////////////

        LocalTime lc2 = LocalTime.now();
        Duration duration = Duration.between(lc1, lc2);
        System.out.println(duration); // ~0030409S
    }
}
