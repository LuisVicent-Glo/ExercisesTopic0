package com.luisvicent.javaglobant.topic1.challenge.subscription;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        NotifierFirstProduct productOne = new NotifierFirstProduct();
        NotifierSecondProduct productSecond = new NotifierSecondProduct();
        NotifierThirdProduct productThird = new NotifierThirdProduct();

        Subscripter client1 = new Subscripter("Erica", "Prado");
        Subscripter client2 = new Subscripter("Luis", "Vicent");

        productOne.subscribe(client2);
        productOne.subscribe(client1);
        productOne.notifyUpdate(new Price(900.000));
        System.out.println();

        Subscripter client3 = new Subscripter("Alejandro", "Peña");

        productSecond.subscribe(client3);
        productSecond.notifyUpdate(new Price(1200000));
        System.out.println();

        productThird.subscribe(client2);
        productOne.unsubscribe(client2);

        productOne.notifyUpdate(new Price(1000000));
        productSecond.notifyUpdate(new Price(9500000));
        productThird.notifyUpdate(new Price(1200000));




    }
}
