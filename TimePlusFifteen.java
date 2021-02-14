package ConditionalStatementsExercise;

import java.util.Scanner;

public class TimePlusFifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        minutes = minutes + 15;

        if(minutes > 59 && minutes < 70){
            hours++;
            System.out.printf("%d:0%d", hours, minutes-60);
        }
        else if(hours == 24 || hours == 0){
            hours = 0;
            System.out.printf("%d0:%d", hours, minutes);
        }
        else if(minutes < 10){
            System.out.printf("%d:0%d", hours, minutes);
        }
        else{
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}
