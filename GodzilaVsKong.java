package ConditionalStatementsExercise;

import java.util.Scanner;

public class GodzilaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int amountStatists = Integer.parseInt(scanner.nextLine());
        double clothesPerStatist = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;
        double sumClothes = amountStatists * clothesPerStatist;
        double totalPrice = decor + sumClothes;

        double discount = sumClothes * 0.1;

        if (amountStatists > 150){

            sumClothes = sumClothes - discount;
            double allSum = decor + sumClothes;
            if (budget >= allSum){
                System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budget - allSum);
            }
            else {
                System.out.printf("Not enough money!%nWingard needs %.2f leva more.", allSum - budget);
            }
        }
        if (amountStatists <= 150){
            double allSum = decor + sumClothes;
            if (budget >= allSum){
                System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budget - allSum);
            }
            else {
                System.out.printf("Not enough money!%nWingard needs %.2f leva more.", allSum - budget);
            }
        }
    }
}
