package ru.progwards.t17.t17_1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

//toRealPath: реальный абсолютный путь
public class NioPathsToRealPath {
    public static void main(String[] args)  throws IOException {

        Path path = Paths.get("symlinkJava1");

        Path realPath = path.toRealPath();
        Path absPath = path.toAbsolutePath();
        Path realAbsPath = absPath.toRealPath();

        System.out.println("path: "+ path +"\n");

        System.out.println("realPath:    "+realPath);
        System.out.println("absPath:    "+absPath);
        System.out.println("realAbsPath:  "+realAbsPath);
    }
}
