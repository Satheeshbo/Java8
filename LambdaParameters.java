package com.java8;
interface Addable{
    int addition(int a, int b);
}
class Addableimpl implements Addable{
    @Override
    public int addition(int a, int b) {
        return (a+b);
    }
}
public class LambdaParameters {
    public static void main(String[] args){
    /*Addable addable=(a, b)->(a+b);
    int result= addable.addition(10, 20);
    System.out.println(result);*/
    //LE with multiple statements
    Addable addable= (a,b)->{
        int c=a+b;
        return c;
    };
    int c= addable.addition(10,20);
    System.out.println(c);
    }
}

