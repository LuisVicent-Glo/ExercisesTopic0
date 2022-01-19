public class CheckPass {
    public void checkPass(int number){
        int mark = number;
        String answer = "";

        if(mark >= 50){
            answer = "PASS";
        }
        else {
            answer = "FAIL";
        }

        System.out.println("The mark is "+ answer);

    }
}
