package com.luisvicent.javaglobant.topic0.challenge;

public class Memory {
    public String[][] memory = new String[20][10];

    // here assign the values by default
    public String[][] initialize(){
        for(int i = 0; i < memory.length; i++){
            for(int j = 0; j < memory[i].length; j++){
                memory[i][j] = "****";
            }
        }
        return memory;
    }

    // In this method we verify if the memory has space for other creation
    public int fullMemory(){
        int sum = 0;
        for(int i = memory.length-1; i >=0; i--){
            for(int j = memory[i].length-1; j >=0; j--){
                if(memory[i][j].equals("****")){
                    sum +=1;
                }

            }
        }
        return sum;
    }


    //In this method create the different types of process like application or system. But, before of create
    //the program verify if there are space doing a compare the range for the process with the space in the memory
    public void create(short randomSystem, char process, int id, int memoryCapacity) throws MemoryOverflowException{

        for(int i = memory.length - 1; i >= 0; i--){
            for (int j = memory[i].length - 1; j >= 0; j--){
                if (memoryCapacity > randomSystem){
                    while (randomSystem > 0){
                        if (memory[i][j] == "****"){
                            if(id < 10){
                                memory[i][j] = process+"00"+id;
                            }
                            else if (id >= 10 && id < 100){
                                memory[i][j] = process+"0"+id;
                            }
                            else {
                                memory[i][j] = process+String.valueOf(id);
                            }
                            randomSystem--;
                        }
                        break;
                    }

                }else {
                    throw new MemoryOverflowException("Sorry, the memory haven't space for this range");
                }
            }
        }
    }


    //In this method we read the Memory
    public void read(){
        for(int i = 0; i< memory.length; i++){
            for(int j = 0; j< memory[i].length; j++){
                System.out.print(memory[i][j]+" ");
            }
            System.out.println("\n");
        }
    }


    // In this method delete the process that we want to delete.
    public String[][] delete(String idDelete){
        String valueMemory = "";
        for(int i = memory.length -1; i >= 0; i--){
            String[] substractMemory;
            for (int j = memory[i].length -1; j >= 0; j--){
                valueMemory = memory[i][j];
                substractMemory = valueMemory.split("");
                String substractProcessMemory = substractMemory[2]+substractMemory[3];
                if(substractMemory[3].equals(idDelete)){
                    memory[i][j] =  "****";
                }else if (substractMemory[2] != "0" && substractProcessMemory.equals(idDelete)){
                    memory[i][j] =  "****";
                }else {
                    substractProcessMemory = substractMemory[1]+substractMemory[2]+substractMemory[3];
                    memory[i][j] = substractProcessMemory.equals(idDelete) ? "****": memory[i][j];
                }
            }
        }
        return memory;
    }
    
    //In this method compact the memory with it's values
    public void compact(int memoryCapacity){

        // create the variables that We're going to use
        memoryCapacity = (200 - memoryCapacity);
        int increment = 0;
        int iteradorPosition = 0;
        String[] tempo = new String[memoryCapacity];

        // Assign a variable the process different to ****
        for (int i = memory.length-1; i >= 0; i--){
            for (int j = memory[i].length -1; j >= 0; j--){
                if(memory[i][j] != "****"){
                    tempo[increment] = memory[i][j];
                    increment++;
                }
            }
        }

        //Rewrite the array with the values in the variable tempo and when the values finish assign "****" by complete
        // the others position
        for (int i = memory.length-1; i >= 0; i--){
            for (int j = memory[i].length -1; j >= 0; j--){
                if(increment > 0){
                    memory[i][j] = tempo[iteradorPosition];
                    increment--;
                    iteradorPosition++;
                }
                else {
                    memory[i][j]= "****";
                }
            }
        }
    }
}
