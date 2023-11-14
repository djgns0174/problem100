package problem100;

import java.util.Scanner;

public class problem070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int result = a*(int)Math.pow(d,n-1);
        System.out.printf("%d",result);
        sc.close();
    }
}
