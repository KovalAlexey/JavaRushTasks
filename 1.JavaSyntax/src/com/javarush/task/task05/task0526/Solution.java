package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Valera", 10, "Kiev");
        Man man2 = new Man("Alex", 20, "Odessa");
        Woman girl1 = new Woman("Sveta", 12,  "Dnepr");
        Woman girl2 = new Woman("Angelika", 20, "Kiev");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(girl1.name + " " + girl1.age + " " + girl1.address);
        System.out.println(girl2.name + girl2.age + " " + girl2.address);
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }
    public static class Woman {
        String name = null;
        int age = 0;
        String address = null;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
