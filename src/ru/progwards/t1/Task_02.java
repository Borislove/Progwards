package ru.progwards.t1;

//Выведите на консоль следующий текст
//
//Изучать Java это интересно
//Изучать Java это полезно
//Изучать Java это не сложно


/////////////////////////////////////////////////////////////
/*
public class Task_02 {
    public static void main(String[] args) {
        System.out.println("Изучать Java это интересно");
        System.out.println("Изучать Java это полезно");
        System.out.println("Изучать Java это не сложно");
    }
}
/////////////////////////////////////////////////////////////
 */

//смысл отсутствует
/////////////////////////////////////////////////////////////
/*public class Task_02 {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.print("Изучать Java это");
            if (i == 0) {
                System.out.println(" интересно");
            }
            if (i == 1) {
                System.out.println(" полезно");
            }
            if (i == 2) {
                System.out.println(" не сложно");
            }
        }
    }
}*/
/////////////////////////////////////////////////////////////
/*public class Task_02 {

    public static void main(String[] args) {

        String str = "Изучать Java это";

        for (int i = 1; i < 4; i++) {
            switch (i) {
                case 1:
                    System.out.println(str + " интересно");
                    break;
                case 2:
                    System.out.println(str + " полезно");
                    break;
                case 3:
                    System.out.println(str + " не сложно");
                    break;
            }
        }
    }
}*/


public class Task_02 {


    public static void main(String[] args) {

        String str = "Изучать Java это интересно";
        System.out.println(str);
        System.out.println(str.replace("интересно", "полезно"));
        System.out.println(str.replace("интересно", "не сложно"));
    }
}