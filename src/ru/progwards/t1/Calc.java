package ru.progwards.t1;

/*Создайте класс с именем Calc в котором разместите функцию main,
 которая выводит информацию на консоль, используя сложение чисел, результат следующих вычислений:

сумму чисел от 0 до 9
сумму чисел 125, 397 и 942
сумму чисел от 396 до 399 */

/*public class Calc {

        public static void main(String[] args) {
            System.out.println(0+1+2+3+4+5+6+7+8+9);
            System.out.println(125+397+942);
            System.out.println(396+397+398+399);
        }
    }*/

public class Calc {

    public static void main(String[] args) {

        int res = 0;
        for (int i = 0; i < 10; i++) {
            res += i;
        }
        System.out.println(res);

        System.out.println(125 + 397 + 942);
        System.out.println(396 + 397 + 398 + 399);
    }
}

