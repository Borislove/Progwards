package ru.progwards.t7.t7_3;

//представление числа в произвольной системе счисления с базой от 2 до 16 включительно
public class NumberSystem {

    //получение цифры в строков представлении по числу от 0 до 15
    public static String val2Digit(int val) {
        //return null;
     /*   if (val == 10) {
            return "A";
        } else if (val == 11) {
            return "B";
        } else if (val == 12) {
            return "C";
        } else if (val == 13) {
            return "D";
        } else if (val == 14) {
            return "E";
        } else if (val == 15) {
            return "F";
        }
        */
        //---------------------------------------
        switch (val) {
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
        }
        return Integer.toString(val);
    }

    //преобразование числа val к виду в системе счисления с основанием base
    public static String show(int val, int base) {   //функция show - показать
        String result = "";
        while (val > 0) {
            int remainder = val % base;
            result = val2Digit(remainder) + result;
            val /= base;
        }
        if (result.isEmpty())
            return "0";
        //return null;
        return result;
    }

    public static void main(String[] args) {
        int value = 3;
        System.out.println("Десятичная система: " + value);
        System.out.println("Двоичная система: " + NumberSystem.show(value, 2));
        System.out.println("Шестнадцатиричная система: " + NumberSystem.show(value, 16));
    }
}
