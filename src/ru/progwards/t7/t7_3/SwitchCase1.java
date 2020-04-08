package ru.progwards.t7.t7_3;

//Примеры со Switch Case
public class SwitchCase1 {

    public static void main(String[] args) {

        int value = 3;
        //-----------------------------------------------------
        //Пример с оператором break
        //-----------------------------------------------------
      /*  switch (value) {
            case 1:
                System.out.println("Выбран case 1");
                break;
            case 2:
                System.out.println("Выбран case 2");
                break;
            case 3:
                System.out.println("Выбран case 3");
                break;
            case 4:
                System.out.println("Выбран case 4");
                break;
            case 5:
                System.out.println("Выбран case 5");
                break;
            default:
                System.out.println("Выбран default");*/

        //-----------------------------------------------------
        //Тот же пример без оператора break
        //-----------------------------------------------------
       /* switch (value) {
            case 1:
                System.out.println("Выбран case 1");
            case 2:
                System.out.println("Выбран case 2");
            case 3:
                System.out.println("Выбран case 3");
            case 4:
                System.out.println("Выбран case 4");
            case 5:
                System.out.println("Выбран case 5");
            default:
                System.out.println("Выбран default");*/

        //-----------------------------------------------------
        //Объединенные case
        //-----------------------------------------------------
        switch (value) {
            case 1:
                System.out.println("Выбран case 1");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Выбран case 2 или 3 или 4");
                break;
            case 5:
                System.out.println("Выбран case 5");
                break;
            default:
                System.out.println("Выбран default");
                break;
        }
    }
}
