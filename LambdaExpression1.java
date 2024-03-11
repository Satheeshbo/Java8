package com.java8;

interface Shape1 {
    void draw();
}
/*class Rectangle implements Shape1 {
    @Override
    public void draw() {
        System.out.println("Rectangle class: draw() method");
    }
}*/

/*class Circle implements Shape1 {
    @Override
    public void draw() {
        System.out.println("Circle class: draw() method");
    }
}*/
public class LambdaExpression1 {
    public static void main(String[] args){
        //Lambda Expression implementing the Shape Functional Interface
        Shape1 rectangle= () -> System.out.println("Rectangle class: draw() method");
        rectangle.draw();
        Shape1 circle=()-> System.out.println("Circle class: draw() method");
        circle.draw();

    }

}
