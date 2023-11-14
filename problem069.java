package problem100;
import java.util.Scanner;

public class problem069 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        System.out.printf("%d", a+(n-1)*d);
        sc.close();
    }
}
