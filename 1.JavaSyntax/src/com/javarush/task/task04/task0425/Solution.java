package com.javarush.task.task04.task0425;

/* 
Цель установлена!
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

        if (a>0 && b>0)
            System.out.println(1);
        else if (a<0 && b>0)
            System.out.println(2);
        else if (a<0 && b<0)
            System.out.println(3);
        else if (a>0 && b<0)
            System.out.println(4);
    }
}
