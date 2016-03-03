package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        ArrayList<Integer> tripleValues = new ArrayList<Integer>();
        ArrayList<Integer> doubleValues = new ArrayList<Integer>();
        ArrayList<Integer> restValues = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++){
            integerArrayList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < integerArrayList.size(); i++){
            if ((integerArrayList.get(i) % 3 == 0) && (integerArrayList.get(i) % 2 == 0)){
                tripleValues.add(integerArrayList.get(i));
                doubleValues.add(integerArrayList.get(i));
            } else if (integerArrayList.get(i) % 3 == 0){
                tripleValues.add(integerArrayList.get(i));
            } else if (integerArrayList.get(i) % 2 == 0){
                doubleValues.add(integerArrayList.get(i));
            }
            if ((integerArrayList.get(i) % 3 != 0) && (integerArrayList.get(i) % 2 != 0))
            {
                restValues.add(integerArrayList.get(i));
            }
        }

        printList(tripleValues);
        printList(doubleValues);
        printList(restValues);
    }
    public static void printList(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
