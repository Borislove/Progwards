package ru.progwards.t3.n3_2;

//статический метод для создания объектов
public class WrapperValueOf {

    public static void main(String[] args) {

        Integer int1 = Integer.valueOf(5);
        Integer int2 = Integer.valueOf("55555");

        System.out.println(int1);
        System.out.println(int2);

        Double doub1 = Double.valueOf(5.0);
        Double doub2 = Double.valueOf(5);
        Double doub3 = Double.valueOf("555.55");

        System.out.println(doub1);
        System.out.println(doub2);
        System.out.println(doub3);

    }
}
