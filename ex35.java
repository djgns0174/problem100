package java_ex100;
import java.util.Scanner;

public class ex35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int evenSum = 0;

        for(int i = 1; i <=n;i++)
        {
            if(i%2 ==0){
                evenSum += i;
            }
        }

        System.out.println(evenSum);
        sc.close();
    }


}