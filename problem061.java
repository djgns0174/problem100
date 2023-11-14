package problem100;

import java.util.Scanner;

public class problem061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();

        char operator = scanner.next().charAt(0);

        int num2 = scanner.nextInt();

        double result = 0.0;  

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = (double) num1 / num2;
                } 
                break;
        }
        System.out.printf("계산 결과: %.2f\n", result);

        scanner.close();
    }
}
