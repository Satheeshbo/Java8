package com.java8;
interface Shape2{
    void draw();
}
public class LambdaExpression2 {
    public static void main(String[] args) {
        Shape2 rectangle2 = () -> System.out.println("Rectangle class: draw() method");
        Shape2 circle2 = () -> System.out.println("Circle class: draw() method");
        //LE reference variable as method parameter
        print(rectangle2);
        print(circle2);
    }
    private static void print(Shape2 shape2){
        shape2.draw();
    }
}
