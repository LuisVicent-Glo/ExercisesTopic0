package com.javaglobant.lambdas.examples1;

import java.util.*;
import java.util.stream.Stream;

public class FirstExercise {
    public static void main(String[] args) {

        //Supplier
        Supplier<String> supplier = () -> {
            System.out.println("I am the Supplier");
            return "Hello!";
        };


        String s = supplier.get();
        System.out.println("String = "+ s);

        //Consumer
        Consumer<String> consumer = (String string) ->{
            System.out.println("I am the Consumer");
            System.out.println(string);
        };

        consumer.accept("Hello");




    }
}
