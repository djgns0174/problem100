package problem100;
import java.util.Scanner;

public class problem067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}

