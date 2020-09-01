package ru.progwards.t15.t15_1;

import java.util.Hashtable;

//Hashtable и null
public class HashtableVsNull {
    public static void main(String[] args) {
        Hashtable<Integer , String> hashtable = new Hashtable<>();

        try{
            hashtable.put(null,"Значение");
        }catch (Throwable t) {
            System.out.println(t);
        }

        try{
            hashtable.put(1, null);
        }catch (Throwable t){
            System.out.println(t);
        }
    }
}


//java.lang.NullPointerException
//не умеет работать с null