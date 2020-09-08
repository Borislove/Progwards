package ru.progwards.t17.t17_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Копирование файла в java.nio
public class NioFileCopy {
    final static String HOME_DIR = "C:/Projects/Academy/Java1";

    public static void main(String[] args) {
        Path dir1 = Paths.get(HOME_DIR);

        try{
            Path srcFile  = dir1.resolve("file1.txt");
            Path dstFile = dir1.resolve("file1copy.txt");

            Files.copy(srcFile, dstFile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
