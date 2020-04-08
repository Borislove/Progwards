package ru.progwards.t4.n4_2;

public class IfElse {

    public static void main(String[] args) {

        int x = 125;
        String daysString;
        String remainderInfo = "Число оканчивается на ";

        int remainder100 = x % 100;
        if (remainder100 >= 11 && remainder100 <= 20) {
            daysString = "дней";
            remainderInfo += remainder100;
        } else {

            int remainder10 = x % 10;

            if (remainder10 == 1)
                daysString = "день";
            else if (remainder10 >= 2 && remainder10 <= 4)
                daysString = "дня";
            else
                daysString = "дней";

            remainderInfo += remainder10;

        }
        System.out.println("Событие настпупит через " + x + " " + daysString);
        System.out.println(remainderInfo);
    }
}
