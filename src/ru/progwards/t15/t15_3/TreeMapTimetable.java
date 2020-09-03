package ru.progwards.t15.t15_3;

import java.util.Map;
import java.util.TreeMap;

//Расписание при помощи TreeMap
public class TreeMapTimetable {
    public static void main(String[] args) {
        Map<String, String> treeMap = new TreeMap<>();

        treeMap.put("08:00", "Утренняя пробежка");
        treeMap.put("13:00", "Забрать машину из сервиса");
        treeMap.put("09:00", "Завтрак");
        treeMap.put("15:00", "Обед");
        treeMap.put("19:30", "Ужин");
        treeMap.put("20:30", "Просмотр фильма");
        treeMap.put("23:00", "Сон");
        treeMap.put("10:00", "Занятия: слушать лекции");
        treeMap.put("16:00", "Занятия: сделать ДЗ");
        treeMap.put("19:15", "Занятия: консультация");
        treeMap.put("14:00", "Прогулка");

        for (var entry : treeMap.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}
