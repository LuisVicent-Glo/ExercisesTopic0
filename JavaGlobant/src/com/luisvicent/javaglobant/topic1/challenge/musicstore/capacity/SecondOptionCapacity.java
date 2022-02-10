package com.luisvicent.javaglobant.topic1.challenge.musicstore.capacity;

public class SecondOptionCapacity implements Capacity{
    private final byte OPTIONCA2 = 16;

    @Override
    public void chooseCapacity() {
        System.out.println("You choise a capacity of "+ OPTIONCA2+"GB");
    }
}
