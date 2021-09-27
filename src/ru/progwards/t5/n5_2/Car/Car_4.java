package ru.progwards.t5.n5_2.Car;

public class Car_4 {

    //свойства
    final String brand;
    final String model;
    final int maxSpeed;

    private int speed; //

    public int getSpeed() {
        return speed;
    }

    public Car_4(String brand, String model, int maxSpeed) {
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
        speed += howMuch;
        if (speed > maxSpeed)
            speed = maxSpeed;

        return speed;
    }
}

class CheckAccessLimits {
    public static void main(String[] args) {
        Car_4 jaguar = new Car_4("Jaguar", "F-TYpe", 300);
        System.out.println(jaguar.info());
        //   jaguar.speed = 33; private
       /* jaguar.incSpeed(55);
        System.out.println("Скорость: " + jaguar.getSpeed());*/

        /*jaguar.incSpeed(1000);
        System.out.println("Скорость: " + jaguar.getSpeed());*/

        jaguar.incSpeed(299);
        System.out.println("Скорость: " + jaguar.getSpeed());
    }
}


