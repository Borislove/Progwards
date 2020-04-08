package ru.progwards.t9.t9_2;

//Примитив как параметр
public class PrimAsParam {

    static void primAsParam(int i) {
        i = 555;
        System.out.println("primAsParam i = " + i);
    }

    public static void main(String[] args) {
        int i = 999;
        System.out.println("main before i = " + i);
        primAsParam(i);
        System.out.println("main after i = " + i);
    }
}


//Стек до вызова primAsParam
//(переменная i) 999

//Стек при вызове primAsParam
//(параметра i) 999
//(переменная i) 999

//Стека после исполнения i=555 в primAsParam
//(параметр i ) 555
//(переменная i) 999

//Стек после завершения primAsParam
//(переменная i) 999