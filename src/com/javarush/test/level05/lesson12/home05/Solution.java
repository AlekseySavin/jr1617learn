package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String in = "";
        int num = 0;
        int out = 0;

        while (!in.equals("сумма"))
        {
            in = reader.readLine();
            if (!in.equals("сумма"))
            {
                num = Integer.parseInt(in);
                out = out + num;
            }
            else break;
        }
        System.out.println(out);


    }
}
