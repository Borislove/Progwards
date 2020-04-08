package ru.progwards.t6.t6_2;

//Сравнение Object...
public class ObjectsCompare {

    public static void main(String[] args) {

        Object obj1 = new Object(); //создали объект и пустой конструктор
        Object obj2 = new Object();

        System.out.println(obj1 == obj2); //сравнение
        System.out.println(obj1.equals(obj2)); //через функцию

        obj2 = obj1; //объект 2 ссылается на объект 1

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));
    }
}
