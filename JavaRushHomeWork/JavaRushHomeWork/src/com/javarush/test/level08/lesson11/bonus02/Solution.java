package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> cities = new ArrayList<String>();
        List<String> families = new ArrayList<String>();

        while (true){
            String cityValue = reader.readLine();
            if (cityValue.isEmpty()) {
                break;
            }

            String familyValue = reader.readLine();
            if (familyValue.isEmpty()){
                cities.remove(cities.lastIndexOf(cities));
                break;
            }

            cities.add(cityValue);
            families.add(familyValue);
        }
        //enter search city
        String houseCity = reader.readLine();
        for (int i = 0; i < cities.size(); i++){
            if (cities.get(i).equals(houseCity)){
                System.out.println(families.get(i));
            }
        }
    }
}
