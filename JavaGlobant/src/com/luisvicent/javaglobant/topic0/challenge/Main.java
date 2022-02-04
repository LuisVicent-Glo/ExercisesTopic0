package com.luisvicent.javaglobant.topic0.challenge;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        Random rd = new Random();
        int id = 1;


        //insert "****" to memory
        Memory memory = new Memory();
        memory.initialize();




        do {
            System.out.println("Digite uno para crear una aplicacion de sistema o 2 para una aplicacion o 4 para salir");
            String decition = sc.nextLine();
            String[] substract = decition.split("");

            if (substract[1].equals("s")){
                short randomSystem = (short) rd.nextInt(5, 15);
                memory.create(randomSystem, 's', id);
                exit = true;
                id++;
            }
            else if(substract[1].equals("a")){
                short randomApplication = (short) rd.nextInt(10, 20);
                memory.create(randomApplication, 'a', id );
                exit = true;
                id++;
            }
            else if (substract[0].equals("d")){
                String idDelete = "";
                if (substract.length > 1){
                    for (int i = 1; i < substract.length; i++){
                        idDelete += substract[i];
                    }
                }
                else {
                    idDelete = substract[1];
                }
                memory.delete(idDelete);
                memory.compact();
            }
            else if(decition == "exit"){
                exit = false;
                break;
            }

            //see memory
            memory.read();



        }while (exit == true);
    }

}
