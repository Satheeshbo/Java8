package com.java8;
class ThreadDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("run() method called");
    }
}
public class RunnableLambda {
    public static void main(String[] args){
        //Traditional Programming
        Thread thread= new Thread(new ThreadDemo());
        thread.start();
        //LE implementing the Runnable Functional Interface
        /* Runnable runnable=()-> System.out.println("run() method called using Lambda");
        Thread threadLambda= new Thread(runnable);
        threadLambda.start();*/
        //LE as parameter to the Constructor
        Thread threadLambda= new Thread(()-> System.out.println("run() method called using Lambda"));
        threadLambda.start();
    }
}
