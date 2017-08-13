package com.javarush.task.task04.task0407;

/* 
Кошки во Вселенной
*/

public class Solution {
    public static void main(String[] args) {
        int a = 1;

        Cat cat1 = new Cat();
        //напишите тут ваш код
        Cat.count += a;

        Cat cat2 = new Cat();
        //напишите тут ваш код
        Cat.count += a;

        System.out.println("Cats count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}