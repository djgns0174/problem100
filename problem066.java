package problem100;
import java.util.Scanner;

public class problem066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (sum < n) {
            sum += i;
            i++;
        }

        System.out.println(sum);

        scanner.close();
    }
}
