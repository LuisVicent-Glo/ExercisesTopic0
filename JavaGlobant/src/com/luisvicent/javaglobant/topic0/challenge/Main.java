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
            System.out.println("Bienvenido, a continuacion veras el menu donde podras hacer uso de la memoria");
            System.out.println("1. Para crear un nuevo proceso de sistema puede oprimir la tecla \"c\"+s");
            System.out.println("2. Para crear un nuevo proceso de aplicacion puede oprimir la tecla \"c\"+a");
            System.out.println("3. Para eliminar un proceso de la memoria puede oprimir la tecla \"d\"+ mas el id del proceso");
            System.out.println("4.Para salir solo presione la tecla e");
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
            else if(decition == "e"){
                exit = false;
                break;
            }

            //see memory
            memory.read();



        }while (exit == true);
    }

}
