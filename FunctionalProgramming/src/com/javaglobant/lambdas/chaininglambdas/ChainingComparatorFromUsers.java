package com.javaglobant.lambdas.chaininglambdas;

import com.javaglobant.lambdas.examples2.model.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ChainingComparatorFromUsers {
    public static void main(String[] args) {
        User sarah = new User("Sarah", 24);
        User john1 = new User("John", 25);
        User john2 = new User("John", 23);
        User jose = new User("Jose", 26);

        List<User> users = Arrays.asList(sarah, john1, john2, jose);

        System.out.println(users);

        Comparator<User> cmp = Comparator.comparing(user -> user.getName());
        Comparator<User> cmp2 = Comparator.comparing(user -> user.getAge());
        Comparator<User> comparator = cmp.thenComparing(cmp2);

        users.sort(comparator);



        users.forEach(user -> System.out.println(user));
    }
}
