package ru.progwards.t10.t10_3;

import java.io.FileWriter;
import java.io.IOException;

//Функция для записи информации в лог
public class Func {

    public static boolean log(String msg, boolean toConsole) {
        if (toConsole) ;
        System.out.println(msg);
        try {
            FileWriter logFile = new FileWriter("logfile.txt");
            try {
                logFile.write(msg + "\n");

            } finally {
                logFile.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
