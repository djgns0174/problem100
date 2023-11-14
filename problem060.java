package problem100;

import java.util.Scanner;

public class problem060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[] = {0,0,0};
        for(int i=0; i<3; i++){
            arr[i] = scanner.nextInt();
        }
        
        boolean pass = true;
        for(int i=0; i<3; i++){
            if(arr[i] <= 170){
                System.out.println("CRASH "+ arr[i]);
                pass = false;
                break;
            }
        }

        if(pass) System.out.println("PASS");

        scanner.close();
    }
}
