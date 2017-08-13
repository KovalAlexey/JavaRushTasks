package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    private int top, left, width, height = 0;
    public Rectangle (int top, int left, int width, int height){
        this.height = height;
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
    }
    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
    }
    public Rectangle(Rectangle rectangle){
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.left = rectangle.left;
        this.height = rectangle.height;
    }

    public static void main(String[] args) {

    }
}
