package ConditionalStatementsExercise;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.nextLine());
        String inputName = scanner.nextLine();
        String outputName = scanner.nextLine();

        if(inputName.equals("mm")){
           if(outputName.equals("m")){
                double result = amount / 1000;
                System.out.printf("%.3f", result);
            }
            if(outputName.equals("cm")){
                double result = amount / 10;
                System.out.printf("%.3f", result);
            }
        }

        if(inputName.equals("cm")){
            if(outputName.equals("mm")){
                double result = amount / 0.1;
                System.out.printf("%.3f", result);
            }
            if(outputName.equals("m")){
                double result = amount / 100;
                System.out.printf("%.3f", result);
            }
        }
        if(inputName.equals("m")){
            if(outputName.equals("cm")){
                double result = amount * 100;
                System.out.printf("%.3f", result);
            }
            if(outputName.equals("mm")){
                double result = amount * 1000;
                System.out.printf("%.3f", result);
            }
        }



    }
}
