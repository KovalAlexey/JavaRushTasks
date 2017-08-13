package com.javarush.task.task04.task0441;


/* 
Как-то средненько
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

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);

        if (a ==b && b==c)
            System.out.println(a);
        else if (a == b)
            System.out.println(a);
        else if (b == c)
            System.out.println(b);
        else if (c == a)
            System.out.println(a);
        else if (a != b && b != c && c != a)
            System.out.println((a + b + c)/3);

    }
}
