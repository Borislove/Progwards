package ru.progwards.t10.i10;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*Реализовать метод с сигнатурой private int lineCount(String filename)
 который возвращает количество строк в файле filename.
  В случае ошибки пробросить исключение IOException со строкой сообщения "файл не найден"*/
public class FileNotFound {


    private static int lineCount(String filename) throws IOException {
        try {
            FileReader reader = new FileReader(filename);  //чтение файла
            Scanner scanner = new Scanner(reader);
            int count = 0;  //количество строк
            try {
                while (scanner.hasNextLine()) {
                    String strFromFile = scanner.nextLine();
                    count++;
                }
            } finally {
                reader.close();
                scanner.close();
            }
            return count;
        } catch (Throwable e) {
            throw new IOException("файл не найден");
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(lineCount("logfile2.txt"));
    }
}
