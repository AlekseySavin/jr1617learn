package com.javarush.test.level06.lesson11.bonus02;

import java.io.IOException;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
    //    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat daCat = new Cat("дедушка Вася");
        Cat baCat = new Cat("бабушка Мурка");
        Cat paCat = new Cat("папа Котофей", daCat,null);
        Cat moCat = new Cat("мама Василиса", null, baCat);
        Cat soCat = new Cat("сын Мурчик", paCat, moCat);
        Cat doCat = new Cat("дочь Пушинка", paCat, moCat);

        System.out.println(daCat);
        System.out.println(baCat);
        System.out.println(paCat);
        System.out.println(moCat);
        System.out.println(soCat);
        System.out.println(doCat);
    }

    public static class Cat
    {
        private String name;
        private Cat parentPa;
        private Cat parentMa;

        Cat (String name) {
            this.name = name;
        }

        Cat(String name, Cat parentPa, Cat parentMa)
        {
            this.name = name;
            this.parentPa = parentPa;
            this.parentMa = parentMa;
        }

        @Override
        public String toString()
        {
            if ((parentPa == null) && (parentMa == null))
                return "Cat name is " + name + ", no mother, no father";
            if ((parentPa == null) && (parentMa != null))
                return "Cat name is " + name + ", mother is " + parentMa.name  + ", no father";
            if ((parentPa != null) && (parentMa == null))
                return "Cat name is " + name + ", no mother" + ", father is " + parentPa.name;
            else
                return "Cat name is " + name + ", mother is " + parentMa.name + ", father is " + parentPa.name;
        }
    }

}
