package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer a = Integer.parseInt(reader.readLine());
        Integer b = Integer.parseInt(reader.readLine());
        Integer c = Integer.parseInt(reader.readLine());
        Integer out = 0;
//если а больше б и а меньше с или а больше с и меньше б
        if (((a > b) && (c > a)) || (a > c) && (a < b)) {
            out = a;
        }
        //если б больше а и б меньше с или б больше с и меньше а
        if (((b > a) && (b < c)) || ((b > c) && (b<a))) {
            out = b;
        }
        //если c больше а и с меньше б или с больше б и меньше а
        if (((c > a) && (c < b)) || ((c>b) && (c < a))) {
            out = c;
        }

        System.out.println(out);
    }
}
