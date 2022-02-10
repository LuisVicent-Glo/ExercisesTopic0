package com.luisvicent.javaglobant.topic1.challenge.hotdog;

public class Sauces extends HotDogDecorator{
    public Sauces(HotDog customerHotDog) {
        super(customerHotDog);
    }

    @Override
    public String makeHotDog() {
        return customerHotDog.makeHotDog()+addSauces();
    }

    public String addSauces(){
        return " + adding Sauces... praaa mostaza, praa tomato and more";
    }
}
