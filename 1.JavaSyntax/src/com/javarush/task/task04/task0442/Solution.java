package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sa = bufferedReader.readLine();
        int a = 0;
        int sum = 0;

        while (a!=-1){
            sum += a;
            a = Integer.parseInt(sa);
        }
        System.out.println(sum);
    }
}
package com.javarush.task.task04.task0442;



