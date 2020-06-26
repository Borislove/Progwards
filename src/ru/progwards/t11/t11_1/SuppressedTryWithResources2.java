package ru.progwards.t11.t11_1;

import java.io.IOException;

//Подавленные исключения от разных объектов
public class SuppressedTryWithResources2 {
    public static void doAlwaysExceptions() throws Exception {
        try(AlwaysExceptions ae1 = new AlwaysExceptions(1);AlwaysExceptions ae2 = new AlwaysExceptions(2)){
            ae1.method();
            ae2.method();
        }
    }

    public static void main(String[] args) {
        try{
            doAlwaysExceptions();
        }catch (Throwable e){
            System.out.println(e.getMessage());
            for(Throwable t: e.getSuppressed())
                System.out.println(t.getMessage() +"(подавленное)");
        }
    }
}
