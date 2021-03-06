package ru.progwards.t10.t10_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

//Чтение массива байт из файла
public class ReadByteFile {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream byteFile = new FileInputStream("file1.bin");
            try {
                byte[] bytes = byteFile.readAllBytes();
                System.out.println(Arrays.toString(bytes));
            } finally {
                byteFile.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

