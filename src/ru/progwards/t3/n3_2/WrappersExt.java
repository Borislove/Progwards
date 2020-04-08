package ru.progwards.t3.n3_2;

//Конвертация строк в числа
public class WrappersExt {

    public static void main(String[] args) {

        String str1 = "999";
        String str2 = "000555";
        String str3 = "999.555";

        Short s1 = Short.valueOf(str1);
        int i1 = Integer.valueOf(str2);
        int i2 = Integer.parseInt(str2);
        double d1 = Double.valueOf(str3);
        double d2 = Double.parseDouble(str3);

        int value = (int) d1;    //все просто! // конвертация из дабл в инт
        System.out.println("value "+value);

        System.out.println("s1 = " + s1);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
    }
}
