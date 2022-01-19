public class CheckOddOven {
    public void checkOddOven(int test){
        int number = test;
        String value = "";
        if(number % 2 == 1){
            value = "Odd Number";
        }
        else {
            value = "Even Number";
        }
        System.out.println("The number is "+ value);
        System.out.println("bye");
    }
}
