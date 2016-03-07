package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String enteredMonth = reader.readLine();
        System.out.println(enteredMonth + " is " + returnMonthNumber(enteredMonth, monthMap()) + " month");
    }

    public static HashMap<String, Integer> monthMap(){
        HashMap<String, Integer> monthHashMap = new HashMap<>();
        monthHashMap.put("January", 1);
        monthHashMap.put("February", 2);
        monthHashMap.put("March", 3);
        monthHashMap.put("April", 4);
        monthHashMap.put("May", 5);
        monthHashMap.put("June", 6);
        monthHashMap.put("July", 7);
        monthHashMap.put("August", 8);
        monthHashMap.put("September", 9);
        monthHashMap.put("October", 10);
        monthHashMap.put("November", 11);
        monthHashMap.put("December", 12);
        return monthHashMap;
    }

    public static int returnMonthNumber(String monthName, HashMap<String, Integer> map){

        Iterator <Map.Entry<String, Integer>> mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()){
            Map.Entry<String, Integer> pair = mapIterator.next();
            if (pair.getKey().equals(monthName))
            {
                return pair.getValue();
            }
        } return 1;
    }

}
