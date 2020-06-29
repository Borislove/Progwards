package ru.progwards.t11.t11_2;

import java.util.Scanner;

//Ввод с клавиатуры строк
public class ScannerReadKeyboard_1 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите имя:");
            String firstName = scanner.nextLine();
            System.out.println("Введите отчество:");
            String middleName = scanner.nextLine();
            System.out.println("Введите фамилию:");
            String lastName = scanner.nextLine();

            System.out.println("Имя: "+firstName);
            System.out.println("Отчество: "+middleName);
            System.out.println("Фамилия: "+lastName);
        }
    }
}
