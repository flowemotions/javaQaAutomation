package com.javarush.test.level08.lesson08.task02;

import java.security.KeyStore;
import java.util.*;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args)
    {
        removeAllNumbersMoreThan10(createSet());
    }
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> stringSet = new HashSet<>();
        for (int i = 0; i < 20; i++){
            stringSet.add(i+1);
        }
        return stringSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
       Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            int a = iterator.next();
            if (a > 10)
                iterator.remove();
        }
        return set;
    }
}
