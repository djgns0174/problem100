package problem100;
import java.util.Scanner;
public class problem014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        System.out.printf("%d:%d",hour, minute);
        sc.close();
    }

}