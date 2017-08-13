package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sa = bufferedReader.readLine();
        String sb = bufferedReader.readLine();
        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);

        for (int i = 0; i < a; i++){
            for (int c = 0; c < b; c++)
                System.out.print("8");
            System.out.println();


        }


    }
}
