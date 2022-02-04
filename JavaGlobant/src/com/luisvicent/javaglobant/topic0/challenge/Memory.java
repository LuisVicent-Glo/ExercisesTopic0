package com.luisvicent.javaglobant.topic0.challenge;

import java.util.Collection;
import java.util.Collections;

public class Memory {
    public String[][] MEMORY = new String[20][10];


    public String[][] initialize(){
        for(int i = 0; i < MEMORY.length; i++){
            for(int j = 0; j < MEMORY[i].length; j++){
                MEMORY[i][j] = "****";
            }
        }
        return MEMORY;
    }

    public void create(short randomSystem, char process, int id){

        for(int i = MEMORY.length - 1; i >= 0; i--){
            for (int j = MEMORY[i].length - 1; j >= 0; j--){
                while (randomSystem > 0){
                    if (MEMORY[i][j] == "****"){
                        if(id < 9){
                            MEMORY[i][j] = process+"00"+id;
                        }
                        else if (id >= 10 && id < 100){
                            MEMORY[i][j] = process+"0"+id;
                        }
                        else {
                            MEMORY[i][j] = process+String.valueOf(id);
                        }
                        randomSystem--;
                    }
                    break;
                }
            }
        }
    }

    public void read(){
        for(int i = 0; i<MEMORY.length;i++){
            for(int j = 0; j<MEMORY[i].length;j++){
                System.out.print(MEMORY[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

    public String[][] delete(String idDelete){
        String valueMemory = "";
        for(int i = MEMORY.length -1; i >= 0; i--){
            String[] substractMemory;
            for (int j = MEMORY[i].length -1; j >= 0; j--){
                valueMemory = MEMORY[i][j];
                substractMemory = valueMemory.split("");
                if (substractMemory[3].equals(idDelete)){
                    MEMORY[i][j] = "****";

                }
            }
        }
        return MEMORY;
    }
    public void compact(){

    }
}
