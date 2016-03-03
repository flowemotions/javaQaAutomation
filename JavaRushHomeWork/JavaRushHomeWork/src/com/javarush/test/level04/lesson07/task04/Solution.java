package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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
        int positive = 0;
        int negative = 0;
        int zero = 0;

        if (nA == 0) {zero++;} else if (nA < 0){negative++;} else {positive++;}
        if (nB == 0) {zero++;} else if (nB < 0){negative++;} else {positive++;}
        if (nC == 0) {zero++;} else if (nC < 0){negative++;} else {positive++;}

        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);
    }
}
