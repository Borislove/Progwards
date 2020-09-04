package ru.progwards.t17.t17_1;

import java.nio.file.Path;
import java.nio.file.Paths;

//Paths.get для строки
public class NioPathsGet {
    public static void main(String[] args) {

        Path path1 = Paths.get("C:/Projects/Academy/Java1");
        Path path2 = Paths.get("src");
        Path path3 = Paths.get("file1.txt");

        System.out.println("path1:");
        System.out.println(path1);
        System.out.println(path1.toAbsolutePath());

        System.out.println("\npath2:");
        System.out.println(path2);
        System.out.println(path2.toAbsolutePath());

        System.out.println("\npathc3:");
        System.out.println(path3);
        System.out.println(path3.toAbsolutePath());
    }
}
