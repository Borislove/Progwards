package ru.progwards.t10.t10_3;

import java.io.FileOutputStream;
import java.io.IOException;

//Запись массива байт в файл
public class Write2ByteFileViaArray {
    public static void main(String[] args) {
        byte[] byteArr = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        try {
            FileOutputStream byteFile = new FileOutputStream("file1.bin");
            try {
                byteFile.write(byteArr);
            } finally {
                byteFile.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

