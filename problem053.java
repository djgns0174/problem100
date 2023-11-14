package problem100;
import java.util.Scanner;

public class problem053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double sum = a + b;
        double subtract1 = a - b;
        double subtract2 = b - a;
        double multiply = a * b;
        double divide1 = a / b;
        double divide2 = b / a;
        double power1 = Math.pow(a, b);
        double power2 = Math.pow(b, a);

        double maxResult = Math.max(sum, Math.max(subtract1, Math.max(subtract2, Math.max(multiply, Math.max(divide1, Math.max(divide2, Math.max(power1, power2)))))));

        System.out.printf("%.6f%n", maxResult);

        scanner.close();
    }
}
