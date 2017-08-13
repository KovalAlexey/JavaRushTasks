package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
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


        if (sa.equals(sb))
            System.out.println("Имена идентичны");
        else if (sa.length()==sb.length())
            System.out.println("Длины имен равны");

    }
}
