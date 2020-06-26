package ru.progwards.t11.t11_1;

import java.io.FileWriter;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("????", false);
            writer.write("Какаято строка");
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

//java.io.FileNotFoundException: ???? (Синтаксическая ошибка в имени файла, имени папки или метке тома)