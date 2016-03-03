package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        ArrayList<String> arrayListOfLength = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++){
            stringArrayList.add(reader.readLine());
        }

        int minLength = stringArrayList.get(0).length();

        for (int i = 0; i < stringArrayList.size(); i++){
            if (stringArrayList.get(i).length() < minLength) {
                minLength = stringArrayList.get(i).length();
                arrayListOfLength.clear();
                arrayListOfLength.add(stringArrayList.get(i));
            } else if (stringArrayList.get(i).length() == minLength) {
                arrayListOfLength.add(stringArrayList.get(i));
            }
        }
        for (int i = 0; i < arrayListOfLength.size(); i++){
            System.out.println(arrayListOfLength.get(i));
        }


    }
}
