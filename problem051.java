package problem100;
import java.util.Scanner;

public class problem051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int compactedTrash = (n % 10) * 10 + ((n / 10) * 2);

        System.out.println(compactedTrash);

        if (compactedTrash <= 50) {
            System.out.println("GOOD");
        } else {
            System.out.println("OH MY GOD");
        }

        scanner.close();
    }
}
