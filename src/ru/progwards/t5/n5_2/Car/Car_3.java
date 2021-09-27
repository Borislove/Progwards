package ru.progwards.t5.n5_2.Car;

public class Car_3 {

    //свойства
    final String brand;
    final String model;
    final int maxSpeed;
    /////////////////////////
    int speed; //

    //конструктор
    //определяет базовые свойства, упрощает использование объектов
    public Car_3(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    //метод выводит информацию об объекте
    public String info() {
        return "Марка: " + brand + "\nМодель: " + model + "\nМакс. скорость:" + maxSpeed;
    }

    //меняет состояние объекта
    public int incSpeed(int howMuch) {
        return speed += howMuch;
    }

    public static void main(String[] args) {

        Car_3 jaguar = new Car_3("Jaguar", "F-TYpe", 300);
        Car_3 ford = new Car_3("Ford", "Focus", 180);

        System.out.println(jaguar.info());
        System.out.println(ford.info());

    }
}



