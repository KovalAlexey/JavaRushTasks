package com.javarush.task.task04.task0414;

/*
Количество дней в году
*/

        import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String ch = bufferedReader.readLine();
        int a = Integer.parseInt(ch);

        int d = a % 4;
        int b = a % 100;
        int c = a % 400;
        int day;

        if (d==0 && b==0 && c==0)
            System.out.println("количество дней в году: 366");
        else if (d==0 && b==0 && c!=0)
            System.out.println("количество дней в году: 365");
        else if (d!=0 && b!=0 && c!=0)
            System.out.println("количество дней в году: 365");
        else if (d==0 && b!=0 && c!=0)
            System.out.println("количество дней в году: 366");




    }

    }




