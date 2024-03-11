package com.java8;
interface Shape3{
    void draw();
}
public class LambdaExpression3 {
public static void main(String[] args){
    //LE as Method Parameter aka LE as a behaviour to the method
    print(()-> System.out.println("Rectangle class: draw() method"));
    print(()-> System.out.println("Circle class: draw() method"));
    }
    public static void print(Shape3 shape3){
    shape3.draw();
    }
}
