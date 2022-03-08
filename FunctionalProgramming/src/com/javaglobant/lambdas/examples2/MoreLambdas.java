package com.javaglobant.lambdas.examples2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MoreLambdas {
    public static void main(String[] args) {

        List<String> list  = new ArrayList<>(
                List.of("One", "Two", "Three", "Four", "Five"));

        Predicate<String> filter = (String string) -> string.startsWith("T");
        list.removeIf(filter);

        Consumer<String> consumer = (String string) -> System.out.println(string);
        list.forEach(consumer);

    }
}
