package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
//    public static int count = 0;

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();

        int nA = Integer.parseInt(a);
        int nB = Integer.parseInt(b);
        int nC = Integer.parseInt(c);
        int count = 0;

//        countPositive(nA);
//        countPositive(nB);
//        countPositive(nC);

        if (nA > 0) {count++;}
        if (nB > 0) {count++;}
        if (nC > 0) {count++;}

        System.out.println(count);

    }

//    public static void countPositive(int a) {
//        if (a > 0) {
//            count++;
//        }
//    }
}
