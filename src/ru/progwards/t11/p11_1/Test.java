package ru.progwards.t11.p11_1;


/*Существует метод public void doSomething(int n) throws IOException,
создайте свой метод, с сигнатурой public void test(int n), который должен содержать блоки try-catch-finally

1) В блоке try вызовите метод doSomething(n)

2) В блоке catch выведите на консоль строку, полученную из исключения через  getMessage()

3) Пробросите исключение дальше

4) В блоке finally выведите на консоль фиксированный текст "finally executed"*/

import java.io.IOException;

public class Test {

    public void doSomething(int n) throws IOException {

        try {
            doSomething(n);
        } catch (IOException e) {
            e.getMessage();
        } finally {
            System.out.println("finally executed");
        }
    }

    public void test(int n) throws IOException {
        try {
            doSomething(n);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            throw new IOException(e);   //3) Пробросите исключение дальше

        } finally {
            System.out.println("finally executed");
        }
    }
}
