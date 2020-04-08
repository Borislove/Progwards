package ru.progwards.t6.t6_2;

//сравнение String через compareTo()
//в сравнении строк, регистрозависима
//в строках  числа либо положительные, либо отрицальные, либо равны
//чей код больше, та строка и будет больше
public class CompareToString {
    public static void main(String[] args) {
        String str1 = "ABCDE12345";
        String str2 = "ABCDE12345";

        System.out.println(str1.compareTo(str2));      //0

        str1 = "aBCDE12345";
        str2 = "ABCDE12345";

        System.out.println(str1.compareTo(str2));    //32

        str1 = "ABCDE12345";
        str2 = "CDE12345";

        System.out.println(str1.compareTo(str2));  //-2
        //---------------------------------------------------
        System.out.println("\n");
        str1 = "aBCDE12345";
        str2 = "ABCDE12345";
        str1.toUpperCase();
        str2.toUpperCase();
        //все равно больше но не равно

        System.out.println(str1.compareTo(str2)); //32
        System.out.println(str1.equals(str2)); //false
        System.out.println(str1 == str2); //false

        str1 = "test";
        str2 = "test";
        System.out.println(str1.compareTo(str2)); //0

        str2 = "TEST";
        System.out.println(str1.compareTo(str2)); //32
        System.out.println(str2.compareTo(str1)); //-32

        //-------------------------------------------------
        str1 = "test1";
        str2 = "TEST1";
        str1 = str1.toUpperCase();   //надо было занести значение
        System.out.println(str1.compareTo(str2)); // 0

        //-------------------------------------------------
        str1 = "ABCDE12345";
        str2 = "BCDE12345A";
        System.out.println(str1.compareTo(str2)); //-1
    }
}
