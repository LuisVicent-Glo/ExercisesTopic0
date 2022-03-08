package com.javaglobant.lambdas.examples2;

import com.javaglobant.lambdas.examples2.model.User;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class MoreLambdas2 {
    public static void main(String[] args) {

        User sarah = new User("Sarah", 34);
        User john = new User("John", 35);
        User jose = new User("Jose", 12);

        List<User> users = List.of(sarah, john, jose,john);
        List<String> names = new ArrayList<>();

        Function<User, String> toName = (User user) -> user.getName();
        for (User user: users){
            names.add(toName.apply(user));
        }

        Consumer<User> consumer = user -> System.out.println(user);
        users.forEach(consumer);

        Consumer<String> consumer1 = s -> System.out.println(s);
        names.forEach(consumer1);


        Comparator<Integer> cmp = (int1, int2)-> Integer.compare(int1, int2);

        int compared = cmp.compare(30, 5);
        System.out.println(compared);
        Collection<User> list = new ArrayList<>();

        System.out.println(names);

        list.add(jose);
        list.add(john);
        list.add(sarah);
        System.out.println(list.size());

        Iterator<User> iterator = list.iterator();

        while (iterator.hasNext()){
            User user = iterator.next();
            if (user.getAge() < 30){
                iterator.remove();
            }
        }
        System.out.println(list.size());



    }
}
