package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sa = bufferedReader.readLine();
        String sb = bufferedReader.readLine();

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);

        if (a == b)
            System.out.println(a);
        else if (a < b)
            System.out.println(a);
        else
            System.out.println(b);

    }
}