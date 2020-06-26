package ru.progwards.t11.t11_1;

import java.io.FileWriter;
import java.io.IOException;

//Пример с конструкцией try-with-resources
public class Example1 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("????", false)) {
            writer.write("Какая-то строка");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
