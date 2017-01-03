package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую, ячейку массива чисел записать длину строки из массива строк
индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String slist[] = new String[10];
        int ilist[] = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i < slist.length; i++) {
            slist[i] = reader.readLine();
        }

        for (int j=0; j < slist.length; j++) {
            int len = slist[j].length();
            ilist[j]= len;
        }

        for (int k=0; k < ilist.length; k++) {
            System.out.println(ilist[k]);
        }
    }
}
