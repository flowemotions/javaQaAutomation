package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int nA = Integer.parseInt(a);
        int nB = Integer.parseInt(b);
        int nC = Integer.parseInt(c);

        if ((nA != maxValue(nA, nB, nC)) && (nA != minValue(nA, nB, nC))) {
            System.out.println(nA);
        } else if ((nB != maxValue(nA, nB, nC)) && (nB != minValue(nA, nB, nC))) {
            System.out.println(nB);
        } else {
            System.out.println(nC);
        }
    }

    public static int minValue (int a, int b, int c){
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
    public static int maxValue (int a, int b, int c){
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
