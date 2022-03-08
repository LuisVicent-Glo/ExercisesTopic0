package com.javaglobant.challenge;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PasswordCracker {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        System.out.println("How many cases do you want to do?");

        int i = scanner.nextInt();
        List<Integer> ite = Arrays.asList(new Integer[i]);


        ite.forEach(value ->{
            List<String> passwords = null;
            String loginAttempt = null;
            System.out.println("Enter the passwords of the application: ");
            passwords = List.of(sc.nextLine().toLowerCase().split(" "));
            System.out.println("Enter the passwords attempt for the test: ");
            loginAttempt = sc.nextLine().toLowerCase();

            List<String> firstStep = passwordCracker(passwords, loginAttempt);

            System.out.println(validation.apply(firstStep, loginAttempt));
        });



    }


    //This function subtract the words that are similar between passwords of the application and
    //passwords attempt for decode similitude and apply the concept recursive
     static List<String> passwordCracker(List<String> passwords, String loginAttempt){
        return passwords.stream()
                .filter(loginAttempt::startsWith)
                .flatMap(password ->
                        Stream.concat(Stream.of(password),
                                passwordCracker(passwords, loginAttempt.substring(password.length())).stream()))
                .toList();
    }

    //This function make a join a List
    static Function<List<String>, String> join = (List<String> password) -> {
        return password.stream().collect(Collectors.joining());
    };

    //This function make the validation of the Strings and return the value to the comparison
    static BiFunction<List<String>,String,String> validation = (passwords, loginAttempt) ->
    {

        String unionList = join.apply(passwords);
        boolean value = false;

        if (!passwords.isEmpty()){
            value = true;
        }

        if (value == true && unionList.equals(loginAttempt)){
            return passwords.stream().collect(Collectors.joining(" "));
        }

        return "WRONG PASSWORD";
    };
}


