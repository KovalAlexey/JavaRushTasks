package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String s = bufferedReader.readLine();
        String sa = bufferedReader.readLine();

        int a = Integer.parseInt(sa);
        int i = 0;

        while (a!=i) {
            a--;
            System.out.println(s);
        }
    }
}
