package com.luisvicent.javaglobant.topic1.challenge.musicstore.battery;

public class FirstOptionBattery implements Battery{

    private final byte OPTIONBA1 = 5;

    @Override
    public String chooseBattery() {
        System.out.println("You are choise a Battery of "+ OPTIONBA1 +" hours");
        return null;
    }
}
