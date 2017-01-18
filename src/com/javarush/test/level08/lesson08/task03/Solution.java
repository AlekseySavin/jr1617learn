package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Simpson01", "Bart01");
        map.put("Simpson01", "Bart01");
        map.put("Simpson03", "Bart01");
        map.put("Simpson04", "Bart01");
        map.put("Simpson05", "Bart01");
        map.put("Simpson06", "Bart06");
        map.put("Simpson01", "Bart07");
        map.put("Simpson08", "Bart08");
        map.put("Simpson01", "Bart09");
        map.put("Simpson10", "Bart10");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код

        int fncount = 0;

        for (String value : map.values()) {
            if (value.equals(name)) {
                fncount++;
            }
        }




        return fncount;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int lncount = 0;

        for (String key : map.keySet()) {
            if (key.equals(lastName)) {
                lncount++;
            }
        }

        return lncount;

    }

//    --Debug
//    public static void main(String[] args) throws Exception {
//
//        System.out.println("Name Bart01: " + getCountTheSameFirstName(createMap(), "Bart01"));
//        System.out.println("LName Simpson01: " + getCountTheSameLastName(createMap(), "Simpson01"));
//
//    }
}
