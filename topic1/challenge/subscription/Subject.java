package com.luisvicent.javaglobant.topic1.challenge.subscription;

public interface Subject {
    public void subscribe(Observer observer);

    public void unsubscribe(Observer observer);

    public void notifyUpdate(Price price);
}
