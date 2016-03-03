package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Введите количество строк, чтобы заполнить ими список");
        int counterN = Integer.parseInt(reader.readLine());
        //System.out.println("Переставить M первых строк в конец списка");
        int quantityM = Integer.parseInt(reader.readLine());

        ArrayList<String> stringArrayList = new ArrayList<String>();
        //System.out.println("Вводим " + counterN + " строк");
        for (int i = 0; i < counterN; i++){
            stringArrayList.add(reader.readLine());
        }

        for (int i = 0; i < quantityM; i++){
                stringArrayList.add(stringArrayList.get(0));
                stringArrayList.remove(0);
        }
        for (int i = 0; i < stringArrayList.size(); i++){
            System.out.println(stringArrayList.get(i));
        }
    }
}
