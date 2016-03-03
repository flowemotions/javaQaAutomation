package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fisrtV = reader.readLine();
        String secondV = reader.readLine();
        String thirdV = reader.readLine();
        String forthV = reader.readLine();
        int nFirstV = Integer.parseInt(fisrtV);
        int nSecondV = Integer.parseInt(secondV);
        int nThirdV = Integer.parseInt(thirdV);
        int nForthV = Integer.parseInt(forthV);
        if (maxValue(nFirstV, nSecondV) > maxValue(nThirdV, nForthV)) {
            System.out.println(maxValue(nFirstV, nSecondV));
        } else System.out.println(maxValue(nThirdV, nForthV));
    }

    public static int maxValue (int a, int b){
        if (a > b) {
            return a;
        } else return b;
    }
}
