package ru.progwards.t15.t15_1;

import java.util.HashMap;

//Добавление и поиск в Map
public class HashMapSimple {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Ivanov1", "Иванов Иван Иванович");
        hashMap.put("student1", "Студентов Ученик Изучаевич");
        hashMap.put("UmnikRD", "Умников Раз Думович");
        hashMap.put("tormoz_dk", "Тормозов Диск Колодкович");
        hashMap.put("Student2", "Студентов Ученик Изучаевич");

        String key = "student1";
        String fio = hashMap.get(key);
        System.out.println("По ключу " + key + " найдено значение: " + fio);
    }
}


//put положить значение