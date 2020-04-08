package ru.progwards.t4.n4_3;

//Оператор break;
public class CycleWhileBreak {

    public static void main(String[] args) {

        int i = 0;
        while (i < 5) {

            i++;
            if (i == 3) {
                System.out.println("Сработал break...");
                break;  //прерывает цикл и передает следующему оператору
            }
            System.out.println("Строка " + i);
        }
    }
}