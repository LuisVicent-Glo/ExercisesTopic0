package com.luisvicent.javaglobant.topic1.challenge.musicstore.capacity;

public class FirstOptionCapacity implements Capacity{
    private final byte OPTIONCA1 = 8;
    @Override
    public void chooseCapacity() {
        System.out.println("You choise a capacity of "+ OPTIONCA1+"GB");
    }
}
