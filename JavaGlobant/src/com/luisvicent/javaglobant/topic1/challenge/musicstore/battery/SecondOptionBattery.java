package com.luisvicent.javaglobant.topic1.challenge.musicstore.battery;

public class SecondOptionBattery implements Battery{
    private final byte OPTIONBA2 = 8;

    @Override
    public String chooseBattery() {
        System.out.println("You are choise a Battery of "+ OPTIONBA2 +" hours");
        return null;
    }
}
