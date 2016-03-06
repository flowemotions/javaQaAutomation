package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        ArrayList<String> values = new ArrayList<String>(map.values());
        for (String a : values)
        {
            int count = 0;
            for (int i = 0; i < values.size(); i++)
            {
                if (a.equals(values.get(i))){
                    count++;
                }
                if (count > 1){
                    removeItemFromMapByValue(map, a);
                }
            }

        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}