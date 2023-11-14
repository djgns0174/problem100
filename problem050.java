package problem100;

import java.util.Scanner;

public class ex50{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bmi = scanner.nextDouble();

        String result = checkBMIStatus(bmi);
        System.out.println(result);

        scanner.close();
    }

    public static String checkBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "저체중";
        } else if (bmi >= 18.5 && bmi <= 23) {
            return "정상체중";
        } else {
            return "과체중";
        }
    }
}