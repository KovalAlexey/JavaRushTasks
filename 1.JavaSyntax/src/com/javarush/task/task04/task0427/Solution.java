package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sa = bufferedReader.readLine();

        int a = Integer.parseInt(sa);


        int ia = sa.length();

        if (a >= 1 && a <= 999) {
            if (a % 2 == 0)
                System.out.print("четное ");
            else
                System.out.print("нечетное ");

            if (ia == 1)
                System.out.println("однозначное число");
            if (ia == 2)
                System.out.println("двузначное число");
            if (ia == 3)
                System.out.println("трехзначное число");
        }
    }
    }
