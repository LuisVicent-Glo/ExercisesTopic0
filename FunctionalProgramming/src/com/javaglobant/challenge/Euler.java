package com.javaglobant.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Euler {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How cases do you want to do?");
        int i = sc.nextInt();

        List<Double> ite = Arrays.asList(new Double[i]);

        ite.forEach(value -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nEnter the number that you want evaluate in this occasion: ");
            double number = scanner.nextDouble();
            System.out.printf("The result of the evaluation is: %.4f\n", evaluate.apply(number, 9));
        });
    }

    static Integer factorial(Integer integer){
        if (integer == 1){
            return integer;
        }

        return integer * Euler.factorial(integer-1);
    }

    static BiFunction<Double, Integer, Double> power = (x, y)->{
        if (y == 0){
            return 1.0;
        }
        return (x * Euler.power.apply(x, y-1));
    };

    static BiFunction<Double, Integer, Double> evaluate = (x, y) -> {
        if (y == 0){
            return 1.0;
        }
        return Euler.power.apply(x, y)/ Euler.factorial(y) + Euler.evaluate.apply(x,y-1);
    };


}
