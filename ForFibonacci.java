package practicecodes;

import java.util.Scanner;

public class ForFibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" How many number you want in the sequence ");

        int count = scan.nextInt();
        int num1 = 0, num2 = 1;

        System.out.println(" sequence is ");

        for (int i = 1; i <=count; i++) {

            System.out.println(num1+ " ");

            int next = num1 + num2;
            num1 = num2;
            num2 = next;

            
        }


    }


}
