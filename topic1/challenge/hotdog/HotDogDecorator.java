package com.luisvicent.javaglobant.topic1.challenge.hotdog;

public abstract class HotDogDecorator implements HotDog{
    protected HotDog customerHotDog;

    public HotDogDecorator(HotDog customerHotDog){
        this.customerHotDog = customerHotDog;
    }

    @Override
    public String makeHotDog() {
        return customerHotDog.makeHotDog();
    }
}
