package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        String a = reader.readLine();
        int numA = Integer.parseInt(a);
        if (numA > 0) {
            numA = numA * 2;
        } else {
            numA = numA + 1;
        }
        System.out.println(numA);
    }

}