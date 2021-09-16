package ru.progwards.t2;

//Локальные переменные
public class VarArea {
    static void function1(){
        String c = "Переменная \"c\" видна только в function1";
    }

    static void function2(){
        String d = "Переменная \"d\" видна только в function2";
    }

    static void function3(){
        String e = "Переменная \"e\" видна только в function3";
    }

    static void function4(){
        System.out.println("В функции function4 нет переменных");
    }

    public static void main(String[] args) {
        String a = "Переменная \"a\" видна только в main";
        String b = "Переменная \"b\" видна только в main";

        System.out.println(a);
    }
}
