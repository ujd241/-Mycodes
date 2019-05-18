package practicecodes;

import java.util.Scanner;

public class SwapBitwise {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" enter any two numbers to swap ");

        int num1=scan.nextInt();
        int num2=scan.nextInt();

        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;

        System.out.println("swapped numbers are:--> " + num1 + " : " + num2 );


    }
}
