package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
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
        String sc = bufferedReader.readLine();
        String sd = bufferedReader.readLine();

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);
        int d = Integer.parseInt(sd);

        if (bigger(a, b)==bigger(c, d))
            System.out.println(a);
        else
        System.out.println(bigger(bigger(a,b),bigger(c, d)));

    }

     public static int bigger(int a, int b) {
        int e;
        if(a > b)
            e = a;
        else
            e = b;
        if (a==b)
            e = a;
        return e;


    }
}
