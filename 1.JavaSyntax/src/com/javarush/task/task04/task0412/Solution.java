package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
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

        if (a > 0)
            System.out.println(a * 2);
        if (a < 0)
            System.out.println(a + 1);
        if (a == 0)
            System.out.println(0);


    }

}