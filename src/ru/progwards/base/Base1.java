package ru.progwards.base;

public class Base1 {

    /*1. Реализовать функцию public static void printJava() в которой следует: создать три строковые переменные со значениями:
    "Хорошо идут дела"
    "Изучаю Java я!"
    " " (пробел)*/
    public static void printJava() {
        String str = "Хорошо идут дела";
        String str1 = "Изучаю Java я!";
        String str2 = " ";
        System.out.print(str);
        System.out.println();
        System.out.print(str1);
        System.out.println();
        System.out.print(str + str2 + str1);
        System.out.println();
        System.out.print(str1 + str2 + str);
    }

    /*2. Реализовать функцию public static void printJava(String java1, String java2) в которой:
    вывести на консоль, используя System.out.print(), System.out.println() и параметры java1 и java2 текст таким образом,
     что бы при вызове printJava("Чтобы Java понимать", "Надо функции писать") получился результат:
    Чтобы Java понимать
    Надо функции писать!
    Чтобы Java понимать, Надо функции писать!
    Надо функции писать, Чтобы Java понимать!*/
    public static void printJava(String java1, String java2) {
        System.out.println(java1);
        System.out.println(java2 + "!");
        System.out.println(java1 + ", " + java2 + "!");
        System.out.println(java2 + ", " + java1 + "!");
    }

    /*3. Реализовать функцию public static String plusJava(String message) в которой:
    вернуть параметр message используя оператор return, добавив спереди "Java - ", и сзади " язык программирования" так,
     что бы, например, при вызове plusJava("самый популярный") функция вернула "Java - самый популярный язык программирования"*/
    public static String plusJava(String message) {
        return "Java - " + message + " язык программирования";
    }

    public static void main(String[] args) {

                        /*4. Реализовать функцию public static void main(String[] args) в которой:
                        - вызвать функцию printJava() без параметров
                        - вызвать функцию printJava() с параметрами "Чтобы Java понимать", "Надо функции писать"
                        - вызвать функцию printJava() с параметрами "Буду, буду программистом", "Код пишу я чисто, чисто"
                        - завести переменную String str
                        - присвоить в str результат вызова функции plusJava("самый популярный")
                        - вывести на консоль
                        str = ?
                        где вместо ? будет значение переменной, в данном случае это
                        str = Java - самый популярный язык программирования
                        - присвоить в str результат вызова функции plusJava("объектно-ориентированный")
                        - вывести на консоль значение переменной s
                        str = ?
                        где вместо ? будет значение переменной, в данном случае это
                        str = Java - объектно-ориентированный язык программирования
                        - не используя никаких переменных вывести на консоль результат вызова функции plusJava("очень интересный")
                        в данном случае это
                        Java - очень интересный язык программирования*/

        //1
        /*вывести на консоль, используя только эти переменные и функции System.out.print(), System.out.println() следующий текст:
        Хорошо идут дела
        Изучаю Java я!
        Хорошо идут дела Изучаю Java я!
        Изучаю Java я! Хорошо идут дела*/
        printJava();
        System.out.println();

        //2
        printJava("Чтобы Java понимать", "Надо функции писать");
        printJava("Буду, буду программистом", "Код пишу я чисто, чисто");

        //3
        System.out.println(plusJava("самый популярный"));

        //4
        String str;
        str = plusJava("самый популярный");
        System.out.println(str);
        str = plusJava("объектно-ориентированный");
        System.out.println(str);

        System.out.println(plusJava("очень интересный"));
    }
}
