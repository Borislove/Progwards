package ru.progwards.t10.i10;

import java.io.IOException;

/*Напишите метод с сигнатурой public String test(String filename),
 который проверяет filename и если он равен null выбрасывает
  IOException со строкой "File not found", в противном случает возвращает строку "File processing"*/
public class Exception2 {

    public static String test(String filename) throws IOException {

        if (filename == null)
            throw new IOException("File not found");

        return "File processing";
    }

    public static void main(String[] args) throws IOException {
        test(null);
    }
}
