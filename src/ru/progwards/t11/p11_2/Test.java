package ru.progwards.t11.p11_2;

import java.util.Scanner;

/*Создайте метод с сигнатурой public void scanLines(), который реализует следующий алгоритм:
- вводить с клавиатуры строки, до тех пор, пока во входной строке не встретится "/stop"
- если во входной строке содержится "Привет" вывести на консоль "Здравствуйте!"
- если во входной строке содержится "как дела" вывести на консоль "Хорошо"
- если во входной строке содержится "/stop" - закончить выполнение метода
- во всех остальных случая вывести введенную строку на консоль

Примечание: для проверки, содержит ли строка,
 содержимое другой строки используйте метод класса String boolean contains(String str)*/
public class Test {

    public void scanLines() {

        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                String str = scanner.nextLine();
                //  System.out.println("Вы ввели:" + str);
                if (str.equals("/stop")) {
                //    System.out.println("/stop");
                    break;
                }
                if (str.contains("Привет")) {
                    System.out.println("Здравствуйте!");
                    continue;
                }
                if (str.contains("как дела")) {
                    System.out.println("Хорошо");
                    continue;
                } else
                    System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.scanLines();
    }
}
