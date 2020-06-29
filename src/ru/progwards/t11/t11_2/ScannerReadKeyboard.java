package ru.progwards.t11.t11_2;

import java.util.Scanner;

//Ввод с клавиатуры
public class ScannerReadKeyboard {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String str = scanner.nextLine();
        }
    }
}
