package com.javaglobant.lambdas.examples1;


@FunctionalInterface
public interface Supplier<T> {
    T get();
}