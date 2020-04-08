package ru.progwards.t6.t6_1;

//Проверка правила Фибоначчи
public class CheckFiboRule {

    private static boolean checkFibo(int[] intArray) {
        for (int i = 2; i < intArray.length; i++) {
            if (intArray[i - 2] + intArray[i - 1] != intArray[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] simpleArray1 = {21, 34, 55, 89, 144};
        int simpleArray2[] = {144, 34, 55, 89, 21};
        int[] simpleArray3 = new int[5];

        System.out.println("chekFibo 1 = " + checkFibo(simpleArray1));
        System.out.println("chekFibo 2 = " + checkFibo(simpleArray2));
        System.out.println("chekFibo 3 = " + checkFibo(simpleArray3));
    }
}
