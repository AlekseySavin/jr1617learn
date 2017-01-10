package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
        //напишите тут ваш код
        int[] sorted = new int[array.length];
        sorted[0] = 0;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < sorted.length; j++)
            {
                if (array[i] >= sorted[i])
                {
                    sorted[i] = array[i];
                }
                if (array[i] <= sorted[i])
                {
                    sorted[i] = array[i];
                }
            }
        }
    }
}
