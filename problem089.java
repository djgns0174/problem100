package problem100;
import java.util.Scanner;

public class problem089 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.printf("%d %d\n",i,n-i);
        }
    }
}

