package com.java8.methodref;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
@FunctionalInterface
interface Printable {
    void print(String msg);
}
public class MethodReferencesDemo {
    public void display(String msg) {
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static int addition(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(4));
        Function<Integer, Double> functionMethodRef = Math::sqrt;
        System.out.println(functionMethodRef.apply(4));
        //Method Reference to static method of a class
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> MethodReferencesDemo.addition(a, b);
        System.out.println(biFunction.apply(10, 20));
        BiFunction<Integer, Integer, Integer> biFunctionMethodRef = MethodReferencesDemo::addition;
        System.out.println(biFunctionMethodRef.apply(10, 20));
        //Method Reference to an instance method of an object
        MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();
        Printable printable = (msg) -> methodReferencesDemo.display(msg);
        printable.print("hello world!");
        Printable printableMethodRef = methodReferencesDemo::display;
        printableMethodRef.print("Hello World!");
        //Method Reference to an instance method of an arbitrary object
        //We use this when we use a method of an argument of LE. toLowerCase() is a method of "input" argument.
        Function<String, String> stringFunction = (String input) -> input.toLowerCase();
        System.out.println(stringFunction.apply("Java Guides"));
        Function<String, String> stringFunctionMethodRef = String::toLowerCase;
        System.out.println(stringFunctionMethodRef.apply("JAVA GUIDES"));
        //Method Reference to an instance method of an arbitrary object
        String[] strArray = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};
        Arrays.sort(strArray, (s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.print("Sorted Array: ");
        for (String str : strArray) {
            System.out.print(str);
        }
        Arrays.sort(strArray, String::compareToIgnoreCase);
        System.out.print("\nSorted Array: ");
        for (String str : strArray) {
            System.out.print(str);
        }
        //Method Reference to a Constructor
        List<String> fruits= new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        Function<List<String>, Set<String>> setFunction= (fruitsList)-> new HashSet<>(fruitsList);
        System.out.println();
        System.out.println(setFunction.apply(fruits));
        Function<List<String>, Set<String>> setFunctionMethodRef= HashSet::new;
        System.out.println(setFunctionMethodRef.apply(fruits));
    }
}
