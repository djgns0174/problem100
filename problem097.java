package problem100;
import java.util.Arrays;
import java.util.Scanner;

public class problem097 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int c = scanner.nextInt();

        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        Arrays.sort(heights);

        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(heights[i] + " ");
            count++;

            if (count == c) {
                System.out.println();
                count = 0;
            }
        }

        scanner.close();
    }
}