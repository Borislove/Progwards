package ru.progwards.t15.i15;

import java.util.Map;

/*Создайте метод с сигнатурой int fillHoles(Map<Integer, String> map, int size),
который вставляет в HashMap пару <n> "Число n", если она там отсутствует,
 Проверить от 1 до максимального числа size включительно. Метод возвращает количество добавленных элементов.
 Пример пары: 1 "Число 1"

*/
public class Example_1 {
    int fillHoles(Map<Integer, String> map, int size){
        int res = 0;
        for (int i = 1; i <= size; i++){
            if (map.putIfAbsent(i, "Число " + i) == null){
                res ++;
            }
        }
        return res;
    }
}
