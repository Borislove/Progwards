package ru.progwards.t15.t15_1;

//Интерфейс Map.Entry
public interface Entry <K,V>{
    K getKey();  //получить ключ
    V getValue(); // получить значение (элемент)
    V setValue(V value); //установить значение
    boolean equals(Object o);
    int hashCode();
}
