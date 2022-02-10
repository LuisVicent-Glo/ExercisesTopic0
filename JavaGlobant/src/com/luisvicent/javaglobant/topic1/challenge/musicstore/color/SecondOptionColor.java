package com.luisvicent.javaglobant.topic1.challenge.musicstore.color;

public class SecondOptionColor implements Color{

    private final String OPTION2 = "Blue";
    @Override
    public void chooseColor() {
        System.out.println("You are choice the color : "+ OPTION2);
    }
}
