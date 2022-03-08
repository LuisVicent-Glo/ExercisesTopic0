package com.javaglobant.lambdas.chaininglambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ChainComparator {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two","three","four","five","six","seven","eight","nine");

        Comparator<String> cmp = (s1, s2)-> s1.compareTo(s2);

        strings.sort(cmp);
        System.out.println(strings);

        ToIntFunction<String> toLength = s -> s.length();

        Comparator<String> cmp1 = Comparator.comparingInt(toLength);

        strings.sort(cmp1);
        System.out.println(strings);
    }
}
