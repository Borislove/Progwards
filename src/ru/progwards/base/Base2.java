package ru.progwards.base;

public class Base2 {

    /*1. Создать константы
        X_EQUALS и присвоить значение "x = "
        Y_EQUALS и присвоить значение "y = "
        A_EQUALS и присвоить значение "a = "
        B_EQUALS и присвоить значение "b = "
        C_EQUALS и присвоить значение "c = "*/

    private static final String X_EQUALS = "x = ";
    private static final String Y_EQUALS = "y = ";
    private static final String A_EQUALS = "a = ";
    private static final String B_EQUALS = "b = ";
    private static final String C_EQUALS = "c = ";

    /*2.1. Реализовать функцию public static int subtraction(int x, int y) в которой:
    возвращать разницу x и y;
    вывести на консоль следующий текст:
    Вызвана функция subtraction() с параметрами x = ?, y = ?
    где вместо знаков вопроса будут реальные значения.
    Для вывода "x = " и "y = " использовать константы X_EQUALS и Y_EQUALS
    Например, если вызвана subtraction(4, 5) на консоль должно быть выведено
    Вызвана функция subtraction() с параметрами x = 4, y = 5*/

    public static int subtraction(int x, int y) {
        System.out.println("Вызвана функция subtraction() с параметрами " + X_EQUALS + x + ", " + Y_EQUALS + y);
        return x - y;
    }

    /*2.2 Реализовать функцию public static int addition(int x, int y) которая будет:
    возвращать сумму x и y;
    выводить на консоль следующий текст:
    Вызвана функция addition() с параметрами x = ?, y = ?
    где вместо знаков вопроса будут реальные значения.
    Для вывода "x = " и "y = " использовать константы X_EQUALS и Y_EQUALS*/
    public static int addition(int x, int y) {
        System.out.println("Вызвана функция addition() с параметрами " + X_EQUALS + x + ", " + Y_EQUALS + y);
        return x + y;
    }

    /*2.3 Реализовать функцию public static int multiplication(int x, int y) которая будет:
    возвращать произведение x и y;
    выводить на консоль следующий текст:
    Вызвана функция multiplication() с параметрами x = ?, y = ?
    где вместо знаков вопроса будут реальные значения.
    Для вывода "x = " и "y = " использовать константы X_EQUALS и Y_EQUALS*/
    public static int multiplication(int x, int y) {
        System.out.println("Вызвана функция multiplication() с параметрами " + X_EQUALS + x + ", " + Y_EQUALS + y);
        return x * y;
    }

    /*2.4 Реализовать функцию public static void calculation() в которой следует:
    объявить переменные типа int с названиями a, b, c;
    переменной a присвоить значение 34, переменной b присвоить значение 55;
    вывести значения переменных a и b на консоль так:
    a = ?
    b = ?
    где вместо знаков вопроса будут их реальные значения;
    Для вывода "a = " и "b = " использовать константы A_EQUALS и B_EQUALS*/
    public static void calculation() {
        int a, b, c;
        a = 34;
        b = 55;
        System.out.println(A_EQUALS + a);
        System.out.println(B_EQUALS + b);

        /*после этого присвоить переменной c значение возвращённое функцией addition(), вызванной с параметрами x = a, y = b;
        и вывести значения переменной c на консоль так:
        a + b = ?
        где вместо знака вопроса будет значение переменной c;*/
        c = addition(a, b);
        System.out.println("a + b = " + c);

        /*после этого присвоить переменной c значение возвращённое функцией subtraction(), вызванной с параметрами x = a, y = b;
        и вывести значения переменной c на консоль так:
        a - b = ?
        где вместо знака вопроса будет значение переменной c;*/
        c = subtraction(a, b);
        System.out.println("a - b = " + c);

        /*после этого присвоить переменной c значение возвращённое функцией multiplication(), вызванной с параметрами x = a, y = b;
        и вывести значения переменной c на консоль так:
        a * b = ?
        где вместо знака вопроса будет значение переменной c.*/
        c = multiplication(a, b);
        System.out.println("a * b = " + c);
    }

    /*2.5 Реализовать функцию public static void calculation(int a, int b, int c) в которой следует:
    вывести на консоль следующий текст:
    Вызвана функция calculation() с параметрами a = ?, b = ?, c = ?
    где вместо знаков вопроса будут реальные значения.
    Для вывода "a = ", "b = " и "c = " использовать константы A_EQUALS, B_EQUALS, C_EQUALS*/
    public static void calculation(int a, int b, int c) {
        System.out.println("Вызвана функция calculation() с параметрами " + A_EQUALS + a + ", " + B_EQUALS + b + ", " + C_EQUALS + c);

        /*вывести на консоль значение суммы a, b и c используя только функцию addition и не используя операторы сложения или вычитания. Значение вывести в формате:
        a + b + c = ?
        где вместо знака вопроса будет реальные значение;*/

        //addition(addition(a, b), c);
        System.out.println("a + b + c = " + addition(addition(a, b), c));

        /*вывести на консоль значение a в кубе (a*a*a) используя только функцию multiplication и не используя оператор умножения. Значение вывести в формате:
        a^3 = ?
        где вместо знака вопроса будет реальное значение;*/
        System.out.println("a^3 = " + multiplication(multiplication(a, a), a));

        /*вывести на консоль значение a - (b + c * c) используя только функции addition, subtraction и multiplication
         и не используя операторов сложения, вычитания и умножения. Значение вывести в формате:
        a - (b + c^2) = ?
        где вместо знака вопроса будет реальное значение;*/


        //int result = (subtraction(a, (addition(b, multiplication(c,c)))));
        int result = subtraction(a, addition(b, multiplication(c, c)));
        System.out.println("a - (b + c^2) = " + result);
    }

    //3. Реализовать функцию public static void main(String[] args) в которой:
    public static void main(String[] args) {

//- вызвать функцию subtraction() c параметрами 45 и 12
        subtraction(45, 12);

//- вызвать функцию subtraction() c параметрами 23 и 55
        subtraction(23, 55);

//    - вызвать функцию addition() c параметрами 128 и 787
        addition(128, 787);

//    - вызвать функцию addition() c параметрами 528 и 387
        addition(528, 387);

//    - вызвать функцию multiplication() c параметрами 124 и 87
        multiplication(124, 87);

//    - вызвать функцию multiplication() c параметрами 1528 и 3
        multiplication(1528, 3);

//    - вызвать функцию calculation() без параметров
        calculation();

//    - вызвать функцию calculation() c параметрами 11, 25 и 410
        calculation(11, 25, 410);

//    - вызвать функцию calculation() c параметрами 100, 9 и 98
        calculation(100, 9, 98);

    }
}
