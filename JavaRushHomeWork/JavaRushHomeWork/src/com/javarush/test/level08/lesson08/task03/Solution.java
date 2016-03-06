package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("Иванов", "Иван");
        stringHashMap.put("Петров", "Петр");
        stringHashMap.put("Сидоров", "Сидор");
        stringHashMap.put("Степанов", "Петр");
        stringHashMap.put("Александров", "Сидор");
        stringHashMap.put("Алексеев", "Иван");
        stringHashMap.put("Владимиров", "Иван");
        stringHashMap.put("Никитов", "Петр");
        stringHashMap.put("Соловьев", "Сидор");
        stringHashMap.put("Васильев", "Василий");
        return stringHashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int counter = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getValue().equals(name)){
                counter++;
            }
        }
        return counter;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int counter = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
           if (pair.getKey().equals(lastName)){
                counter++;
           }
        }
        return counter;
    }
}
