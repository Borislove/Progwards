package ru.progwards.t10.t10_3;

import java.io.PrintStream;

//Если потоков два, а получатель один...
public class Streams2 {
    public static void main(String[] args) {
        System.out.println("Что такое System.out?");
        PrintStream printStream = System.out;

        for (int i = 0; i < 1000; i++) {
            printStream.println("Это");
            System.err.println("поток");
            printStream.println("для");
            System.err.println("стандартного");
            printStream.println("вывода.");
        }
    }
}
