package ru.progwards.t13.i_13;

import java.util.Comparator;
import java.util.TreeSet;

/*Определен класс

    class User {
        public Integer id;
        public String name;
        User (Integer id, String name) {
            this.id = id;
            this.name = name;
        }
    }

Создайте метод с сигнатурой public TreeSet<User> createSet() который создает и возвращает TreeSet так,
что бы пользователи оказались упорядочены по убыванию id/*
 */

//Нужно создать TreeSet, передав в конструктор Comparator, переопределив метод compare для класса User

//Используйте Integer.compare, для сравнения id, только с небольшим дополнением
public class User {
    public Integer id;
    public String name;

    User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public TreeSet<User> createSet() {
        TreeSet<User> users = new TreeSet<User>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o2.id, o1.id);

            }
        });
        return users;
    }
}

