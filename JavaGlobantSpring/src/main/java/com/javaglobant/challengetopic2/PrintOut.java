package com.javaglobant.challengetopic2;

import com.javaglobant.challengetopic2.repository.PrintersRepositoryImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PrintOut {
    public static void main(String[] args) {



        PrintersRepositoryImpl printersReposirtory = new PrintersRepositoryImpl();
        int count = printersReposirtory.findPrinters().toArray().length;
        int decitionPrinter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome, press 1. by print to color " +
                "or press 2. by print to black and white");
        int decitionType = sc.nextInt();
        List<String> options = new ArrayList<String>();
        List<String> message = new ArrayList<String>();


        if(decitionType == 1 && decitionType >= 0){
            for (int i = 0; i < count; i++){
                if(printersReposirtory.findPrinters().get(i).isCOLOR() == true){
                    options.add((i+1)+". "+printersReposirtory.findPrinters().get(i).getNAME());
                    message.add(printersReposirtory.findPrinters().get(i).printOut());
                }
            }
        }
        else if(decitionType == 2 && decitionType >=0 ){
            for (int i = 0; i < count; i++){
                if(printersReposirtory.findPrinters().get(i).isBLACKANDWHITE() == true){
                    options.add((i+1)+". "+printersReposirtory.findPrinters().get(i).getNAME());
                    message.add(printersReposirtory.findPrinters().get(i).printOut());
                }
            }
        }



        System.out.println("There are these printer available");
        for (String data: options){
            System.out.println(data);
        }

        System.out.println("Choose one");

        decitionPrinter = sc.nextInt() - 1;
        if (decitionPrinter <= (options.toArray().length -1) && decitionPrinter >= 0){
            System.out.println(message.get(decitionPrinter));
        }

    }
}
