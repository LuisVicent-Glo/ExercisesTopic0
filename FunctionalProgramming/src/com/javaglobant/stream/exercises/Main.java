package com.javaglobant.stream.exercises;

import com.javaglobant.stream.exercises.Model.User;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        User user = new User("Jorge");
        String userName = getUserName.apply(user);
        System.out.println(userName);
    }

    public static Function<User, String> getUserName = (user) ->{
      return user.getName();
    };
}
