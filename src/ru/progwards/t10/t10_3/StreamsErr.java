package ru.progwards.t10.t10_3;

import java.io.PrintStream;

//Стандартный поток для ошибок
public class StreamsErr {
    public static void main(String[] args) {
        System.err.println("Что такое System.out?");

        PrintStream printStream = System.err;
        printStream.println("Это");
        printStream.println("поток");
        printStream.println("для");
        printStream.println("стандартного");
        printStream.println("вывода.");
    }
}


