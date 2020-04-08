package ru.progwards.t6.t6_1;

//Перебор всех элементов массива
public class ArrayExamples2 {
    private static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Элемент номер " + i + " = " + intArray[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] simpleArray1 = {21, 34, 55, 89, 144};
        int simpleArray2[] = {144, 34, 55, 89, 21};
        int[] simpleArray3 = new int[5];

        printArray(simpleArray1);
        printArray(simpleArray2);
        printArray(simpleArray3);
    }
}
