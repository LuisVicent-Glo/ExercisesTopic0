package com.luisvicent.javaglobant.topic0.challenge;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        try {

            Scanner sc = new Scanner(System.in);
            boolean exit = false;
            Random rd = new Random();
            int id = 1;
            int memoryCapacity = 200;

            //insert "****" to memory
            Memory memory = new Memory();
            memory.initialize();

            do {


                System.out.println("Welcome, to next you will see the menu where can make use of the memory");
                System.out.println("- To create a new process of system you can type cs");
                System.out.println("- To create a new process of application you can type ca");
                System.out.println("- To delete a process of the memory you can press type \"delete\" + the id of the process");
                System.out.println("- To exit only press 1 by exit of the program");
                String decition = sc.nextLine();
                String[] substract = new String[decition.length()];

                if (decition.length() > 1){
                    substract = decition.split("");
                }

                if (decition.equals("cs")){
                    short randomSystem = (short) rd.nextInt(5, 15);
                    memory.create(randomSystem, 's', id, memoryCapacity);
                    exit = true;
                    memoryCapacity = memory.fullMemory();
                    id++;
                }
                else if(decition.equals("ca")){
                    memoryCapacity = memory.fullMemory();
                    short randomApplication = (short) rd.nextInt(10, 20);
                    memory.create(randomApplication, 'a', id, memoryCapacity);
                    exit = true;
                    id++;
                }
                else if(decition.equals("1")){
                    System.out.println("Thank you for use this program, Bye!");
                    exit = false;
                    break;

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
                    memoryCapacity = memory.fullMemory();
                    memory.compact(memoryCapacity);
                    exit = true;
                }
                else {
                    System.out.println("Word not process no identify");
                    exit = true;
                }

                //see memory
                memory.read();

                memoryCapacity = memory.fullMemory();


            }while (exit == true);


        } catch (MemoryOverflowException e) {
            System.out.println(e.getMessage());
        } catch (Exception ex){
            System.out.println("Error in the program "+ ex.getMessage());
        }
    }

}
