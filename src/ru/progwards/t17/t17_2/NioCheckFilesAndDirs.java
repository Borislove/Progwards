package ru.progwards.t17.t17_2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Класс Files: информация о файле или каталоге
public class NioCheckFilesAndDirs {
    public static void main(String[] args) {
        Path pathName = Paths.get("C:/Projects/Academy/Java1/file1.txt");

        System.out.println("exists: "+ Files.exists(pathName));
    }
}
