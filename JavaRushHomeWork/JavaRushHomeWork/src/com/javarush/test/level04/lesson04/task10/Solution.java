package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //read from KB
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        //transfer to int
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        int numC = Integer.parseInt(c);

        pairExist(numA, numB, numC);
    }

    public static void pairExist(int a, int b, int c)
    {
        if ((a == b) && (a == c)){
            System.out.println(a + " " + b + " " + c);
        } else {
            if ((a == b))
            {
                System.out.println(a + " " + b);
            } else if ((b == c))
            {
                System.out.println(b + " " + c);
            } else if ((a == c))
            {
                System.out.println(a + " " + c);
            }
        }
    }
}