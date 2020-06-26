package ru.progwards.t11.t11_1;

import java.io.IOException;

//Пример с функцией
public class SuppressedExceptions2 {
    public static void doAlwaysExceptions() throws Exception {
        AlwaysExceptions ae = new AlwaysExceptions(1);
        try {
            ae.method();
        } finally {
            ae.close();
        }
    }

    public static void main(String[] args) {
        try {
            doAlwaysExceptions();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }
}
