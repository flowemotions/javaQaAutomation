package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> stringSet = new HashSet<>();
        for (int i = 0; i < 20; i++)
        {
            stringSet.add("л" + i);
        }
        return stringSet;
    }
}
