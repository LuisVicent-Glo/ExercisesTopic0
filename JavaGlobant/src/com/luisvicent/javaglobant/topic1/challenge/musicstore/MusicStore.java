package com.luisvicent.javaglobant.topic1.challenge.musicstore;

import com.luisvicent.javaglobant.topic1.challenge.musicstore.battery.FirstOptionBattery;
import com.luisvicent.javaglobant.topic1.challenge.musicstore.battery.SecondOptionBattery;
import com.luisvicent.javaglobant.topic1.challenge.musicstore.capacity.FirstOptionCapacity;
import com.luisvicent.javaglobant.topic1.challenge.musicstore.capacity.SecondOptionCapacity;
import com.luisvicent.javaglobant.topic1.challenge.musicstore.color.FirstOptionColor;
import com.luisvicent.javaglobant.topic1.challenge.musicstore.color.SecondOptionColor;
import com.luisvicent.javaglobant.topic1.challenge.musicstore.factory.BuildReproductor;
import com.luisvicent.javaglobant.topic1.challenge.musicstore.factory.Reproductive;

import java.util.Scanner;

public class MusicStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit =false;

        Reproductive reproductive = new BuildReproductor();

        do {
            System.out.println("Hello you're going to buy a reproductive\n" +
                    "So, go to personalize.");
            System.out.println("The first option is colour. So, What do you prefer Green(Press 1) " +
                    "or Blue(Press 2)");
            int optionColour = sc.nextInt();
            if (optionColour == 1){
                reproductive.chooseColor(new FirstOptionColor()).chooseColor();
            }else if (optionColour == 2){
                reproductive.chooseColor(new SecondOptionColor()).chooseColor();
            }else {
                exit = false;
                System.out.println("Option Invalid");
                continue;
            }

            System.out.println("The second option is battery. So, What do you prefer 5(Press 1) " +
                    "or 8(Press 2) hours");

            int optionBattery = sc.nextInt();
            if (optionBattery == 1){
                reproductive.chooseBattery(new FirstOptionBattery()).chooseBattery();
            }else if (optionBattery == 2){
                reproductive.chooseBattery(new SecondOptionBattery()).chooseBattery();
            }else {
                exit = false;
                System.out.println("Option Invalid");
                continue;
            }

            System.out.println("The third option is capacity. So, What do you prefer 8(Press 1) " +
                    "or 16(Press 2) GBs");

            int optionCapacity= sc.nextInt();
            if (optionCapacity == 1){
                reproductive.chooseCapacity(new FirstOptionCapacity()).chooseCapacity();
            }else if (optionCapacity == 2){
                reproductive.chooseCapacity(new SecondOptionCapacity()).chooseCapacity();
            }else {
                exit = false;
                System.out.println("Option Invalid");
                continue;
            }

            exit = true;

        }while (exit == false);

        System.out.println("Your reproductive it's already with your options");

    }
}
