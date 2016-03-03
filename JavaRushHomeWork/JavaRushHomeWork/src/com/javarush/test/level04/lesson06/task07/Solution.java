package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();
        String third = reader.readLine();

        int nFirst = Integer.parseInt(first);
        int nSecond = Integer.parseInt(second);
        int nThird = Integer.parseInt(third);

        if ((nFirst != nSecond) && (nFirst != nThird)) {
            System.out.println(1);
        } else if ((nSecond != nThird) && (nSecond != nFirst)) {
            System.out.println(2);
        } else if ((nThird != nFirst) && (nThird != nSecond))
        {
            System.out.println(3);
        }
    }
}
