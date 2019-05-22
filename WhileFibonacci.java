package practicecodes;

import java.util.Scanner;

public class WhileFibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter how many numbers of fibonacci series you need ");

        int count = scan.nextInt();
        scan.close();
        int num1 = 0, num2 = 1, i = 1;


        while (i <= count) {

            System.out.print(num1 + " ");
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
            i++;

        }
    }


}
