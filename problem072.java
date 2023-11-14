package problem100;
import java.util.Scanner;

public class problem072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);

        scanner.close();
    }
}
