package com.javaglobant.lambdas.examples1;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
