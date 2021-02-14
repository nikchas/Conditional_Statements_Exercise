package ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondPerMeter = Double.parseDouble(scanner.nextLine());

        double ivanV = distance / secondPerMeter;
        int additionalTime = (int) (distance / 15);
        double ivanT = (distance / ivanV) + additionalTime;

        if(ivanT < worldRecord){
            System.out.printf("No, he failed! He was %.2f seconds slower.", worldRecord - ivanT);
        }
        if(ivanT > worldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanT);
        }
    }
}
