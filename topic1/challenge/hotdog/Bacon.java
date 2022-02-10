package com.luisvicent.javaglobant.topic1.challenge.hotdog;

public class Bacon extends HotDogDecorator{

    public Bacon(HotDog customerHotDog){
        super(customerHotDog);
    }

    @Override
    public String makeHotDog() {
        return super.makeHotDog() + addBacon();
    }

    public String addBacon(){
        return "+ adding Bacon";
    }
}
