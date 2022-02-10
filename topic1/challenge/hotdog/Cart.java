package com.luisvicent.javaglobant.topic1.challenge.hotdog;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            HotDog hotDog = new SimpleHotDog();
            String choose;
            do {
                System.out.println("Welcome at the Hot Dog cart. \n" +
                        "Would you like any addition by your HotDog?");
                System.out.println("This is a menu.\n" +
                        "1. Press 1 by add Bacon\n2. Press 2 by add pineapple\n" +
                        "3. Press 3 by add Sauces\n4. Press 4 by add potato chips\n" +
                        "5. Press 0 by exit to the program ");
                choose = sc.nextLine();

                if (choose.equals("1")){
                    hotDog = new Bacon(hotDog);
                }else if (choose.equals("2")) {
                    hotDog = new PineApple(hotDog);
                }else if (choose.equals("3")){
                    hotDog = new Sauces(hotDog);
                }else if (choose.equals("4")){
                    hotDog = new PotatoChips(hotDog);
                }else if (choose.equals("0")) {
                    System.out.println("Let's us a moment your order are already in few minutes...");
                } else{
                    System.out.println("adding Invalid");
                }


            }while (!choose.equals("0"));

            System.out.println("Your Hot Dog is: "+hotDog.makeHotDog());
        }catch (Exception e){
            e.getMessage();
        }

    }
}
