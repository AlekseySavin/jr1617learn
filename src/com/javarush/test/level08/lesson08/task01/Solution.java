package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        HashSet<String> seto = new HashSet<String>();

        seto.add("ЛАМПА");
        seto.add("ЛЮСТРА");
        seto.add("ЛАПА");
        seto.add("ЛАСТА");
        seto.add("ЛАВА");

        seto.add("ЛАДА");
        seto.add("ЛАЗЕР");
        seto.add("ЛАНДЫШ");
        seto.add("ЛОКОТЬ");
        seto.add("ЛЯМБДА");

        seto.add("ЛЕНТА");
        seto.add("ЛЕТО");
        seto.add("ЛИСТ");
        seto.add("ЛИГА");
        seto.add("ЛИГАЛАЙЗ");

        seto.add("ЛЕВЕЛ");
        seto.add("ЛАГ");
        seto.add("ЛУГ");
        seto.add("ЛЕСКА");
        seto.add("ЛЫБАЛКА");

        return seto;

    }
}
