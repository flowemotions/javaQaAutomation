package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstValue = reader.readLine();
        String endValue = reader.readLine();
        int nFirstValue = Integer.parseInt(firstValue);
        int nEndValue = Integer.parseInt(endValue);
        if (nFirstValue > nEndValue) {
            System.out.println(nEndValue);
        } else {
            System.out.println(nFirstValue);
        }
    }
}