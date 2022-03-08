package com.javaglobant.lambdas.examples2;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
