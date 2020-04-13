package ru.progwards.t10.t10_3;

import java.io.FileWriter;
import java.io.IOException;

//Запись в символьный файл
public class Write2CharFile {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("file1.txt");
        fileWriter.write("Этот файл создан мной.\n");
        fileWriter.write("Теперь он будет жить на диске\n");
        fileWriter.write("или на флешке\n");
        fileWriter.close();
    }
}
