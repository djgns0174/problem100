package problem100;
import java.util.Scanner;

public class problem052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number >= 1 && number <= 9) {
            if (number == 1) {
                System.out.println(number + "st");
            } else if (number == 2) {
                System.out.println(number + "nd");
            } else if (number == 3) {
                System.out.println(number + "rd");
            } else {
                System.out.println(number + "th");
            }
        }
        else if (number >= 11 && number <= 19) {
            System.out.println(number + "th");
        }
        else {
            int lastDigit = number % 10;
            if (lastDigit == 1) {
                System.out.println(number + "st");
            } else if (lastDigit == 2) {
                System.out.println(number + "nd");
            } else if (lastDigit == 3) {
                System.out.println(number + "rd");
            } else {
                System.out.println(number + "th");
            }
        }

        scanner.close();
    }
}
