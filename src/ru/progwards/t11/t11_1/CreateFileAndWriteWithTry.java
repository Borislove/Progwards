package ru.progwards.t11.t11_1;

import java.io.FileWriter;
import java.io.IOException;

//Пример с функцией и пробросом
public class CreateFileAndWriteWithTry {
    public static void createFile(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName, false);

        try {
            writer.write("Какая-то строка");
        } finally {
            writer.close();
        }
    }

    public static void main(String[] args) {

        try {
            createFile("????");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
