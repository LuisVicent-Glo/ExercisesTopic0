package com.luisvicent.javaglobant.topic1.challenge.hotdog;

public class PotatoChips extends HotDogDecorator{

    public PotatoChips(HotDog customerHotDog) {
        super(customerHotDog);
    }

    @Override
    public String makeHotDog() {
        return customerHotDog.makeHotDog();
    }

    public String addPotatoChips(){
        return " + hechele mas no sea duro :v, adding potato chips";
    }
}
