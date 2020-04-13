package ru.progwards.t10.t10_3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Чтение из символьного файла
public class ReadCharFile {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src\\file1.txt");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()) {
            String strFromFile = scanner.nextLine();
            System.out.println(strFromFile);
        }
    }
}
