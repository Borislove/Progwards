package ru.progwards.t15.t15_1;

import java.util.HashMap;
import java.util.Map;

//Редактирование значения
public class HashMapEdit {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Ivanov1", "Иванов Иван Иванович");
        hashMap.put("student1", "Студентов Ученик Изучаевич");
        hashMap.put("UmnikRD", "Умников Раз Думович");
        hashMap.put("tormoz_dk", "Тормозов Диск Колодкович");
        hashMap.put("Student2", "Студентов Ученик Изучаевич");

        hashMap.put("Student2", "Студентов Студент Студентович");

        for (Map.Entry<String, String> entry : hashMap.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}
