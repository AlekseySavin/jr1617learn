package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        Cat catDe = new Cat("дедушка Вася");
        Cat catBa = new Cat("бабушка Мурка");
        Cat catPa = new Cat("папа Котофей", catDe, null);
        Cat catMa = new Cat("мама Василиса", null,catBa);
        Cat catSi = new Cat("сын Мурчик", catPa, catMa);
        Cat catDo = new Cat("дочь Пушинка", catPa, catMa);

        System.out.println(catDe);
        System.out.println(catBa);
        System.out.println(catPa);
        System.out.println(catMa);
        System.out.println(catSi);
        System.out.println(catDo);
    }

    public static class Cat
    {
        private String name;
        private Cat parentPa;
        private Cat parentMa;

        Cat(String name)
        {
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
            else if ((parentMa == null) && (parentPa != null)) {
                return "Cat name is " + name + ", no mother" + ", father is " + parentPa.name;
        }
            else if ((parentMa != null) && (parentPa == null)) {
                return "Cat name is " + name + ", mother is " + parentMa.name + ", no father";
            }
            else
                return "Cat name is " + name + ", mother is " + parentMa.name + ", father is " + parentPa.name;
        }
    }

}
