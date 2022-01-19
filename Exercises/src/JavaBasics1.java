import java.util.Scanner;

public class JavaBasics1 {
    public static void main(String[] args){
        System.out.println("Hello world");

        System.out.println("------------||------------");

        Scanner sc = new Scanner(System.in);
        CheckPass check = new CheckPass();
        System.out.println("Digita un número:");
        check.checkPass(sc.nextInt());

        System.out.println("------------||------------");
        ' '
                

        CheckOddOven checkOdd = new CheckOddOven();
        System.out.println("Digita un número");
        checkOdd.checkOddOven(sc.nextInt());

        System.out.println("------------||------------");
        PrintDayInWord printDay = new PrintDayInWord();
        System.out.println("Digita un número");
        printDay.printDayInWord(sc.nextInt());

    }
}
