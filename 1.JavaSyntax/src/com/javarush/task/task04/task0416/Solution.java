package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //час содержит 12 отрезков (3+1+1)
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String st = bufferedReader.readLine();
        double t = Double.parseDouble(st);

        double a = t % 5;

        if (a >=0 && a<3)
            System.out.println("зелёный");
        else if (a>=3 && a<4)
            System.out.println("желтый");
        else if (a>=4 && a<=5)
            System.out.println("красный");






    }
}