package com.luisvicent.javaglobant.topic1.challenge.hotdog;

public class PineApple extends HotDogDecorator{
    public PineApple(HotDog customerHotDog) {
        super(customerHotDog);
    }

    @Override
    public String makeHotDog() {
        return customerHotDog.makeHotDog()+addPineApple();
    }

    public String addPineApple(){
        return " + adding pineapple, tab, tab, tab, cut the pineapple. pri pra tongeo";
    }
}
