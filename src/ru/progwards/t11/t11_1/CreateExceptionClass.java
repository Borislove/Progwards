package ru.progwards.t11.t11_1;

import java.io.FileWriter;
import java.io.IOException;

//Создание своего класса исключения
public class CreateExceptionClass {
    public static class WrongFileName extends RuntimeException {
        public String fileName = "";

        public WrongFileName(String fileName) {
            super("Непарвильное имя файла");
            this.fileName = fileName;
        }

        @Override
        public String getMessage() {
            return super.getMessage() + (fileName == null ? "" : " \"" + fileName + "\"");
        }
    }

    public static void createFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, false)) {

        } catch (IOException e) {
            throw new WrongFileName(fileName);
        }
    }

    public static void main(String[] args) {
        try {
            createFile("????");
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}
