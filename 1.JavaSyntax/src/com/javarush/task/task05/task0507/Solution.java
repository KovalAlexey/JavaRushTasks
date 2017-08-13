package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sa = bufferedReader.readLine();
        int a = 0;
        int count = 0;
        double sum = 0;

        while(a !=- 1){
            a = Integer.parseInt(sa);
            sum += a;
            count++;
        }
        double avr = (sum + 1) / (count - 1);
        System.out.println(avr);
    }
    }

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        int count = 0;
        double sum = 0;

        while (i != -1) {
            i = Integer.parseInt(br.readLine());
            sum += i;
            count++;
        }
        double avg = (sum+1) / (count-1);
        System.out.println(avg);
    }
}