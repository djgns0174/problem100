package problem100;

import java.util.Scanner;

public class problem064 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d", a%b);
        sc.close();
    }
}
