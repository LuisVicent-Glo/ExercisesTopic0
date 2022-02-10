package com.luisvicent.javaglobant.topic1.challenge.musicstore.color;

public class FirstOptionColor implements Color{
    private final String OPTION1 = "Green";
    @Override
    public void chooseColor() {
        System.out.println("You are choice the color : "+OPTION1);
    }
}
