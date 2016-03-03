package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();

        int nA = Integer.parseInt(a);
        int nB = Integer.parseInt(b);
        int nC = Integer.parseInt(c);
        int mid = 0;
        int max = 0;
        int min = 0;

        if (nA >= nB && nA >= nC)
        {
            max = nA;
            if (nB >= nC)
            {
                mid = nB;
                min = nC;
            }
            else
            {
                mid = nC;
                min = nB;
            }
        } else if (nB >= nA && nB >= nC)
        {
            max = nB;
            if (nA >= nC)
            {
                mid = nA;
                min = nC;
            }
            else
            {
                mid = nC;
                min = nA;
            }
        } else if (nC >= nB && nC >= nA)
        {
            max = nC;
            if (nA >= nB)
            {
                mid = nA;
                min = nB;
            }
            else
            {
                mid = nB;
                min = nA;
            }
        }
        System.out.print(max + " " + mid + " " + min);

    }


}
