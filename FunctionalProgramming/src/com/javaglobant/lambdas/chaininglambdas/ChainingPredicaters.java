package com.javaglobant.lambdas.chaininglambdas;


import java.util.function.Predicate;

public class ChainingPredicaters {
    public static void main(String[] args) {
        Predicate<String> isNull = s -> s == null;

        System.out.println("For null: "+isNull.test(null));
        System.out.println("For empty: "+isNull.test(""));
        System.out.println("For Hello: "+ isNull.test("Hello"));



        Predicate<String> isEmpty = e -> e.isEmpty();
        //System.out.println("For null: "+isEmpty.test(null));
        System.out.println("For empty: "+isEmpty.test(""));
        System.out.println("For Hello: "+isEmpty.test("Hello"));


        Predicate<String> p = isNull.negate().and(isEmpty.negate());
        System.out.println("For null: "+p.test(null));
        System.out.println("For empty: "+p.test(""));
        System.out.println("For Hello: "+ p.test("Hello"));


    }
}
