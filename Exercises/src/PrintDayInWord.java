public class PrintDayInWord {
    public void printDayInWord(int day){
        int number = day;

        switch(number){
            case 0:
                System.out.println("The day is Monday");
                break;
            case 1:
                System.out.println("The day is Tuesday");
                break;
            case 2:
                System.out.println("The day is Wednesday");
                break;
            case 3:
                System.out.println("The day is Thursday");
                break;
            case 4:
                System.out.println("The day is Friday");
                break;
            case 5:
                System.out.println("The day is Saturday");
                break;
            case 6:
                System.out.println("The day is Sunday");
                break;
            default:
                System.out.println("Not a valid day");
                break;
        }
    }
}
