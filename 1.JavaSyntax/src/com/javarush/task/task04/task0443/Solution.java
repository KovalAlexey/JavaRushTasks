package com.javarush.task.task04.task0443;


/*
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String name = reader.readLine();
        String syear = reader.readLine();
        String smounth = reader.readLine();
        String sday = reader.readLine();

        int day = Integer.parseInt(sday);
        int mounth = Integer.parseInt(smounth);
        int year = Integer.parseInt(syear);

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + day + "." + mounth + "." + year );



    }
}
