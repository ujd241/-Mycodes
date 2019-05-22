package practicecodes;

import java.util.Scanner;

public class ForPrimenumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter any number above 3 to check prime number");

        int num = scan.nextInt();

        int count = 0;// to count the numbers which divides the given number
        for (int i = 1; i <= num; i++) {
            int temp = num % i;
            if (temp == 0) {
                count++;
            }
        }

        if (count == 2)
            System.out.print(num + " is prime number");
        else
            System.out.println(" not a prime number");


    }
}
