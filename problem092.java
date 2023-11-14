package problem100;
import java.util.Scanner;

public class problem092 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        int k = scanner.nextInt();

        System.out.println(numbers[k - 1]);

        scanner.close();
    }
}
