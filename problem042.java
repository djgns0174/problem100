package problem100;
import java.util.Scanner;

public class problem042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();


        if ((length >=50 && length <=70)||(length % 6 == 0))
        {
            System.out.print("win");
        }
        else
        {
            System.out.print("lose");
        }

        sc.close();


    }
}
