package com.luisvicent.javaglobant.topic1.challenge.subscription;

import java.util.ArrayList;
import java.util.List;

public class NotifierFirstProduct implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyUpdate(Price price) {
        for (Observer observer: observers){
            observer.update(1,"Huawei Y20", price);
        }
    }
}
