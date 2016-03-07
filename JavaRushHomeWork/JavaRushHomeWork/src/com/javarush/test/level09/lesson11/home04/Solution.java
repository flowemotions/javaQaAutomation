package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM d, yyyy", myDateFormatSymbols);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        String strTime = simpleDateFormat.format(new Date(reader.readLine()));
        System.out.println(strTime.toUpperCase());
    }

    /*private static DateFormatSymbols myDateFormatSymbols = new DateFormatSymbols()
    {

        @Override
        public String[] getMonths()
        {
            return new String[]{"JAN", "FEB", "MAR", "APR", "MAY", "JUN",
                    "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        }
    };*/


}
