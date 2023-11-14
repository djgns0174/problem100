package problem100;
import java.util.Scanner;

public class problem018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = str.charAt(0);
        int num = (int)c;

        System.out.printf("%d", num);
        sc.close();
    }

}