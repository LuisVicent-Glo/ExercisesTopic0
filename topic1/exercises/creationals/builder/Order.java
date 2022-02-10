package com.luisvicent.javaglobant.topic1.exercises.creationals.builder;

public class Order {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("pan").condiments("moztaza").condiments("mayonesa");

        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getMeat());

        builder.bread("carne");

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getMeat());
    }
}
