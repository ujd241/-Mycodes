package practicecodes;

import java.util.Scanner;

public class ForPrimenumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter any number above 3 to check prime number");

        int num = scan.nextInt();
        boolean isPrime = true;


        for (int i = 2; i <= num / 2; i++) {
            int temp = num % 2;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.print(num + " is prime number");
        else
            System.out.println(" not a prime number");


    }

}
