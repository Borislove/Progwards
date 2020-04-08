package ru.progwards.t6.t6_1;

//Обращение к элементу массива
public class Array {

    public static void main(String[] args) {

        int[] simpleArray1 = {21, 34, 55, 89, 144};
        int simpleArray2[] = {144, 34, 55, 89, 21};
        int[] simpleArray3 = new int[5];
        String[] stringArray1 = new String[5];
        String[] stringArray2 = {"мне", "всё", "понятно"};

        System.out.println("simpleArray1[2] = " + simpleArray1[2]);
        System.out.println("simpleArray2[0] = " + simpleArray2[0]);
        boolean testFibo =
                simpleArray1[0] + simpleArray1[1] == simpleArray1[2];
        System.out.println("testFibo = " + testFibo);
        System.out.println("simpleArray3[1] = " + simpleArray3[1]);  // 0
        System.out.println("simpleArray1[3] = " + stringArray1[3]); //null
        System.out.println("simpleArray2[2] = " + stringArray2[2]); //понятно

        // int a1[],a2[],a3[];
        //int a[] = {11, 22, 33};
        //int item = a[1];
        // int []a = {10, 26, 12, 35};
        //int a[][][];
    }
}
