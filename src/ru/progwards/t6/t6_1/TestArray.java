package ru.progwards.t6.t6_1;

// TODO: 28.12.2019  изучаю массивы

public class TestArray {


    static int[] a = new int[5];

    static int[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    static int c[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

    //вроде нашел то что нужно!
    public static int sum555() {
        int sum = 0;
        for (int value : c) {
            //sum += value;
            sum = sum + value;

            System.out.println("сумма = " + sum);
        }
        return sum;
    }


    static int d[];

    static int f[] = {-1, -3, 10};

    static double dd[] = {2.1, 3.2312};

    static int abc[] = {2, 231, 3123, 5523, 63, 532, 77, 643, 231123, 3124567};

    static int[] abcd = {3123, 883, 23131, 6546, 7456, 7544};

    static float[] abcf = {12.21f, 12.3123f, 13.54f, 99.54f};

    // TODO: 28.12.2019 я все еще учусь складывать...
    //должно быть 45
    private static void testArraySum2() {
        for (int i = 0; i < b.length; i++) {
            System.out.println("значение 1 = " + b[i + 1 - i] + " значение 2 = " + b[i]);   //abc[i+1-i] - на след значение
            System.out.println("сумма чисел в массие " + b[i + 1 - i] + b[i]);
        }
    }

    private static void testArraySum3() {
        for (int i = 0; i < b.length; i++) {

//        int sum = b[i]+b[i+1];   //что то не нравится
            //      System.out.println(sum);

        }
    }

    private static void testArraySum1() {
        for (int value : abcd) {
            System.out.println(abcd.length);


            if (value != abcd.length) {
                System.out.println(value);

                System.out.println(value + 1);  //добавил +1 к значению в массиве...

                //int abcdf = abcd[0] + abcd[1];
                //System.out.println(abcdf);}
            }
        }
    }


    private static void testArraySum() {
        for (int i = 0; i < abcd.length; i++) {      //не тот цикл
            System.out.println(abcd[i]);

        }
    }

    private static void testArray1() {
        for (int i = 0; i < abcd.length; i++) {
            System.out.println("Длина массива " + abcd.length); //выведет длину массива
            System.out.println("Элементы массива " + abcd[i]);   //выведет элемент массивов
        }
    }


    private static void testArray() {
        for (int i = 0; i < abc.length; i++) {
            System.out.println(" " + abc[i]);
        }
    }

    static String str[] = {"Привет", " приветушки", "здрасте", "салют"};


    private static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(" " + intArray[i]);
        }
    }

    static int h = b[0] + b[1] + b[2] + b[3] + b[4] + b[5] + b[6] + b[7] + b[8] + b[9];  //как же упростить
    static int h1 = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;


    public static void main(String[] args) {

        System.out.println("длина массива а = " + a.length);
        System.out.println("длина массива b = " + b.length);
        System.out.println("длина массива c = " + c.length);

        System.out.println(b[3]);
        System.out.println(c[3]);

        System.out.println("массив b");
        printArray(b);
        System.out.println("массив c");
        printArray(c);


        System.out.println("сумма чисел в массиве = b " + h);
        System.out.println(h1);

        if (h1 == h) {
            System.out.println("интересно");
        }

        System.out.println("Текстовый массив = " + str[2]);

        System.out.println("вызван testArray");
        testArray();
        System.out.println("вызван testArray1");
        testArray1();
        System.out.println("вызван testArraySum");
        testArraySum();
        System.out.println("вызван testArraySum1");
        testArraySum1();

        System.out.println("вызван testArraySum2");
        testArraySum2();

        //заполнение массива значениями
        for (int i = 0; i < a.length; i++) {
            a[i] = 1;
            System.out.println(a[i]);
        }

        System.out.println("вызван testArraySum3");
        testArraySum3();

        System.out.println("вызван sum555");
        sum555();

    }
}
