package ru.progwards.t10.t10_3;

import java.io.FileWriter;
import java.io.IOException;

//Пытаемся записать всю информацию в лог...
public class LogFileRewrite {
    public static boolean log(String msg) {
        return log(msg, true);
    }

    public static boolean log(String msg, boolean toConsole) {
        if (toConsole)
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

    public static void main(String[] args) {
        for (int i = 0; i < 55; i++) {
            log("Всё хорошо, процесс идёт по плану");
            log("Потоки символов сейчас зальют экраны...");
            log("И всё это запишется в лог-файл?");
            log("это итерация " + i);
        }
    }
}