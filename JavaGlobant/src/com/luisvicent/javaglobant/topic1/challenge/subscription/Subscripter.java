package com.luisvicent.javaglobant.topic1.challenge.subscription;

public class Subscripter implements Observer{
    private String firstname;
    private String lastname;

    public Subscripter(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public void update(int id,String name,Price price) {
        System.out.println("New notification "+ firstname+" "+lastname+" the price for the product "+
                id+" called "+name+" it's: "+price.getPrice());
    }

}
