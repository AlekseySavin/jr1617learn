package com.javarush.test.level04.lesson07.task01;

/* Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer val = Integer.parseInt(reader.readLine());

        //stroke
        String chet = "четное";
        String nche = "нечетное";
        String otri = "отрицательное";
        String polo = "положительное";
        String nule = "нулевое";
        String out = "";

        //bool

        if (val > 0) {
            out = ""+ polo;
        }

        if (val < 0) {
            out = "" + otri;
        }

        if ((val % 2) ==0) {
            out = out + " " + chet;
        }

        if ((val % 2)!=0){
            out = out + " " + nche;
        }

        if (val == 0) {
            out = nule;
        }

        out = out + " " + "число";

        System.out.println(out);

    }
}
