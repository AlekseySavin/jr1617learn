package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import com.javarush.test.level06.lesson08.task05.StringHelper;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String color;
        String name;
        String family;
        String adress;
        char gender;
        int age;

        Human (String color, String name, String family, String adress, char gender, int age) {
            color = this.color;
            name = this.name;
            family = this.family;
            adress = this.adress;
            gender = this.gender;
            age = this.age;
        }

        Human (String name) {
            name = this.name;
        }

        Human (String family, String color) {
            color = this.family;
            family = this.family;
        }

        Human (String adress, char gender) {
            gender = this.gender;
            adress = this.adress;
        }

        Human (char gender, int age) {
            age = this.age;
            gender = this.gender;
        }
        //6
        Human (int age, String family) {
            age = this.age;
            family = this.family;
        }
        //7
        Human (String name, String family, int age) {
            name = this.name;
            family = this.family;
            age = this.age;
        }
        //8
        Human (char gender, String family, String name) {
            gender = this.gender;
            family = this.family;
            name = this.name;
        }
        //9
        Human (String adress, String name, String family, int age) {
            adress = this.adress;
            name = this.name;
            family = this.family;
            age = this.age;
        }
        //10
        Human (String color, int age) {
            color = this.color;
            age = this.age;
        }
    }
}
