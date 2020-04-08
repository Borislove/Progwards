package ru.progwards.t5.i5.Calc;

/*Создайте класс Calculator, содержащий
приватную переменную int result;
конструктор по умолчанию, устанавливающий result = 0;
публичную функцию set(int num), устанавливающую значение result равный num
публичную функцию add(int num), увеличивающую result на num
публичную функцию sub(int num), уменьшающую result на num
публичную функцию int getResult()*/

class Calculator {       //Passed all tests!   public class - не проходил

    private int result;

    Calculator() {
        this.result = 0;  //тоже работает, что и result = 0;
    }

    public void set(int num) {
        result = num;
    }

    public void add(int num) {
        result += num;
    }

    public void sub(int num) {
        result -= num;
    }

    public int getResult() {
        return result;
    }

    public static void main(String[] args) {
        Calculator a = new Calculator();
        Calculator b = new Calculator();
        Calculator result = new Calculator();

        a.set(35);
        b.set(45);
    }
}



