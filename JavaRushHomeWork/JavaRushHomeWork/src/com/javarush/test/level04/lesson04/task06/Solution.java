package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        String dayOfTheWeek = reader.readLine();
        int numDay = Integer.parseInt(dayOfTheWeek);

        if (numDay == 1) {
            System.out.println("понедельник");
        } else if (numDay == 2) {
            System.out.println("вторник");
        } else if (numDay == 3) {
            System.out.println("среда");
        } else if (numDay == 4) {
            System.out.println("четверг");
        } else if (numDay == 5) {
            System.out.println("пятница");
        } else if (numDay == 6) {
            System.out.println("суббота");
        } else if (numDay == 7) {
            System.out.println("воскресенье");
        } else if (numDay < 1 || numDay > 8){
            System.out.println("такого дня недели не существует");
        }
    }
}