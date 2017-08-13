package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStremReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStremReader);

        String sa = bufferedReader.readLine();
        String sb = bufferedReader.readLine();
        String sc = bufferedReader.readLine();

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);

        if (a == b && a != c)
            System.out.println(3);
        else if (b == c && a != c)
            System.out.println(1);
        else if (c == a && c != b)
            System.out.println(2);
    }
}
